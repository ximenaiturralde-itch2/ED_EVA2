/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class ArbolBinario {
    private Nodo root;
    
    public ArbolBinario(){
        root = null;
    }
    
    public void agregar(int valor){
        if (root == null){ // ARBOL VACIO
            root = new Nodo(valor); // INSERTO EL VALOR
        } else {
            agregarRecu(root, valor);
        }  
    }
    
    // METODO RECURSIVO PARA AGREGAR UN NODO
    private void agregarRecu(Nodo actual, int valor){
        if (valor > actual.getValor()){ // A LA DERECHA
            if (actual.getDerecha() != null){ // OCUPADO
                agregarRecu(actual.getDerecha(), valor);
            } else { // DISPONIBLE
                actual.setDerecha(new Nodo(valor));
            }
        } else if (valor < actual.getValor()){ // A LA IZQUIERDA
            if (actual.getIzquierda() != null){ // OCUPADO
                agregarRecu(actual.getIzquierda(), valor);
            } else { // DISPONIBLE
                actual.setIzquierda(new Nodo(valor));
            }
        } else {
            // TODO: EL VALOR ESTA REPETIDO (Actualmente se ignora)
        }
    }
    
    // RECORRIDO PRE-ORDER (Raíz, Izquierda, Derecha)
    public void preOrder(){
        preOrderRecu(root);
        System.out.println();
    } 
    
    private void preOrderRecu(Nodo actual){
        if (actual != null) { // <-- ¡CORREGIDO AQUÍ! Faltaba esta validación
            System.out.print(actual.getValor() + " "); // (Agregué espacio opcional para legibilidad)
            preOrderRecu(actual.getIzquierda()); 
            preOrderRecu(actual.getDerecha());
        }
    }
    
    // RECORRIDO IN-ORDER (Izquierda, Raíz, Derecha)
    public void inOrder(){
        inOrderRecu(root);
        System.out.println();
    }
    
    private void inOrderRecu(Nodo actual){
        if (actual != null) {
            inOrderRecu(actual.getIzquierda());
            System.out.print(actual.getValor() + " ");
            inOrderRecu(actual.getDerecha());
        }
    }
    
    // RECORRIDO POST-ORDER (Izquierda, Derecha, Raíz)
    public void postOrder(){
        postOrderRecu(root);
        System.out.println();
    }
    
    private void postOrderRecu(Nodo actual){
        if (actual != null) {
            postOrderRecu(actual.getIzquierda());
            postOrderRecu(actual.getDerecha());
            System.out.print(actual.getValor() + " ");
        }
    }
}

