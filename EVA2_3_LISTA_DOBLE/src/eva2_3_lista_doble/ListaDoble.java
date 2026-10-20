/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author XIMENA ALEJANDRA ITURRRALDE CONTRERAS
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int tama;

    public ListaDoble(){
        inicio = null; // al crear la lista se crea vacia
        fin = null;
        tama = 0;
    }
    
    public void imprimir(){
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    // O(N) - Corregido para usar getPrevio() en lugar de getSiguiente()
    public void imprimirInv(){
        Nodo temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }  

    public int longitud(){
        Nodo temp = inicio;
        int cont = 0;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
 
    public boolean listaVacia() {
        return inicio == null;
    }
    
    public void vaciarLista(){
        inicio = null;
        fin = null;
        tama = 0;
    }
    
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor); // creamos nodo para el valor a insertar
        if (inicio == null){ // lista vacia?
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            // conectar previo
            nuevo.setSiguiente(fin);
            fin = nuevo;
        }
        this.tama++;
    }

    // --- MÉTODO INSERTAR EN UNA POSICIÓN ESPECÍFICA ---
    public void insertarEn(int pos, int valor) {
        // Validar si la posición es válida (0 hasta tama)
        if (pos < 0 || pos > tama) {
            throw new IndexOutOfBoundsException("Posición inválida en la lista: " + pos);
        }

        if (pos == 0) { // Insertar al inicio
            Nodo nuevo = new Nodo(valor);
            if (inicio == null) { // Lista vacía
                inicio = nuevo;
                fin = nuevo;
            } else {
                nuevo.setSiguiente(inicio);
                inicio.setSiguiente(nuevo);
                inicio = nuevo;
            }
        } else if (pos == tama) { // Insertar al final (equivalente a agregar)
            agregar(valor);
            return; // agregar ya incrementa el tamaño
        } else { // Insertar en medio
            Nodo nuevo = new Nodo(valor);
            Nodo temp = inicio;
            // Recorrer hasta el nodo que está en la posición deseada
            for (int i = 0; i < pos; i++) {
                temp = temp.getSiguiente();
            }
            
            Nodo anterior = temp.getSiguiente();
            
            // Conectar el nuevo nodo
            anterior.setSiguiente(nuevo);
            nuevo.setSiguiente(anterior);
            
            nuevo.setSiguiente(temp);
            temp.setSiguiente(nuevo);
        }
        this.tama++;
    }

    // O(N)
    public void borrarEn(int pos) {
        // Validar si la posición es válida (0 hasta tama - 1)
        if (pos < 0 || pos >= tama) {
            throw new IndexOutOfBoundsException("Posición inválida o lista vacía: " + pos);
        }

        if (tama == 1) { // Solo hay un elemento
            vaciarLista();
            return;
        }

        if (pos == 0) { // Borrar el primer nodo
            inicio = inicio.getSiguiente();
            inicio.setSiguiente(null);
        } else if (pos == tama - 1) { // Borrar el último nodo
            fin = fin.getSiguiente();
            fin.setSiguiente(null);
        } else { // Borrar en medio
            Nodo temp = inicio;
            for (int i = 0; i < pos; i++) {
                temp = temp.getSiguiente();
            }
            
            Nodo anterior = temp.getSiguiente();
            Nodo siguiente = temp.getSiguiente();
            
            anterior.setSiguiente(siguiente);
            siguiente.setSiguiente(anterior);
        }
        this.tama--;
    }
}