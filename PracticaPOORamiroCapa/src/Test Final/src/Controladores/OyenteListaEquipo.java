/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Modelo.ConeccionEquipo;
import Vista.MostarListaDatosIngresados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Oscar
 */
public class OyenteListaEquipo implements ActionListener {

    MostarListaDatosIngresados mldi;
    ConeccionEquipo cnneqp;

    public OyenteListaEquipo(MostarListaDatosIngresados mldi) {
        this.mldi = mldi;
    }

    public void actionPerformed(ActionEvent arg0) {

        mldi.actualizarEquipo(cnneqp.cargarEquipo());
    }

}

