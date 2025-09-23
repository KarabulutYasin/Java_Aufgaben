package de.a.fundamentals.day_2.eigeneMethoden;

public class EigeneMethoden {
    //TODO
    // Schreibe Folgende Methoden
    // (auf die Namen Achten sonst entstehen Fehler bei denn Tests)
    // 1. "nope" diese Methode soll nichts machen somit kein Parameter und kein Rückgabewert haben
    // 2. "mult" die zwei int multipliziert und das Ergebnis (int) zurückgibt
    // 3. "multByTwo" es soll "mult" mit einem festen Parameter 2 aufgerufen werden und zurückgegeben werden(int)

    private EigeneMethoden(){}

    public void nope(){
        //macht nix
    }

    public int mult(int x, int y){
        return x*y;
    }

    public int multByTwo(int x){
        return mult(x,2);
    }



}
