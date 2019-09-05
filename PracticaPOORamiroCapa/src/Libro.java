/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Libro implements Serializable {

    private int añopublicacion;
    private int numpaginas;
    private String titulo;
    private double precio;
    private int fechaescrito;
    private Autor autor;

    public Libro() {
    }

    public Libro(int añopublicacion, int numpaginas, String titulo, double precio, int fechaescrito, Autor autor) {
        this.añopublicacion = añopublicacion;
        this.numpaginas = numpaginas;
        this.titulo = titulo;
        this.precio = precio;
        this.fechaescrito = fechaescrito;
        this.autor = autor;
    }

    public int getAñopublicacion() {
        return añopublicacion;
    }

    public void setAñopublicacion(int añopublicacion) {
        this.añopublicacion = añopublicacion;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFechaescrito() {
        return fechaescrito;
    }

    public void setFechaescrito(int fechaescrito) {
        this.fechaescrito = fechaescrito;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void escribirObjeto(String direccion, Libro objeto) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(objeto);
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se produjo un error " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Libro objeto = (Libro) auxiliar;

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public List<Autor> leerPersona(String direccion) {
        List<Autor> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Autor objeto = (Autor) auxiliar;
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
                Autor objeto = (Autor) auxiliar;
                System.out.println("");
                auxiliar = lector.readObject();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int libroAntiguo(List<Libro> lista) {
        int edadmasantiguo = lista.get(0).getAñopublicacion();

        for (Libro libro : lista) {
            if (libro.getAñopublicacion() < edadmasantiguo) {
                edadmasantiguo = libro.getAñopublicacion();
                System.out.println(" el libro mas antiguo es " + edadmasantiguo);
            } else {

            }
        }
        return edadmasantiguo;

    }

    public int libroActualizado(List<Libro> lista) {
        int añoactual = 2019;
        int año = lista.get(0).getAñopublicacion();
        for (Libro libro : lista) {
            if (añoactual - 5 < libro.getAñopublicacion()) {
                año = libro.getAñopublicacion();
                System.out.println(" El libro esta actualizado ");
            } else {
                System.out.println(" No estan actualizados ");
            }
        }
        return añoactual;
    }

    public static void main(String[] args) {
        Libro objeto = new Libro();
        Libro objeto1 = new Libro(2015, 300, "Virtual Hero", 12.5, 2010, new Autor("Rueben", 28, "Gundersen", 3, "España"));
        Libro objeto2 = new Libro(2013, 400, "Hero", 15.2, 2009, new Autor("Raul", 30, "Alvarez", 4, "España"));
        Libro objeto3 = new Libro(2014, 200, "Hero Mask", 12.9, 2012, new Autor("David", 30, "Martinez", 2, "España"));
        Libro objeto4 = new Libro(2016, 200, "Dead note", 15.9, 2013, new Autor("Ismael", 30, "Ocampo", 2, "Venezuela"));
        Libro objeto5 = new Libro(2018, 200, "Imparable", 17.9, 2014, new Autor("Douglas", 30, "Costa", 2, "Mexico"));
        List<Libro> lista = new ArrayList<>();

        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
        int a = lista.size();

        objeto.leerArchivo("C:\\Users\\ISTLOJAV\\Desktop\\clase.txt");
        objeto.escribirObjeto("C:\\Users\\ISTLOJAV\\Desktop\\clase.txt", objeto);
        objeto.LeerLista("C:\\Users\\ISTLOJAV\\Desktop\\clase.txt");
        objeto.libroAntiguo(lista);
        objeto.libroActualizado(lista);
    }
}
