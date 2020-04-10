/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.ConeccionDocente;
import Modelo.Docente;
import Vista.VentanaDocente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lil
 */
//con este metodo controlamos la accion del boton editar
public class OyenteEditarDocente implements ActionListener {
//llamos las clases
    VentanaDocente vntdct;
    Docente dct;
    ConeccionDocente cnndct;

    public OyenteEditarDocente(VentanaDocente vntdct) {
        this.vntdct = vntdct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        vntdct.desbloquearCampos();
        dct = vntdct.guardarDocente();
        cnndct.editarDocente(dct);
        JOptionPane.showMessageDialog(null, "Sus cambios han sido registrados ");
        vntdct.limpiarCamposDocentes();

    }
}
