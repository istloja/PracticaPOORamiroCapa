/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.ConeccionDocente;
import Vista.MostarListaDatosIngresados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lil
 */
public class OyenteListaDocente implements ActionListener {

    MostarListaDatosIngresados mldi;
    ConeccionDocente cnndct;

    public OyenteListaDocente(MostarListaDatosIngresados mldi) {
        this.mldi = mldi;
    }

    public void actionPerformed(ActionEvent arg0) {

        mldi.actualizarDocente(cnndct.cargarDocentes());
    }

}
