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
public class Anfibios extends Animal {
    private boolean Branqueas;
    private boolean metamorfosis;

    public boolean isBranqueas() {
        return Branqueas;
    }

    public void setBranqueas(boolean Branqueas) {
        this.Branqueas = Branqueas;
    }

    public boolean isMetamorfosis() {
        return metamorfosis;
    }

    public void setMetamorfosis(boolean metamorfosis) {
        this.metamorfosis = metamorfosis;
    }

    public Anfibios() {
    }

    public Anfibios(boolean Branqueas, boolean metamorfosis, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.Branqueas = Branqueas;
        this.metamorfosis = metamorfosis;
    }

  
}
