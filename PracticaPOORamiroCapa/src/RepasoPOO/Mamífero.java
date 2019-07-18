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
public class Mamífero extends Animal {
    private int tiempogestacion;
    private boolean pelaje;

    public int getTiempogestacion() {
        return tiempogestacion;
    }

    public void setTiempogestacion(int tiempogestacion) {
        this.tiempogestacion = tiempogestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public Mamífero() {
    }

    public Mamífero(int tiempogestacion, boolean pelaje, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.tiempogestacion = tiempogestacion;
        this.pelaje = pelaje;
    }
  
}
