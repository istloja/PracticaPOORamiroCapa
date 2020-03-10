/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ISTLOJA_05
 */
public class Alumno {

    private String nombres, apellidos, 
            Numero_De_Id, Ciudadania, Sexo, Telefono, Direccion, Correo;

    public Alumno() {
    }

    public Alumno(String nombres, String apellidos, String Numero_De_Id, String Ciudadania, String Sexo, String Telefono, String Direccion, String Correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.Numero_De_Id = Numero_De_Id;
        this.Ciudadania = Ciudadania;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Correo = Correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumero_De_Id() {
        return Numero_De_Id;
    }

    public void setNumero_De_Id(String Numero_De_Id) {
        this.Numero_De_Id = Numero_De_Id;
    }

    public String getCiudadania() {
        return Ciudadania;
    }

    public void setCiudadania(String Ciudadania) {
        this.Ciudadania = Ciudadania;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", Numero_De_Id=" + Numero_De_Id + ", Ciudadania=" + Ciudadania + ", Sexo=" + Sexo + ", Telefono=" + Telefono + ", Direccion=" + Direccion + ", Correo=" + Correo + '}';
    }

}
