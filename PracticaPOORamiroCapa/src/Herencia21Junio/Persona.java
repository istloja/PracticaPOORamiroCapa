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
public class Persona {

    //Atributos

    public String nombre;
    public String apellido;
    private int edad;
    public int cédula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCédula() {
        return cédula;
    }

    public void setCédula(int cédula) {
        this.cédula = cédula;
    }

    public void saludar() {
        System.out.println("Hola");
    }

    public void despedirse() {
        System.out.println("Chao");
    }

    public static void main(String[] args) {
        Persona objeto = new Persona();
        objeto.setNombre("Manuel");
        System.out.println(objeto.getNombre());
    }
}
