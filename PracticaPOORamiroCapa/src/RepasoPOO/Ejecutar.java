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
public class Ejecutar {

    public static void main(String[] args) {
        Animal objeto = new Animal("Jirafa", 3, 6, 8, "Amarillo");
        Ave objeto1 = new Ave(true, 10, "Aguila", 5, 7, 8, " Dorado ");
        Mamífero objeto2 = new Mamífero(15, true, "Pinguino", 2, 9, 1, "Blanco");
        System.out.println(objeto.Informacionanimal());
        System.out.println(objeto1.Informacionanimal());
        System.out.println(objeto2.Informacionanimal());
        Anfibios obj = new Anfibios(true, true, "Rana", 5, 2, 3, "Verde");
        Reptiles obje = new Reptiles(false, true, "Serpiente", 6, 8, 1, "Cafe");
        System.out.println(obj.Informacionanimal());
        System.out.println(obje.Informacionanimal());

    }

}
