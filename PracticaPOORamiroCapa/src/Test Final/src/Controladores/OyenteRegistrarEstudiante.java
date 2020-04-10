/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.ConeccionDocente;
import Modelo.ConeccionEstudiante;
import Modelo.Estudiante;
import Vista.VentanaDocente;
import Vista.VentanaEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lil
 */
public class OyenteRegistrarEstudiante implements ActionListener {

    VentanaEstudiante vtnest;
    Estudiante est;
    ConeccionEstudiante cnE;

    public OyenteRegistrarEstudiante(VentanaEstudiante vtnest) {
        this.vtnest = vtnest;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       //
        est = vtnest.guradarEstudiante();
        cnE.guardarEstudianteBD(est);
        vtnest.limpiarCamposEstudinates();
        JOptionPane.showMessageDialog(null, "Datos registrados");
        vtnest.bloquearCampos();
    }

}
