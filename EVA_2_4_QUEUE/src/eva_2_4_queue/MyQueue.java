/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_4_queue;

/**
 *
 * @author ca-co
 */
public class MyQueue {
    private Nodo inicio;
    private Nodo fin;
    private int tama;

    public MyQueue(){
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
            break;
        }
        System.out.println("");
    }  

    public int longitud(){
        return this.tama;
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
            fin = nuevo;
        }
        this.tama++;
    }
    // Obtener el valor en una posición específica (útil para peek o indexación)
    public int valorEn(int pos) {
        if (pos < 0 || pos >= tama) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        Nodo temp = inicio;
        for (int i = 0; i < pos; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
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
            nuevo.setSiguiente(temp.getSiguiente());
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
        if (pos == 0) { // Borrar el primer nodo (Dequeue natural de la cola)
            inicio = inicio.getSiguiente();
            if (inicio == null) { // Si era el único elemento
                fin = null;
            }
        } else { 
            Nodo temp = inicio;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            if (pos == tama - 1) { // Si borramos el último, actualizamos 'fin'
                fin = temp;
            }
        }
        this.tama--;
    }
    
    // ==========================================
    // MÉTODOS ESPECÍFICOS DE LA COLA (QUEUE)
    // ==========================================
    
    // QUEUE --> FIFO (El primero en llegar es el primero en salir)
    // Agrega un valor al final de la cola (Enqueue)
    public void push (int valor){
        agregar(valor);
    }
    
    // Lee el valor directamente accesible (el primero en la fila), sin borrarlo
    public int peek(){
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return inicio.getValor();
    }
    
    // Lee el valor directamente accesible, y después lo borra (Dequeue)
    public int pop(){
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = inicio.getValor();
        borrarEn(0); // Elimina el primer elemento
        return valor;
    }
}