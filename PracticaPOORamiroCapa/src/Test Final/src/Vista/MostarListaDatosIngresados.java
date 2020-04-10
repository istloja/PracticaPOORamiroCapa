/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import FondoPanel.FondoPanel;
import Controladores.OyenteListaDocente;
import Controladores.OyenteListaEquipo;
import Controladores.OyenteListaEstudiante;
import Modelo.TMDocente;
import Modelo.TMEquipo;
import Modelo.TMEstudiante;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Lil
 */
public class MostarListaDatosIngresados extends JFrame {

    FondoPanel fondo = new FondoPanel();

    JTable tablaDatosIngresdos;
    private JLabel jlistas;

    TMEstudiante modeloDatosEstudiantes;
    TMDocente modeloDatosDocentes;
    TMEquipo modeloDatosEquipo;

    public MostarListaDatosIngresados() {

        super("Lista de datos Ingressados");
        setLocation(500, 50);
        setSize(500, 500);
        getContentPane().add(fondo);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        this.agregarComponentes();
        setVisible(true);
    }

    private void agregarComponentes() {

        // establece objeto JButton para enviar las consultas
        JButton botonEstudiante = new JButton("Estudiante");
        JButton botonDocente = new JButton("Docente");
        JButton botonEquipo = new JButton("Equipo");

        botonEstudiante.addActionListener(new OyenteListaEstudiante(this));
        botonDocente.addActionListener(new OyenteListaDocente(this));
        botonEquipo.addActionListener(new OyenteListaEquipo(this));

        // crea objeto Box para manejar la colocación de areaConsulta y
        // botonEnviar en la GUI
        Box boxNorte = Box.createHorizontalBox();
        boxNorte.add(botonDocente);
        boxNorte.add(botonEstudiante);
        boxNorte.add(botonEquipo);

        // crea delegado de JTable para modeloTabla
        tablaDatosIngresdos = new JTable();
        add(boxNorte, BorderLayout.NORTH);

        add(new JScrollPane(tablaDatosIngresdos), BorderLayout.CENTER);

    }

    public void actualizarEstudiante(ArrayList lis) {

        modeloDatosEstudiantes = new TMEstudiante(lis);
        tablaDatosIngresdos.setModel(modeloDatosEstudiantes);
    }

    public void actualizarDocente(ArrayList lis) {

        modeloDatosDocentes = new TMDocente(lis);
        tablaDatosIngresdos.setModel(modeloDatosDocentes);

    }

    public void actualizarEquipo(ArrayList lis) {

        modeloDatosEquipo = new TMEquipo(lis);
        tablaDatosIngresdos.setModel(modeloDatosEquipo);

    }
}
