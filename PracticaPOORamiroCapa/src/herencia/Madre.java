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
public class Madre extends Person {
    Hijo hijo;
    Padre esposo;
    public Madre(){
        setNombre("Andrea");
        setApellido("Piedra");
        setEdad(38);
        
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    public Padre getEsposo() {
        return esposo;
    }

    public void setEsposo(Padre esposo) {
        this.esposo = esposo;
    }
   
}
