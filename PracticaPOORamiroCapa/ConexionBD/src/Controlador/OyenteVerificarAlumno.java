/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SOFT06
 */
public class OyenteVerificarAlumno implements ActionListener {

    Formulario f;
    AlumnoBD adb;
    Alumno a;

    public OyenteVerificarAlumno(Formulario f) {//es un metodo para construir objetos de la clase
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
          a=adb.buscarAlumno(f.verificarAlumno());
          //no esta, llamar al siguiente
        if (a.getNumero_De_Id()==null) {
            f.limpiarCampos();
            f.desbloquerCampos();
            
        }else{
// si esta llamar al metodo buscar
            
            f.bloquerCampos();           
            JOptionPane.showMessageDialog(null, "El Alumno ya esta registrado");
            f.cargarCampos(a);
            
            
        }
        
    
    
    
  
    }

}
