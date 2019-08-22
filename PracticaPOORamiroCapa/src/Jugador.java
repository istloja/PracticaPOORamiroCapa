/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.Serializable;
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
public class Jugador implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private int numeroGoles;
    private int añoDebut;
    private Equipo equipo;

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
    }

    public List<Jugador> leerJugador(String direccion) {
        List<Jugador> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador objeto = (Jugador) auxiliar;
                lista.add(objeto);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public void LeerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador objeto = (Jugador) auxiliar;
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int edadMas(List<Jugador> lista) {
        int edadmaxima = lista.get(0).getEdad();

        for (Jugador jugador : lista) {
            if (jugador.getEdad() < edadmaxima) {
                edadmaxima=jugador.getEdad();
               // System.out.println(jugador.getNombre() + "" + jugador.getApellido() + " Es menor ");
            } else {
                //System.out.println(jugador.getNombre() + " " + jugador.getApellido() + " Es mayor ");
            }
        }
        return edadmaxima;

    }

    public int edadMenos(List<Jugador> lista) {
        int edadminima =lista.get(0).getEdad();

        for (Jugador jugador : lista) {
            if (jugador.getEdad() > edadminima) {
                edadminima=jugador.getEdad();
                System.out.println(" el jugador con edad menor es "+edadminima);
            } else {
               
            }
        }
        return edadminima;

    }

    public int masGoles(List<Jugador> lista) {
        int goles =lista.get(0).getNumeroGoles();

        for (Jugador jugador : lista) {
            if (jugador.getNumeroGoles() < goles) {
                goles=jugador.getNumeroGoles();
//                System.out.println(jugador.getNombre() + " " + jugador.getApellido() + " No tiene esa cantidad de goles");
            } else {
//                System.out.println(jugador.getNombre() + " " + jugador.getApellido() + " tiene mas goles ");
            }
        }
        return goles;

    }

    public int debutPronto(List<Jugador> lista) {
        int año = 2005;

        for (Jugador jugador : lista) {
            if (jugador.getAñoDebut() <= año) {
                System.out.println(jugador.getNombre() + " " + jugador.getApellido() + "  debuto primero ");
            } else {
                System.out.println(jugador.getNombre() + " " + jugador.getApellido() + " No debutaron en ese año ");
            }
        }
        return año;

    }

    public void EscribirLista(String direccion, List<Jugador> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            //recorrer una lista y por cada vez que recorre se crea un objeto de la clase persona
            for (Jugador jugador : lista) {
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }

    public static void main(String[] args) {
        Jugador objeto = new Jugador(" Cristiano ", " Ronaldo ", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"));
        Jugador objeto1 = new Jugador(" Lionel ", " Messi ", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"));
        Jugador objeto2 = new Jugador(" Neymar ", " Jr ", 28, 200, 2011, new Equipo("PSG", 10, "Paris"));
        Jugador objeto3 = new Jugador(" Eden ", " Hazard ", 27, 590, 2010, new Equipo("Real Madrid", 30, "Madrid"));

        List<Jugador> lista = new ArrayList<>();
        lista.add(objeto);
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        int a = lista.size();
        System.out.println(a);
        objeto.leerJugador("C:\\Users\\ISTLOJAV\\Desktop\\ejemplo.txt");
        objeto.LeerLista("C:\\Users\\ISTLOJAV\\Desktop\\ejemplo.txt");
        objeto.EscribirLista("C:\\Users\\ISTLOJAV\\Desktop\\ejemplo.txt", lista);
//        objeto.edadMas(lista);
////        objeto.edadMenos(lista);
////        objeto.masGoles(lista);
////        objeto.debutPronto(lista);
        objeto.edadMenos(lista);

    }
    //.getEquipo.getnumerodetitulos();

}
