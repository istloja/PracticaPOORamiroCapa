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
public class Cola {

    int elemento;
    Cola siguiente;

    public Cola(int x) {
        elemento = x;
        siguiente = null;
    }
}

// declaración de la clase ColaLista
class ColaLista {

    protected Cola frente;
    protected Cola fin;

    public ColaLista() {
        frente = fin = null;
    }

    public void insertar(int elemento) {
        Cola a;
        a = new Cola(elemento);
        if (colaVacia()) {
            frente = a;
        } else {
            fin.siguiente = a;
        }
        fin = a;
    }

    public int quitar() {
        int aux;
        if (!colaVacia()) {
            aux = frente.elemento;
            frente = frente.siguiente;

        } else {
            return -1;
        }
        return aux;
    }

    public void borrarCola() {
        while (frente != null) {
            frente = frente.siguiente;
        }

    }

    public boolean colaVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }
}
