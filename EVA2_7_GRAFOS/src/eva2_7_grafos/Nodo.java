/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_grafos;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class Nodo<TIPO> {
    private TIPO valor;
    private Nodo<TIPO> siguiente;
    private Nodo<TIPO> previo; // Agregado para el doble enlace

    // CONSTRUCTORES: 
    public Nodo() {
        this.siguiente = null; 
        this.previo = null;
    }    

    public Nodo(TIPO valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
    }

    // GETTERS Y SETTERS
    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo<TIPO> siguiente) {
        this.siguiente = siguiente;
    }

    public void setPrevio(Nodo<TIPO> previo) {
        this.previo = previo;
    }

    public TIPO getValor() {
        return valor;
    }

    public Nodo<TIPO> getSiguiente() {
        return siguiente;
    }

    public Nodo<TIPO> getPrevio() {
        return previo;
    }
}