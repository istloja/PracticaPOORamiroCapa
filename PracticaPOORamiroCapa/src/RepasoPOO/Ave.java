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
public class Ave extends Animal {

    private boolean Vuela;
    private int numerohuevos;

    public boolean isVuela() {
        return Vuela;
    }

    public void setVuela(boolean Vuela) {
        this.Vuela = Vuela;
    }

    public int getNumerohuevos() {
        return numerohuevos;
    }

    public void setNumerohuevos(int numerohuevos) {
        this.numerohuevos = numerohuevos;
    }

    public Ave() {
    }

    public Ave(boolean Vuela, int numerohuevos, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.Vuela = Vuela;
        this.numerohuevos = numerohuevos;
    }

}
