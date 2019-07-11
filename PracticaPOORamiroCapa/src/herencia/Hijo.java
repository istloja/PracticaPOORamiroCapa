/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ISTLOJAV
 */
public class Hijo extends Person {

    Madre madre;
    Padre padre;

    public Hijo() {
        setNombre(" Ramiro ");
        setApellido(" Capa Piedra ");
        setEdad(20);
    }

    public Madre getMadre() {
        return madre;
    }

    public void setMadre(Madre madre) {
        this.madre = madre;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

}
