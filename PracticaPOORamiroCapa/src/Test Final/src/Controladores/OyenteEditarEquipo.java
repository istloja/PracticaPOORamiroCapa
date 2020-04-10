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
//con este metodo controlamos la accion del boton editar
public class OyenteEditarEquipo implements ActionListener {
//llamos las clases
    VentanaEquipos vnteqp;
    Equipos eqp;
    ConeccionEquipo cnneqp;

    public OyenteEditarEquipo(VentanaEquipos vnteqp) {
        this.vnteqp = vnteqp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        vnteqp.desbloquearCampos();
        eqp = vnteqp.guardarEquipo();
        cnneqp.editarEquipo(eqp);
        JOptionPane.showMessageDialog(null, "Sus cambios han sido registrados ");
        vnteqp.limpiarCamposEquipo();

    }

}