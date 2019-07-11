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
public class herencia {

    public static void main(String[] args) {
        Hijo hijo = new Hijo();
        Madre madre = new Madre();
        Padre padre = new Padre();
        hijo.setMadre(madre);
        hijo.setPadre(padre);
        madre.setHijo(hijo);
        madre.setEsposo(padre);
        padre.setHijo(hijo);
        padre.setEsposa(madre);

        System.out.println(" El nombre de mi madre es : " + hijo.getMadre().getNombre());
        System.out.println(" La edad de mi padre es : "+hijo.getPadre().getEdad());
        System.out.println(" Mis dos apellidos son: "+padre.getHijo().getApellido());
        System.out.println(" La edad de mi madre es: "+hijo.getMadre().getEdad());
        System.out.println(" La esposa de mi padre se llama: "+padre.getEsposa().getNombre());

    }

}
