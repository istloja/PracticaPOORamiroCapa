/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Autor implements Serializable {

    private String nombre;
    private int edad;
    private String apellido;
    private int numlibros;
    private String nacionalidad;

    public Autor() {
    }

    public Autor(String nombre, int edad, String apellido, int numlibros, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.numlibros = numlibros;
        this.nacionalidad = nacionalidad;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumlibros() {
        return numlibros;
    }

    public void setNumlibros(int numlibros) {
        this.numlibros = numlibros;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}

