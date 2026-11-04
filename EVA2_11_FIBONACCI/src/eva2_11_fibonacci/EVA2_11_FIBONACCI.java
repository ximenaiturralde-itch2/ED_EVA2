/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_fibonacci;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class EVA2_11_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Fibonacci(4) = " + fibonacci(4)); // Debe imprimir 5
        System.out.println("Fibonacci(7) = " + fibonacci(7)); // Debe imprimir 21

        // Imprimir la serie completa (del índice 0 al 7)
        System.out.println("\nSerie de Fibonacci:");
        for (int i = 0; i <= 7; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }
    } 
    public static int fibonacci(int n) {
        // Casos base (según el ejemplo de tu clase)
        if (n == 0 || n == 1) {
            return 1;
        } 
        // Caso recursivo
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
}