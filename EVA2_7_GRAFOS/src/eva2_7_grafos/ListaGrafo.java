/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_grafos;

/**
 *
 * @author XIMENA ALEJANDRA ITURRRALDE CONTRERAS
 */
public class ListaGrafo<TIPO> {
    private Nodo inicio; 
    private Nodo fin;
    private int tama;
    
    public ListaGrafo() {
        this.inicio = null; // AL CREAR LA LISTA SE CREA VACIA
        this.fin = null;
        this.tama = 0;
    }
    
    public int longitud(){
        return tama;
    }
    
    // O(1)
    public boolean listaVacia(){
        return inicio == null; // Forma más limpia y directa de retornar un booleano
    }
    
    // O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
        tama = 0;
    }
    
    public void agregar(TIPO valor){
        Nodo nuevo = new Nodo(valor); 
        if (inicio == null){ // Lista vacía
            inicio = nuevo;   
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            // CONECTAR PREVIO
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        this.tama++; // Incrementamos el tamaño de la lista
    }
    // Insertar en...
    // Encontrar en...
}
