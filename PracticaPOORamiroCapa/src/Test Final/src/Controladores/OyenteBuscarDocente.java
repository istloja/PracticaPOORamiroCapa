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

//con enste metodo controlamos la accion del boton  
public class OyenteBuscarDocente implements ActionListener {
//llamos las clases 
    VentanaDocente vntdct;
    ConeccionDocente cnd;
    Docente dct;

    public OyenteBuscarDocente(VentanaDocente vntdct) {
        this.vntdct = vntdct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        dct = cnd.buscarDocente(vntdct.verificarDocente());
        // no esta llamar

        if (dct.getNro_de_ID() == null) {
            //si no se encuntra registado havilita los campos parapoder registrar-->>

            vntdct.bloquearCampos();

            JOptionPane.showMessageDialog(null, "Docente no registardo");
            int resp = JOptionPane.showConfirmDialog(null, "Registar docente ", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                vntdct.desbloquearCampos();
            } else if (resp == JOptionPane.NO_OPTION) {
                vntdct.bloquearCampos();
                vntdct.limpiarCamposDocentes();
            }

        } else {
            //si se encuentra registado lo llama -->>

            vntdct.desbloquearCampos();
            vntdct.limpiarCamposDocentes();
            vntdct.bloquearCampos();
            vntdct.cargarCampos(dct);

        }
    }
}
