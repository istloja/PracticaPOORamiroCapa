/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.ConeccionEquipo;
import Modelo.Equipos;
import Vista.VentanaEquipos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
//con enste metodo controlamos la accion del boton
public class OyenteBuscarEquipo implements ActionListener {
//llamos las clases
    VentanaEquipos vnteqp;
    ConeccionEquipo cneqp;
    Equipos eqp;

    public OyenteBuscarEquipo(VentanaEquipos vnteqp) {
        this.vnteqp = vnteqp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        eqp = cneqp.buscarEquipo(vnteqp.verificarEquipo());
        // no esta llamar

        if (eqp.getNro_de_Serie() == null) {
            //si esta llamar-->>

            vnteqp.desbloquearCampos();
            JOptionPane.showMessageDialog(null, "Equipo no registardo");
            int resp = JOptionPane.showConfirmDialog(null, "Registar equipo ", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                vnteqp.desbloquearCampos();
            } else if (resp == JOptionPane.NO_OPTION) {
               vnteqp.bloquearCampos();
               vnteqp.limpiarCamposEquipo();
            }
           

        } else {
            //si esta llamar-->>
            vnteqp.limpiarCamposEquipo();
            vnteqp.bloquearCampos();
            vnteqp.cargarCampos(eqp);

        }
    }

}
