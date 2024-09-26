package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {

    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        int n1 = 0;
        while (n1 < num) {
            System.out.println(n1 + " < " + num + ". El proximo ciclo valdra: " + (n1 + 1));
            n1++;
        }
    }
}