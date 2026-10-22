/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_4_queue;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class Nodo {
    //DOS ARTRIBUTOS
    private int valor;
    private Nodo siguiente;


//CONSTRUCTORES: 
public Nodo(){
    siguiente = null; // esto es muy importante, marca el fin de la lista
}    
public Nodo (int valor){//poner el valor al guardar, al momento de crear el nodo
    this.valor = valor;
    this.siguiente = null;
}
//get y set

public void setValor(int valor){
    this.valor = valor;
}
public void setSiguiente (Nodo siguiente){
    this.siguiente = siguiente;
}
public int getValor(){
    return valor;
}
public Nodo getSiguiente(){
    return siguiente;
}

}
