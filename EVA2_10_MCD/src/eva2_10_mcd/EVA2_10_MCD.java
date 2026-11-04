/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_mcd;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class EVA2_10_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        int resultado = mcd(48, 18);
        System.out.println("El MCD es: " + resultado);
    }
    public static int mcd(int dividiendo, int divisor){
        //LO QUE RESUELVE PARTE DEL PROBLEMA
        //LA LLAMDA RECURSIVA (EL METODO SE LLAMA A SI MISMO)
        //DETENER LA RECURSIVIDAD
        int resu = dividiendo / divisor;
        int residuo = dividiendo % divisor;
        System.out.println(residuo);
        if(residuo ==0){
            return divisor;
        }else{
            return mcd(divisor, residuo);
        }
    }
}
