/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Formulario;
import Vista.Menu;
import Vista.Nombres_Aleatorios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ISTLOJA_05
 */
public class OyenteVPrincipal implements ActionListener {

    Menu m;

    public OyenteVPrincipal(Menu m) {
        this.m=m;

    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        

            if (e.getSource() == m.getMiSalir()) {
                System.exit(0);

            }
            if (e.getSource() ==m.getMiFor()) {
                new Formulario();
            }
            if (e.getSource() == m.getMiAle()) {
                new Nombres_Aleatorios();

            }

        }

    }
    


