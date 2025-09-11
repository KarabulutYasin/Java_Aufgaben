package de.a.fundamentals.b.eigeneMethoden;

import de.a.fundamentals.b.eigeneMetoden.EigeneMethoden;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class EigeneMethodenTest {

    @Test
    void declared_methods_exists(){
        String[] methodenNamen = {"mult","multByTwo","nope"};
        Class<?>[] returnValue= {int.class,int.class,void.class};
        Class<?>[][] parameter = {{int.class,int.class},{int.class},{}};
        int i = 0;
        try {
            for(i = 0; i < methodenNamen.length; i++){
                Method currentMethode = EigeneMethoden.class.getDeclaredMethod(methodenNamen[i],parameter[i]);
                assertEquals(returnValue[i],currentMethode.getReturnType(),methodenNamen[i] +" should return " + returnValue[i] + " but returned " + currentMethode.getReturnType());
            }
        }catch (Exception e){
            fail("Method:  " + methodenNamen[i] + " with parameter " + Arrays.deepToString(parameter[i])+ " doesnt exist");
        }
    }

//    @Test
//    void mult_should_multiply(){
//        int result = 0;
//        try {
//            EigeneMethoden clazz = EigeneMethoden.class.getDeclaredConstructor().newInstance();
//            Method multMethod = EigeneMethoden.class.getDeclaredMethod("mult", int.class, int.class);
//            multMethod.setAccessible(true);
//            result =(int) multMethod.invoke(clazz,1,2);
//            assertEquals(1*2, result);
//        }catch (Exception e){
//            fail("mult returned wrong result \nExpected was: " + 1*2 + "\nbut returned: " + result);
//        }
//    }
}
