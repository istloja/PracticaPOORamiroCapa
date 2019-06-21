/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia21Junio;

/**
 *
 * @author ISTLOJAV
 */
public class Profesor extends Persona {

    //atributos
    private float sueldo;

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void darnota() {
        System.out.println(" Tu nota es " + 7);
    }

    public void test() {
        saludar();
        super.saludar();
    }

    public static void main(String[] args) {
        Profesor objeto = new Profesor();
        objeto.test();
        objeto.darnota();
    }

}
