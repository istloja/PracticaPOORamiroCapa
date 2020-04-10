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
//con enste metodo controlamos la accion del boton
public class OyenteBuscarEstudiante implements ActionListener {
//llamos las clases
    VentanaEstudiante vtnest;
    ConeccionEstudiante cnest;
    Estudiante est;

    public OyenteBuscarEstudiante(VentanaEstudiante vtnest) {
        this.vtnest = vtnest;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        est = cnest.buscarEstudiante(vtnest.verificarEstudiante());
        // no esta llamar

        if (est.getNro_de_ID() == null) {
            //si no se encuentra havulita los campos para registrar

            vtnest.bloquearCampos();
            
            JOptionPane.showMessageDialog(null, "Estudiante no registardo");
            int resp = JOptionPane.showConfirmDialog(null, "Registar estudiante ","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                vtnest.desbloquearCampos();
            } else if (resp == JOptionPane.NO_OPTION) {
                vtnest.bloquearCampos();
                vtnest.limpiarCamposEstudinates();
                
               
            }

            } else {
                //si se encuentra registrado lo llama a los campos

                
                vtnest.desbloquearCampos();
                vtnest.limpiarCamposEstudinates();
                vtnest.bloquearCampos();
                vtnest.cargarCampos(est);

            }
        }

    }
