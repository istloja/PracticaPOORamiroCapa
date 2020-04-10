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
public class OyenteRegistarDocente implements ActionListener {

    VentanaDocente vntdct;
    Docente dct;
    ConeccionDocente cnD;

    public OyenteRegistarDocente(VentanaDocente vntdct) {
        this.vntdct = vntdct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
        
        dct = vntdct.guardarDocente();
        cnD.guardarDocenteBD(dct);
        vntdct.limpiarCamposDocentes();
        JOptionPane.showMessageDialog(null, "Datos registrados");
        vntdct.bloquearCampos();
    }

}
