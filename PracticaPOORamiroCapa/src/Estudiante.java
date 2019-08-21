/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Debber;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Estudiante {

    private String Nombre;
    private String Apellido;
    private int edad;
    private String materia;
    private String direccion;

    public Estudiante() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Estudiante(String Nombre, String Apellido, int edad, String materia, String direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.materia = materia;
        this.direccion = direccion;
    }

    public void EscribirLista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {
                escritor.writeObject(estudiante);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrujo un error " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Estudiante objeto = (Estudiante) auxiliar;
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void LeerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante objeto = (Estudiante) auxiliar;
                auxiliar = lector.readObject();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Estudiante> leerEstudiante(String direccion) {
        List<Estudiante> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante objeto = (Estudiante) auxiliar;
                lista.add(objeto);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public static void main(String[] args) {
        Estudiante objeto = new Estudiante("Ramiro", "Capa", 20, "Quimica", "Daniel Alvarez");
        Estudiante objeto1 = new Estudiante("Alejandro", "Capa", 19, "Fisica", "Benjamin Carrios");
        Estudiante objeto2 = new Estudiante("Marco", "Capa", 40, "Lenguaje", "Jose de San Martin");
        Estudiante objeto3 = new Estudiante("Hade", "Capa", 15, "Ingles", "Daniel Alvarez");
        Estudiante objeto4 = new Estudiante("Camila", "Capa", 12, "Matematica", "Daniel Alvarez");
        Estudiante objeto5 = new Estudiante("Melany", "Capa", 12, "Historia", "Daniel Alvarez");
        Estudiante objeto6 = new Estudiante(" Domenica ", "Capa", 9, "Educacion Fisica", "Daniel Alvarez");
        Estudiante objeto7 = new Estudiante("Diana", "Capa", 11, "Emprendimiento", "Daniel Alvarez");
        Estudiante objeto8 = new Estudiante("Valentina", "Capa", 10, "Ciudadania", "Daniel Alvarez");
        Estudiante objeto10 = new Estudiante("Jhosselin", "Carpio", 18, "Fisico-Quimica", "Daniel Alvarez");
        System.out.println(" Nombre y Apellido: " + objeto.getNombre() + "" + objeto.getApellido());
        System.out.println(" Edad: " + objeto.getEdad() + " Materia: " + objeto.getMateria() + " Direccion: " + objeto.getDireccion());
        List<Estudiante> lista = new ArrayList<>();
        lista.add(objeto);
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
        lista.add(objeto6);
        lista.add(objeto7);
        lista.add(objeto8);
        lista.add(objeto10);
        int a = lista.size();
        System.out.println(a);
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante.getNombre() + "" + estudiante.getApellido() + "" + estudiante.getMateria());
        }
        objeto.LeerLista("C:\\Users\\ISTLOJAV\\Desktop\\Deber.txt");
        objeto.EscribirLista("C:\\Users\\ISTLOJAV\\Desktop\\Deber.txt", lista);

    }

}
