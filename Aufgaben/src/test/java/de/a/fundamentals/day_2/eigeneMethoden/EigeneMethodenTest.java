package de.a.fundamentals.day_2.eigeneMethoden;

import de.a.fundamentals.day_2.EigeneMethoden.EigeneMethoden;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EigeneMethodenTest {

    @ParameterizedTest
    @MethodSource("methodenDaten")
    void declared_methods_exists(String methodenName, Class<?> returnType, Class<?>[] parameter) {
        assertDoesNotThrow(() -> {
            Method methode = EigeneMethoden.class.getDeclaredMethod(methodenName, parameter);
            assertNotNull(methode, "Methode: " + methodenName + " mit Parameter " + Arrays.deepToString(parameter) + " existiert nicht");
            assertEquals(returnType, methode.getReturnType(), "Methode: " + methodenName + " hat nicht den Rückgabetyp: " + returnType);
        });
    }

    private static Stream<Arguments> methodenDaten() {
        return Stream.of(
            Arguments.of("mult", int.class, new Class<?>[]{int.class, int.class}),
            Arguments.of("multByTwo", int.class, new Class<?>[]{int.class}),
            Arguments.of("nope", void.class, new Class<?>[]{})
        );
    }

    @ParameterizedTest
    @CsvSource({"1,2", "0,0", "-1,5", "-3,-7", "100,200"})
    void mult_should_multiply(int x,int y){
        assertDoesNotThrow(()-> {
            Constructor constructor = EigeneMethoden.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            EigeneMethoden obj =(EigeneMethoden) constructor.newInstance();

            Method multMethod = EigeneMethoden.class.getDeclaredMethod("mult", int.class, int.class);
            multMethod.setAccessible(true);

            int result = (int) multMethod.invoke(obj, x, y);

            assertEquals(x*y, result);
        });
    }

    @ParameterizedTest
    @CsvSource({"1","0","-1","100","2147483647","-2147483648"})
    void multByTwo_should_multiply_with_two(int x){
        assertDoesNotThrow(()-> {
            Constructor constructor = EigeneMethoden.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            EigeneMethoden obj =(EigeneMethoden) constructor.newInstance();

            Method multByTwoMethod = EigeneMethoden.class.getDeclaredMethod("multByTwo", int.class);
            multByTwoMethod.setAccessible(true);

            int result = (int) multByTwoMethod.invoke(obj, x);

            assertEquals(x*2, result);
        });
    }
}
