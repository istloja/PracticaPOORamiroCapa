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
public class OyenteRegistrarEquipo implements ActionListener {

    VentanaEquipos vnteqp;
    Equipos eqp;
    ConeccionEquipo cnEqp;

    public OyenteRegistrarEquipo( VentanaEquipos vnteqp) {
        this.vnteqp = vnteqp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
       eqp = vnteqp.guardarEquipo();
        cnEqp.guardarEquiposBD(eqp);
        vnteqp.limpiarCamposEquipo();
        JOptionPane.showMessageDialog(null, "Datos registrados");
        vnteqp.bloquearCampos();
    }

   

}
