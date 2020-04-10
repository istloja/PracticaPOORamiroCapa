/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lil
 */
public class ConeccionEstudiante {

    public static ArrayList<Estudiante> listaEstudiantes;
//co  este metodo guardamos los datos dentro de la base de datos 
    public static void guardarEstudianteBD(Estudiante estudiante) {
        //metimos este metodo dentro de la base de datos 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //ingresamos la direccion donde se encuntra la base de datos 
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into estudiante values("
                    + "'" + estudiante.getNro_de_ID()
                    + "','" + estudiante.getNombres()
                    + "','" + estudiante.getApellidos()
                    + "','" + estudiante.getLaboratorio()
                    + "','" + estudiante.getCarrera()
                    + "','" + estudiante.getModulo()
                    + "','" + estudiante.getMateria()
                    + "','" + estudiante.getFecha()
                    + "','" + estudiante.getHora_Ingreso()
                    + "','" + estudiante.getHora_Salida()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
    }
//metodo para buscar un dato ingresado 
    public static Estudiante buscarEstudiante(String Nro_de_ID) {
        //meter este método a la base de datos
        Estudiante est = new Estudiante();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from estudiante where Nro_de_ID ='" + Nro_de_ID + "'");

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

                est.setNro_de_ID(ced);
                est.setNombres(nomb);
                est.setApellidos(ape);
                est.setLaboratorio(lab);
                est.setCarrera(carr);
                est.setModulo(mod);
                est.setMateria(mta);
                est.setFecha(fecha);
                est.setHora_Ingreso(HI);
                est.setHora_Salida(HS);

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return est;
    }

    //con este metodo editamos un dato ingresado
    public static void editarEstudiante(Estudiante estudiante) {
        //metimos este método a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("update docente set "
                    + "Nro_de_ID='" + estudiante.getNro_de_ID()
                    + "',Nombres='" + estudiante.getNombres()
                    + "',Apellidos='" + estudiante.getApellidos()
                    + "',Laboratorio='" + estudiante.getLaboratorio()
                    + "',Carrera='" + estudiante.getCarrera()
                    + "',Modulo='" + estudiante.getModulo()
                    + "',Materia='" + estudiante.getMateria()
                    + "',Fecha='" + estudiante.getFecha()
                    + "',Hora_Ingreso='" + estudiante.getHora_Ingreso()
                    + "',Hora_salida='" + estudiante.getHora_Salida()
                    + "'where Nro_de_ID='" + estudiante.getNro_de_ID() + "';");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }
    //con este metodo eliminamos un dato ingresado 
    public static void eliminarEstudiante(String Nro_de_ID) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from estudiante where Nro_de_ID = '" + Nro_de_ID + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }
// este metodo nos retorna una lista cono los datos ingresados

    public static ArrayList cargarEstudiantes() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.printf("conexion establesida");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from estudiante");

            Estudiante estudiante;

            listaEstudiantes = new ArrayList<>();
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

                estudiante = new Estudiante();

                estudiante.setNro_de_ID(Nro_de_ID);
                estudiante.setNombres(nombres);
                estudiante.setLaboratorio(laboratorio);
                estudiante.setCarrera(carrera);
                estudiante.setModulo(modulo);
                estudiante.setMateria(materia);
                estudiante.setFecha(fecha);
                estudiante.setHora_Ingreso(horaIngreso);
                estudiante.setHora_Salida(horaSalida);

                listaEstudiantes.add(estudiante);

            }
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
        return listaEstudiantes;
    }
}
