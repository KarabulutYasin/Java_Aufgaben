package de.month_1.fundamentals.day_2.EigeneMethoden;

public class EigeneMethoden {
    //TODO
    // Schreibe Folgende Methoden
    // (auf die Namen Achten sonst entstehen Fehler bei denn Tests)
    // 1. "nope" diese Methode soll nichts machen somit kein Parameter und kein Rückgabewert haben
    // 2. "mult" die zwei int multipliziert und das Ergebnis (int) zurückgibt
    // 3. "multByTwo" es soll "mult" mit einem festen Parameter 2 aufgerufen werden und zurückgegeben werden(int)

    public static void main(String[] args){
        //Nicht zu bearbeiten
        new EigeneMethoden().run();
    }

    public void run(){
        //Nicht zu bearbeiten
        Class emClass = this.getClass();
        EigeneMethoden em = new EigeneMethoden();
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
