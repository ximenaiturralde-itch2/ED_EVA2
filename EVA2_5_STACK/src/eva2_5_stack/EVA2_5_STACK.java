/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author ca-co
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ININCIA main");
        A(); 
        System.out.println("TERMINA main");
    }
    public static void A(){
        System.out.println("INICIA A()");
        B();
        System.out.println("TERMINA A()");
    }
    public static void B(){
        System.out.println("INICIA B()");
        int i = 5;
        double d = 5.5;
        System.out.println("TERMINA B()");
        A();
    } 
}

