/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    public int longitud;

    public ListaSimple() {
        inicio = null; //al crear la lista se crea vacia
        fin = null;
        longitud = 0;
    }

    //SE AGREGA AL FINAL DE LA LISTA
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor); //creo el nodo para el valor a insertar
        //Y LUEGO???
        if(inicio == null) { //LISTA VACIA? VERDADERO
            inicio = nuevo; //nuevo es el primer nodo de la lista
            fin = nuevo; //nuevo es el ultimo nodo de la lista
            longitud++;
        } else{ //LISTA CON NODOS
            //movernos al final
            //Nodo temp = inicio;
            //while(temp.getSiguiente() != null) {
            //    temp.getSiguiente();
            //}
            //temp.setSiguiente(nuevo);//conecto nuevo al final de la lista
            fin.setSiguiente(nuevo); //conecto nuevo al final de la lista
            fin = nuevo;
            longitud++;
        }
    }

    //O(N)
    public void imprimir() {
        Nodo temp = inicio;
        while(temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    //O(N)
    /*public int longitud() {
        Nodo temp = inicio;
        int cant = 0;
        while(temp != null) {
            cant = cant + 1;
            temp = temp.getSiguiente();
        }
        return cant;
    }*/

    //O(1)
    public boolean listaVacia() {
        if(inicio == null) { //LISTA VACIA
            return true;
        } else { //LISTA CON NODOS
            return false;
        }
    }

    //O(1)
    public void vaciarLista() {
        inicio = null;
        fin = null;
        longitud = 0;
    }

    //O(N)
    public int valorEn(int posicion) {
        if(posicion < 0 || posicion >= this.longitud) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo temp = inicio;
            for( int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        }
    }

    //O(N)
    public int encontrar(int valor) {
        Nodo temp = inicio;
        int pos = 0;
        while(temp != null) {
            if(temp.getValor() == valor) {
                return pos;
            }
            pos++;
            temp = temp.getSiguiente();
        }
        throw new IndexOutOfBoundsException("Valor no encontrado"); //NO SE ENCONTRO EL VALOR
    }

    //O(N)
    public void insertarEn(int valor, int posicion) {
        if(posicion < 0 || posicion > this.longitud) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0) { //INSERTAR AL INICIO
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null) { //LISTA VACIA
                    fin = nuevo;
                }
            } else if(posicion == this.longitud) { //INSERTAR AL FINAL
                fin.setSiguiente(nuevo);
                fin = nuevo;
            } else{ //INSERTAR EN EL MEDIO
                Nodo temp = inicio;
                for(int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
            longitud++;
        }
    }

    public void borrarEn(int posicion) {
        if(posicion < 0 || posicion >= this.longitud) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            if(posicion == 0) { //BORRAR AL INICIO
                inicio = inicio.getSiguiente();
                if(inicio == null) { //LISTA VACIA
                    fin = null;
                }
            } else{ //BORRAR EN EL MEDIO O FINAL
                Nodo temp = inicio;
                for(int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(temp.getSiguiente() == null) { //BORRAR AL FINAL
                    fin = temp;
                }
            }
            longitud--;
        }
    }

    public int longitud() {
        return this.longitud;
    }

    public void inverso() {
        for(int i = this.longitud - 1; i >= 0; i--) {
            System.out.print("[" + this.valorEn(i) + "]");
        }
    }
}