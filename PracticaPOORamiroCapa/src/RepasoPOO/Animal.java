/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ISTLOJAV
 */
public class Animal {

    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private String color;

    public Animal() {
    }

    public Animal(String nombre, int edad, double peso, double altura, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Nombreanimal() {
        System.out.println(" Hola soy un animal ");

    }

    public String Informacionanimal() {
        String informacion = nombre + " " + color + " " + peso + " " + edad + " " + altura;
        return informacion;

    }

    public static void main(String[] args) {
        Animal objeto = new Animal();
        objeto.setNombre(" Perro ");
        objeto.setColor(" Negro ");
        objeto.setEdad(12);
        objeto.setAltura(13);
        objeto.setPeso(15.5);
        System.out.println(objeto.Informacionanimal());
        Animal objeto1=new Animal("Gato",3,5,7,"Verde");
        System.out.println(objeto1.Informacionanimal());
    }
}
