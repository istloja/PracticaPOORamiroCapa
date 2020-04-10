/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.MostarListaDatosIngresados;
import Vista.VentanaDocente;
import Vista.VentanaEquipos;
import Vista.VentanaEstudiante;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lil
 */
public class OyenteVentanaPrincipal implements ActionListener {

    VentanaPrincipal vtnpcl;

    public OyenteVentanaPrincipal(VentanaPrincipal vtnpcl) {
        this.vtnpcl = vtnpcl;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vtnpcl.getDct()) {
            new VentanaDocente();
        }
        if (e.getSource() == vtnpcl.getEst()) {
            new VentanaEstudiante();
        }
        if (e.getSource() == vtnpcl.getEqp()) {
            new VentanaEquipos();

        }
        if (e.getSource() == vtnpcl.getDtsing()) {
            new MostarListaDatosIngresados();

        }
        if (e.getSource() == vtnpcl.getSalir()) {
            System.exit(0);

        }
    }

}
