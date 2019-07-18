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
public class Reptiles extends Animal {
    private boolean Vertebrados;
    private boolean Arrastran;

    public boolean isVertebrados() {
        return Vertebrados;
    }

    public void setVertebrados(boolean Vertebrados) {
        this.Vertebrados = Vertebrados;
    }

    public boolean isArrastran() {
        return Arrastran;
    }

    public void setArrastran(boolean Arrastran) {
        this.Arrastran = Arrastran;
    }

    public Reptiles() {
    }

    public Reptiles(boolean Vertebrados, boolean Arrastran, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.Vertebrados = Vertebrados;
        this.Arrastran = Arrastran;
    }
    
    
}
