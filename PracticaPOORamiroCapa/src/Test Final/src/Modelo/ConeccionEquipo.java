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
public class ConeccionEquipo {

    public static ArrayList<Equipos> listaEquipos;

    //metodo para guardar datos dentro de un base de datos 
    public static void guardarEquiposBD(Equipos equipos) {
        //metemos este metodo en una base de datos 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //ingresamo la direccion donde se encuentra la base de datos 
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into equipo values("
                    + "'" + equipos.getTipodeEquipo()
                    + "','" + equipos.getNro_de_Serie()
                    + "','" + equipos.getMarca()
                    + "','" + equipos.getModelo()
                    + "','" + equipos.getPertenece()
                    + "','" + equipos.getSala_de_Ubicacion()
                    + "','" + equipos.getEstado()
                    + "','" + equipos.getFuncionamiento()
                    + "','" + equipos.getObservaciones()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
    }
//metodo para buscar un dato ingresado
    public static Equipos buscarEquipo(String Nro_de_Serie) {
        //meter este método a la base de datos
        Equipos eqps = new Equipos();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from equipo where Nro_de_Serie ='" + Nro_de_Serie + "'");

            while (necesario.next()) {

                String tipo = necesario.getString("Tipo_de_Equipo");
                String serie = necesario.getString("Nro_de_Serie");
                String marca = necesario.getString("Marca");
                String modelo = necesario.getString("Modelo");
                String pert = necesario.getString("Pertenece");
                String sala = necesario.getString("Sala_de_Ubicacion");
                String estado = necesario.getString("Estado");
                String func = necesario.getString("Funcionamiento");
                String obsc = necesario.getString("Observaciones");
                

                eqps.setTipodeEquipo(tipo);
                eqps.setNro_de_Serie(serie);
                eqps.setMarca(marca);
                eqps.setModelo(modelo);
                eqps.setPertenece(pert);
                eqps.setSala_de_Ubicacion(sala);
                eqps.setEstado(estado);
                eqps.setFuncionamiento(func);
               eqps.setObservaciones(obsc);
                

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return eqps;

    }
    //EDITAR

    public static void editarEquipo(Equipos equipo) {
        //metimos  este método a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("update equipo set "
                    
                    + "Tipo_de_Equipo='" + equipo.getTipodeEquipo()
                    + "',Nro_de_Serie='" + equipo.getNro_de_Serie()
                    + "',Marca='" + equipo.getMarca()
                    + "',Modelo='" + equipo.getModelo()
                    + "',Pertenece='" + equipo.getPertenece()
                    + "',Sala_de_Ubicacion='" + equipo.getSala_de_Ubicacion()
                    + "',Estado='" + equipo.getEstado()
                    + "',Funcionamiento='" + equipo.getFuncionamiento()
                    + "',Observaciones='" + equipo.getObservaciones()
                    
                    + "'where Nro_de_Serie='" + equipo.getNro_de_Serie() + "';");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

    }
//con este metodo eliminano un dato ingresado
    public static void eliminar(String Nro_de_Serie) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from equipo where Nro_de_Serie = '" + Nro_de_Serie + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

    }
// este metodo nos retorna una lista cono los datos ingresados
    public static ArrayList cargarEquipo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/registrolaboratorios", "root", "admin");
            System.out.printf("conexion establesida");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from equipo");

            Equipos equipo;

            listaEquipos = new ArrayList<>();
            while (necesario.next()) {

              String tipo = necesario.getString("Tipo_de_Equipo");
                String serie = necesario.getString("Nro_de_Serie");
                String marca = necesario.getString("Marca");
                String modelo = necesario.getString("Modelo");
                String pert = necesario.getString("Pertenece");
                String sala = necesario.getString("Sala_de_Ubicacion");
                String estado = necesario.getString("Estado");
                String func = necesario.getString("Funcionamiento");
                String obsc = necesario.getString("Observaciones");
                
                Equipos eqps=new Equipos();

                eqps.setTipodeEquipo(tipo);
                eqps.setNro_de_Serie(serie);
                eqps.setMarca(marca);
                eqps.setModelo(modelo);
                eqps.setPertenece(pert);
                eqps.setSala_de_Ubicacion(sala);
                eqps.setEstado(estado);
                eqps.setFuncionamiento(func);
               eqps.setObservaciones(obsc);
               
                listaEquipos.add(eqps);
            }
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
        return listaEquipos;
    }
}
