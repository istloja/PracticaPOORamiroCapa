/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.ConeccionEquipo;
import Vista.VentanaEquipos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
//con este metodo controlamos la accion del boton eliminar
public class OyenteEliminarEquipo implements ActionListener {
//llamamos las clases 
    VentanaEquipos vnteqp;
    ConeccionEquipo cdceqp;

    public OyenteEliminarEquipo(VentanaEquipos vnteqp) {

        this.vnteqp = vnteqp;

    }

    public void actionPerformed(ActionEvent e) {
        
//enviamos un mensaje de confirmacion
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Datos", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resp == JOptionPane.YES_OPTION) {

            cdceqp.eliminar(vnteqp.eliminarEquipo());
            JOptionPane.showMessageDialog(null, "El equipo  ha sido eliminado");
            vnteqp.limpiarCamposEquipo();

        } else if (resp == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "El equipo no ha sido eliminado");

        }

    }

}
