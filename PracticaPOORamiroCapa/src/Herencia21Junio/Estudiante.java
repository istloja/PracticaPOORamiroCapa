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
public class Estudiante extends Persona {

    //Atributos
    private int dni;
    private float notafinal;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(float notafinal) {
        this.notafinal = notafinal;
    }

    public void notafinal() {
        System.out.println(" Aprobado : " + 7);
    }

    @Override//signifca que estoy sobreescribiendo
    public void saludar() {
        System.out.println(" Hola soy un estudiante y aprobé ");
    }
    public void test(){
        saludar();
        super.saludar();//llama al método de la clase padre
    }

    public static void main(String[] args) {
        Estudiante objeto = new Estudiante();
        objeto.saludar();
        //objeto.notafinal();
        objeto.test();
    }

}
