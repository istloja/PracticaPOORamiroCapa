/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lil
 */
public class Docente {

    private String Nro_de_ID;
    private String Nombres, Apellidos, Laboratorio, Carrera, Modulo, Materia, Fecha, Hora_Ingreso, Hora_Salida;
  
    public String getNro_de_ID() {
        return Nro_de_ID;
    }

    public void setNro_de_ID(String Nro_de_ID) {
        this.Nro_de_ID = Nro_de_ID;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(String Laboratorio) {
        this.Laboratorio = Laboratorio;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getModulo() {
        return Modulo;
    }

    public void setModulo(String Modulo) {
        this.Modulo = Modulo;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora_Ingreso() {
        return Hora_Ingreso;
    }

    public void setHora_Ingreso(String Hora_Ingreso) {
        this.Hora_Ingreso = Hora_Ingreso;
    }

    public String getHora_Salida() {
        return Hora_Salida;
    }

    public void setHora_Salida(String Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }

//    @Override
//    public String toString() {
//        return "Docente{" + "Nro_de_ID=" + Nro_de_ID + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Laboratorio=" + Laboratorio + ", Carrera=" + Carrera + ", Modulo=" + Modulo + ", Materia=" + Materia + ", Fecha=" + Fecha + ", Hora_Ingreso=" + Hora_Ingreso + ", Hora_Salida=" + Hora_Salida + '}';
//    }
//    
}
