/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import static Modelo.ConeccionEstudiante.listaEstudiantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lil
 */
public class ConeccionDocente {
    
    public static ArrayList<Docente> listaDocentes;

    //metodo para guardar los datos dentro de una base de datos
    public static void guardarDocenteBD(Docente docente) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //direccion de la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into docente values("
                    + "'" + docente.getNro_de_ID()
                    + "','" + docente.getNombres()
                    + "','" + docente.getApellidos()
                    + "','" + docente.getLaboratorio()
                    + "','" + docente.getCarrera()
                    + "','" + docente.getModulo()
                    + "','" + docente.getMateria()
                    + "','" + docente.getFecha()
                    + "','" + docente.getHora_Ingreso()
                    + "','" + docente.getHora_Salida()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
    }

    //con este metodo buscamos los datos guardados
    public static Docente buscarDocente(String Nro_de_ID) {
        //ponemos este método a la base de datos
        Docente dc = new Docente();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from docente where Nro_de_ID ='" + Nro_de_ID + "'");

            while (necesario.next()) {

                String ced = necesario.getString("Nro_de_ID");
                String nomb = necesario.getString("Nombres");
                String ape = necesario.getString("Apellidos");
                String lab = necesario.getString("Laboratorio");
                String carr = necesario.getString("Carrera");
                String mod = necesario.getString("Modulo");
                String mta = necesario.getString("Materia");
                String fecha = necesario.getString("Fecha");
                String HI = necesario.getString("Hora_Ingreso");
                String HS = necesario.getString("Hora_Salida");

                dc.setNro_de_ID(ced);
                dc.setNombres(nomb);
                dc.setApellidos(ape);
                dc.setLaboratorio(lab);
                dc.setCarrera(carr);
                dc.setModulo(mod);
                dc.setMateria(mta);
                dc.setFecha(fecha);
                dc.setHora_Ingreso(HI);
                dc.setHora_Salida(HS);

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return dc;

    }
    //EDITAR
    
       public static void editarDocente(Docente docente) {
        //metimos este método a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("update docente set "
                    
                    + "Nro_de_ID='" + docente.getNro_de_ID()
                    + "',Nombres='" + docente.getNombres()
                    + "',Apellidos='" + docente.getApellidos()
                    + "',Laboratorio='" + docente.getLaboratorio()
                    + "',Carrera='" + docente.getCarrera()
                    + "',Modulo='" + docente.getModulo()
                    + "',Materia='" +docente.getMateria()
                    + "',Fecha='" + docente.getFecha()
                    + "',Hora_Ingreso='" + docente.getHora_Ingreso()
                    + "',Hora_salida='" + docente.getHora_Salida()
                    
                    + "'where Nro_de_ID='" + docente.getNro_de_ID()+"';");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        
    } 
       //metodo para eliminar un dato
     public static void eliminar(String Nro_de_ID) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from docente where Nro_de_ID = '" + Nro_de_ID + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

    }
     // este metodo nos retorna una lista cono los datos ingresados 
      public static ArrayList cargarDocentes() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.printf("conexion establesida");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from docente");

            Docente docente;

            listaDocentes = new ArrayList<>();
            while (necesario.next()) {

                String Nro_de_ID = necesario.getString("Nro_de_ID");
                String nombres = necesario.getString("Nombres");
                String apellidos = necesario.getString("Apellidos");
                String laboratorio = necesario.getString("Laboratorio");
                String carrera = necesario.getString("Carrera");
                String modulo = necesario.getString("Modulo");
                String materia = necesario.getString("Materia");
                String fecha = necesario.getString("Fecha");
                String horaIngreso = necesario.getString("Hora_Ingreso");
                String horaSalida = necesario.getString("Hora_Salida");

                docente = new Docente();

                docente.setNro_de_ID(Nro_de_ID);
                docente.setNombres(nombres);
                docente.setLaboratorio(laboratorio);
                docente.setCarrera(carrera);
                docente.setModulo(modulo);
                docente.setMateria(materia);
                docente.setFecha(fecha);
                docente.setHora_Ingreso(horaIngreso);
                docente.setHora_Salida(horaSalida);
                
                listaDocentes.add(docente);
                

            }
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);

        }
        return listaDocentes;
    }

   
}
