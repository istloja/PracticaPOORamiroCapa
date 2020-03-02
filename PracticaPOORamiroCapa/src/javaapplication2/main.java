/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author SOFT06
 */
public class main {

    public static void main(String[] args) {
        ConeccionBD bs = new ConeccionBD();
        ObjectContainer ob = bs.coneccionBD(
                "C:\\Users\\SOFT06\\Documents\\BDOrientadaObjetos\\estudiante.yap");
        traerEstudiante(ob);
        //agregarEstudiante(ob,new Estudiante("Celio Alvarado",18));
    }
    public static void agregarEstudiante(ObjectContainer ob,Estudiante estudiante){
        ob.store(estudiante);
        System.out.println("EstudianteAlmacenado" + estudiante);
    }

    public static void traerEstudiantes(ObjectSet result) {
        System.out.println("Número de Items" + result.size());
        while (result.hasNext()) {
            System.out.println(result.next());
            System.out.println("\n_____________\n");

        }
    }

    public static void traerEstudiante(ObjectContainer ob) {
        Estudiante estudiante = new Estudiante(null, 0);
        ObjectSet objectSet = ob.queryByExample(estudiante);
        traerEstudiantes(objectSet);
        ob.close();
    }
}
