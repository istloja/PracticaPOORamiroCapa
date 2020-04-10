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
//con este metodo controlamos la accion del boton eliminar
public class OyenteEliminarDocente implements ActionListener {
//llamanos las clases 

    VentanaDocente vntdct;
    ConeccionDocente cdct;

    public OyenteEliminarDocente(VentanaDocente vntdct) {

        this.vntdct = vntdct;

    }

    public void actionPerformed(ActionEvent e) {

//enviamos un mensaje de confirmacion
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Datos", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resp == JOptionPane.YES_OPTION) {
            cdct.eliminar(vntdct.eliminarDocente());
            JOptionPane.showMessageDialog(null, "Datos del deocente eliminados");
            vntdct.limpiarCamposDocentes();

        } else if (resp == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "El docente no ha sido eliminado");

        }

    }

}
