/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.OyenteVPrincipal;
import Vista.Formulario;
import Vista.Nombres_Aleatorios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author John Puglla
 */
public class Menu {

    JFrame f = new JFrame();

    JPanel p = new JPanel();
    JMenuBar m = new JMenuBar();
    JMenu menu1;
    JMenu menu2;

    JMenuItem miFor, miSalir, miAle;

    public JMenuItem getMiFor() {
        return miFor;
    }

    public void setMiFor(JMenuItem miFor) {
        this.miFor = miFor;
    }

    public JMenuItem getMiSalir() {
        return miSalir;
    }

    public void setMiSalir(JMenuItem miSalir) {
        this.miSalir = miSalir;
    }

    public JMenuItem getMiAle() {
        return miAle;
    }

    public void setMiAle(JMenuItem miAle) {
        this.miAle = miAle;
    }

    public Menu() {
        f.setTitle("VENTANA PRINCIPAL");
        f.setSize(500, 500);
        f.setLocation(200, 200);
        f.setResizable(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    public void iniciarComponentes() {

        f.setJMenuBar(m);

        menu1 = new JMenu("Menu");
        m.add(menu1);

        miFor = new JMenuItem("Formulario");
        miFor.addActionListener(new OyenteVPrincipal(this));
        menu1.add(miFor);

        miAle = new JMenuItem("Nombres Aleatorios");
        miAle.addActionListener(new OyenteVPrincipal(this));
        menu1.add(miAle);

        miSalir = new JMenuItem("Salir");
        miSalir.addActionListener(new OyenteVPrincipal(this));
        menu1.add(miSalir);

    }

}
