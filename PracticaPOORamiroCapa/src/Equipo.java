/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJAV
 */
public class Equipo implements Serializable{
    private String nombre;
    private int numerotitulos;
    private String ciudad;

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerotitulos() {
        return numerotitulos;
    }

    public void setNumerotitulos(int numerotitulos) {
        this.numerotitulos = numerotitulos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Equipo(String nombre, int numerotitulos, String ciudad) {
        this.nombre = nombre;
        this.numerotitulos = numerotitulos;
        this.ciudad = ciudad;
    }
    
}
