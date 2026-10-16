/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class EVA2_2_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ListaSimple lista = new ListaSimple();
        /*int[] arreglo = new int[1000000];
        long ini, fin, timepo;

        ini = System.nanoTime(); //TOMAMOS LA "HORA" ANTES DE EMPEZAR
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = ((int)(Math.random() * 100));
        }
        fin = System.nanoTime(); //TOMAMOS LA "HORA" DESPUES DE TERMINAR
        timepo = fin - ini; //CALCULAMOS EL TIEMPO TRANSCURRIDO
        System.out.println("Tiempo arreglo: " + timepo + " nanosegundos");

        ini = System.nanoTime(); //TOMAMOS LA "HORA" ANTES DE EMPEZAR
        for(int i = 0; i < 1000000; i++){
            lista.agregar((int)(Math.random() * 100));
        }
        fin = System.nanoTime(); //TOMAMOS LA "HORA" DESPUES DE TERMINAR
        timepo = fin - ini; //CALCULAMOS EL TIEMPO TRANSCURRIDO
        System.out.println("Tiempo lista: " + timepo + " nanosegundos");*/
        //System.out.println("Tamaño de la lista: " + lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println("Tamaño de la lista: " + lista.longitud());
        //lista.vaciarLista();
        //lista.imprimir();
        //System.out.println("Tamaño de la lista: " + lista.longitud());
        System.out.println("Valor en la posicion 1: " + lista.valorEn(1));
        System.out.println("Posicion del valor 300: " + lista.encontrar(300));
        lista.insertarEn(150, 1);
        lista.imprimir();
        lista.borrarEn(1);
        lista.imprimir();
        lista.inverso();
    }
}