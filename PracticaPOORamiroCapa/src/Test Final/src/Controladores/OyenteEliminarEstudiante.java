/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.ConeccionEstudiante;
import Vista.VentanaEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lil
 */
//con este metodo controlamos la accion del boton editar
public class OyenteEliminarEstudiante implements ActionListener {
//llamanos las clases 
    VentanaEstudiante vtnest;
    ConeccionEstudiante cest;

    public OyenteEliminarEstudiante(VentanaEstudiante vtnest) {

        this.vtnest = vtnest;

    }

    public void actionPerformed(ActionEvent e) {
        
//enviamos un mensaje de confirmacion 
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Datos", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resp == JOptionPane.YES_OPTION) {
        cest.eliminarEstudiante(vtnest.eliminarEstudiante());
        JOptionPane.showMessageDialog(null, "El estudiante ha sido eliminado");
        vtnest.limpiarCamposEstudinates();

         } else if (resp == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "El estudiante no ha sido eliminado");

        }
    }

}
