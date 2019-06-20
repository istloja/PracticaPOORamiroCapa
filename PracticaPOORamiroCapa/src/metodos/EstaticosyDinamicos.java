/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author ISTLOJAV
 */
public class EstaticosyDinamicos {

    public static void main(String[] args) {
        saludar();//para llamar un metodo estatico
        //Si quiero llamar a despedir debo crear un objeto
        EstaticosyDinamicos objeto = new EstaticosyDinamicos();//creo un objeto
        objeto.despedir();//asi se llama un metodo no estatico

    }

    public static void saludar() {//este es un metodo estatico
        System.out.println("Hola");
    }

    public void despedir() {//Este e sun metodo No estacico
        System.out.println("Chao");
    }

}
