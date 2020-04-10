/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.ConeccionEstudiante;
import Modelo.Estudiante;
import Vista.VentanaEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lil
 */
//con este metodo controlamos la accion del boton editar
public class OyenteEditarEstudiante implements ActionListener {
//llamos las clases
    VentanaEstudiante vntest;
    Estudiante est;
    ConeccionEstudiante cnnest;

    public OyenteEditarEstudiante(VentanaEstudiante vntest) {
        this.vntest = vntest;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        vntest.desbloquearCampos();
        est = vntest.guradarEstudiante();
        cnnest.editarEstudiante(est);
        JOptionPane.showMessageDialog(null, "Sus cambios han sido registrados ");
        vntest.limpiarCamposEstudinates();

    }
}

