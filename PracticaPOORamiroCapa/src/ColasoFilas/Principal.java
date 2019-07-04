/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColasoFilas;

/**
 *
 * @author ISTLOJAV
 */
public class Principal {

    public static void Pila() {
        PilaLista pila = new PilaLista();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        System.out.println("" + pila.quitar());
        System.out.println("" + pila.quitar());
        System.out.println("" + pila.quitar());
        System.out.println("" + pila.quitar());
        System.out.println("" + pila.quitar());
        System.out.println("" + pila.quitar());

    }

    public static void Cola() {
        ColaLista Cola = new ColaLista();
        Cola.insertar(1);
        Cola.insertar(2);
        Cola.insertar(3);
        Cola.insertar(4);
        Cola.insertar(5);
        Cola.insertar(6);
        System.out.println("" + Cola.quitar());
        System.out.println("" + Cola.quitar());
        System.out.println("" + Cola.quitar());
        System.out.println("" + Cola.quitar());
        System.out.println("" + Cola.quitar());
        System.out.println("" + Cola.quitar());

    }

    public static void main(String[] args) {
        Cola();
        System.out.println("ahola en pila");
        Pila();
    }

    public static void print(String numero) {
        System.out.println(numero);
    }
}
