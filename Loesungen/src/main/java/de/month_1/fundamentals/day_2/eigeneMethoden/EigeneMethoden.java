package de.month_1.fundamentals.day_2.eigeneMethoden;

public class EigeneMethoden {
    //TODO
    // Schreibe Folgende Methoden
    // (auf die Namen Achten sonst entstehen Fehler bei denn Tests)
    // 1. "nope" diese Methode soll nichts machen somit kein Parameter und kein Rückgabewert haben
    // 2. "mult" die zwei int multipliziert und das Ergebnis (int) zurückgibt
    // 3. "multByTwo" es soll "mult" mit einem festen Parameter 2 aufgerufen werden und zurückgegeben werden(int)

    public void nope(){
        //macht nix
    }

    public int mult(int x, int y){
        return x*y;
    }

    public int multByTwo(int x){
        return mult(x,2);
    }

    public static void main(String[] args){
        //Nicht zu bearbeiten
        EigeneMethoden em = new EigeneMethoden();
        Class emClass = em.getClass();
        try {
            String divider = "--------------------";

            System.out.println(divider);
            System.out.println("nope:");
            emClass.getDeclaredMethod("nope");

            System.out.println(divider);
            System.out.println("mult mit denn Parametern 3 und 4:");
            System.out.println(emClass.getDeclaredMethod("mult", int.class, int.class).invoke(em,3,4));

            System.out.println(divider);
            System.out.println("multByTwo mit dem Parameter 5:");
            System.out.println(emClass.getDeclaredMethod("multByTwo",int.class).invoke(em,5));
            System.out.println(divider);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
