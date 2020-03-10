/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ISTLOJA_05
 */
public class OyenteCrearAlumno implements ActionListener {

    Formulario f;
    AlumnoBD abd;
    Alumno a;

    public OyenteCrearAlumno(Formulario f) {
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        a = f.guardarAlumno();
        abd.guardarAlumnoBD(a);
        f.limpiarCampos();
        
        f.desbloquerCampos();
        
       

    }

}
