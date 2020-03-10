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

/**
 *
 * @author ISTLOJA_05
 */
    public class OyenteEliminar implements ActionListener{

    Formulario vca;
    AlumnoBD abd;
    Alumno a;
    public OyenteEliminar(Formulario vca){
    
            this.vca=vca;
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
       
       //abd.eliminar( vca.());
        
        
    }
    
}
    

