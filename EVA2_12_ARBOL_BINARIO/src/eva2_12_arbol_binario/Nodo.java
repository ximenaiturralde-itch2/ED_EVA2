/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class Nodo {
    //DOS ARTRIBUTOS
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;


//CONSTRUCTORES: 
public Nodo(){
    this.valor = 0;
    this.derecha = null;
    this.izquierda = null; // esto es muy importante, marca el fin de la lista
}    
public Nodo (int valor){//poner el valor al guardar, al momento de crear el nodo
   this.valor = valor;
   this.derecha = null;
   this.izquierda = null;
}
//get y set
public int getValor() {
        return valor;
    }

public void setValor(int valor) {
        this.valor = valor;
    }

public Nodo getDerecha() {
        return derecha;
    }

public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

public Nodo getIzquierda() {
        return izquierda;
    }

public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
}
