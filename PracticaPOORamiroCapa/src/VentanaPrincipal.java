/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author SOFT06
 */
public class VentanaPrincipal {

    JFrame j = new JFrame();
    JPanel p = new JPanel();
    JMenuBar n = new JMenuBar();
    JMenu menu1;
    JMenu menu2;
    JMenuItem mCalc, mSalir;

    public VentanaPrincipal() {
        j.setTitle(" Ventana Principal ");
        j.setLocation(300, 300);
        j.setSize(400, 400);
        j.setResizable(true);
        components();
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void components() {
        j.setJMenuBar(n);
        menu1 = new JMenu("Programas");
        n.add(menu1);

        mCalc = new JMenuItem("Calculo de descuentos");
        mCalc.addActionListener(new AVentanaPrincipal());
        menu1.add(mCalc);

        mSalir = new JMenuItem("Salir");
        mSalir.addActionListener(new AVentanaPrincipal());
        menu1.add(mSalir);
       
    }

    public class AVentanaPrincipal implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == mSalir) {
                System.exit(0);
            }
            if (e.getSource() == mCalc) {
                new Ventana();
            }
        }

    }

}
