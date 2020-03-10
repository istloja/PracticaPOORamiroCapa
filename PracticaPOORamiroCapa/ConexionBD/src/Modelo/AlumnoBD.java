/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ISTLOJA_05
 */
public class AlumnoBD {

    public static void guardarAlumnoBD(Alumno alumno) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/formulario", "root", "admin");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into estudiante values('"
                    + alumno.getNombres()
                    + "','" + alumno.getApellidos()
                    + "','" + alumno.getNumero_De_Id()
                    + "','" + alumno.getCiudadania()
                    + "','" + alumno.getSexo()
                    + "','" + alumno.getTelefono()
                    + "','" + alumno.getDireccion()
                    + "','" + alumno.getCorreo()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }

    }

    public static void eliminar(String cedula) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/formulario", "root", "");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from estudiante where Numero_de_Id = '" + cedula + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

    }

    public static Alumno buscarAlumno(String cedula) {
        //meter este método a la base de datos
        Alumno alumno = new Alumno();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/formulario", "root", "admin");
//            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from estudiante where Numero_de_Id ='" + cedula + "'");

            while (necesario.next()) {
                String ced = necesario.getString("Numero_de_Id");
                String ciu = necesario.getString("Ciudadania");
                String ape = necesario.getString("Apellidos");
                String nom = necesario.getString("Nombres");
                String sex = necesario.getString("Sexo");
                String tel = necesario.getString("Telefono");
                String dir = necesario.getString("Direccion");
                String cor = necesario.getString("Correo");

                alumno.setNumero_De_Id(ced);
                alumno.setCiudadania(ciu);
                alumno.setApellidos(ape);
                alumno.setNombres(nom);
                alumno.setSexo(sex);
                alumno.setTelefono(tel);
                alumno.setDireccion(dir);
                alumno.setCorreo(cor);

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return alumno;

    }
}
