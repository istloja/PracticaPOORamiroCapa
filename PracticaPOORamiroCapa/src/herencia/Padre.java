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
public class Padre extends Person {
    Hijo hijo;
    Madre esposa;
    public Padre(){
        setNombre("Marco");
        setApellido("Capa");
        setEdad(40);
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    public Madre getEsposa() {
        return esposa;
    }

    public void setEsposa(Madre esposa) {
        this.esposa = esposa;
    }

    
}
