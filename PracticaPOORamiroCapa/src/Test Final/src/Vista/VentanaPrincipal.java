/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.OyenteVentanaPrincipal;
import FondoPanel.FondoPanelVentanaPrincipal;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Lil
 */
public class VentanaPrincipal {

    JFrame f = new JFrame();
    JMenuBar Menu = new JMenuBar();
    JMenuBar Informacion = new JMenuBar();
    JMenu menu1;
    JMenu menu2;

    JMenuItem est, dct, eqp, dtsing, Salir;

    FondoPanelVentanaPrincipal fondo = new FondoPanelVentanaPrincipal();

    public JMenuItem getEst() {
        return est;
    }

    public void setEst(JMenuItem est) {
        this.est = est;
    }

    public JMenuItem getDct() {
        return dct;
    }

    public void setDct(JMenuItem dct) {
        this.dct = dct;
    }

    public JMenuItem getEqp() {
        return eqp;
    }

    public void setEqp(JMenuItem eqp) {
        this.eqp = eqp;
    }

    public JMenuItem getDtsing() {
        return dtsing;
    }

    public void setDtsing(JMenuItem dtsing) {
        this.dtsing = dtsing;
    }

    public JMenuItem getSalir() {
        return Salir;
    }

    public void setSalir(JMenuItem Salir) {
        this.Salir = Salir;
    }

    public VentanaPrincipal() {
        f.setTitle("REGISTRO DE PERSONAL");

        f.setSize(500, 500);
        f.setLocation(200, 200);
        f.getContentPane().add(fondo);
        f.setResizable(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    public void iniciarComponentes() {

        f.setJMenuBar(Menu);

        menu1 = new JMenu("Menu");
        Menu.add(menu1);

        dct = new JMenuItem("Registro de Docentes");
        dct.addActionListener(new OyenteVentanaPrincipal(this));
        menu1.add(dct);

        est = new JMenuItem("Registro de Estudiantes");
        est.addActionListener(new OyenteVentanaPrincipal(this));
        menu1.add(est);

        eqp = new JMenuItem("Registro de Equipos");
        eqp.addActionListener(new OyenteVentanaPrincipal(this));
        menu1.add(eqp);

        dtsing = new JMenuItem("Datos Ingresados");
        dtsing.addActionListener(new OyenteVentanaPrincipal(this));
        menu1.add(dtsing);

        Salir = new JMenuItem("Salir");
        Salir.addActionListener(new OyenteVentanaPrincipal(this));
        menu1.add(Salir);

    }

}
