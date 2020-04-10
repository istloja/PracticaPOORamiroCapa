/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import FondoPanel.FondoPanel;
import Controladores.OyenteBuscarDocente;
import Controladores.OyenteEditarDocente;
import Controladores.OyenteEliminarDocente;
import Controladores.OyenteRegistarDocente;

import Modelo.Docente;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lil
 */
public class VentanaDocente extends JFrame {

    JTextField txtfCedula = new JTextField(20);
    JTextField txtfNombres = new JTextField(20);
    JTextField txtfApellidos = new JTextField(20);
    JComboBox cmbLaboratorio = new JComboBox();
    JComboBox cmbCarrera = new JComboBox();
    JComboBox cmbModulo = new JComboBox();
    JTextField txtfMateria = new JTextField(20);
    JTextField txtfFecha = new JTextField(20);
    JTextField txtfHoraIngreso = new JTextField(20);
    JTextField txtfHoraSalida = new JTextField(20);
    JButton btnGuardar = new JButton("Registrarse");
    JButton btnBuscar = new JButton("Buscar");
    JButton btnEditar = new JButton("Editar");
    JButton btnEliminar = new JButton("Eliminar");
    JButton btnSalir = new JButton("Salir");
    JButton btndesbloquear = new JButton("Habilitar");

    FondoPanel fondo = new FondoPanel();
    JPanel panel = new JPanel();
    Docente dct = new Docente();

    public VentanaDocente() {

        super("DATOS PERSONALES DEL DOCENTE");
        setSize(500, 500);
        setLocation(200, 200);
        setResizable(true);
        dispose();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AgregarComponentes();
        bloquearCampos();

    }

    public void AgregarComponentes() {

        getContentPane().add(fondo);
        fondo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fondo.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();

        a.anchor = GridBagConstraints.WEST;
        a.insets = new Insets(5, 10, 5, 10);

        a.gridx = 0;
        a.gridy = 0;
        fondo.add(txtfCedula, a);
        fondo.add(new JLabel("Cedula"), a);
        a.gridx = 1;
        fondo.add(txtfCedula, a);

        a.gridx = 2;
        fondo.add(btnBuscar, a);
        btnBuscar.addActionListener(new OyenteBuscarDocente(this)); //damos la accion al boton

        a.gridx = 0;
        a.gridy = 1;
        fondo.add(txtfNombres, a);
        fondo.add(new JLabel("Nombres"), a);
        a.gridx = 1;
        fondo.add(txtfNombres, a);

        a.gridx = 2;
        fondo.add(btndesbloquear, a);
        btndesbloquear.addActionListener(new habilitar()); //damos la accion al boton

        a.gridx = 0;
        a.gridy = 2;
        fondo.add(txtfApellidos, a);
        fondo.add(new JLabel("Apellidos"), a);
        a.gridx = 1;
        fondo.add(txtfApellidos, a);

        Vector vLaboratorio = new Vector();
        vLaboratorio.addElement("");
        vLaboratorio.addElement("Laboratorio de Informatica");
        vLaboratorio.addElement("Laboratorio de Idiomas");
        cmbLaboratorio = new JComboBox(vLaboratorio);
        cmbLaboratorio.setPreferredSize(new Dimension(225, 25));
        a.gridx = 0;
        a.gridy = 3;
        fondo.add(new JLabel("Laboratorio"), a);
        a.gridx = 1;
        fondo.add(cmbLaboratorio, a);
        a.gridx = 0;
        a.gridy = 4;

        //creamos un combobox
        Vector vCarrera = new Vector();
        vCarrera.addElement("");
        vCarrera.addElement("Tecnologia en Software");
        vCarrera.addElement("Tecnologia en Automotriz");
        vCarrera.addElement("TecnologÌa en Contabilidad");
        vCarrera.addElement("TecnologÌa en Electrónica");
        cmbCarrera = new JComboBox(vCarrera);
        cmbCarrera.setPreferredSize(new Dimension(225, 25));
        a.gridx = 0;
        a.gridy = 4;
        fondo.add(new JLabel("Carrera"), a);
        a.gridx = 1;
        fondo.add(cmbCarrera, a);
        a.gridx = 0;
        a.gridy = 5;

        //creamos un combobox
        Vector vModulo = new Vector();
        vModulo.addElement("");
        vModulo.addElement("I");
        vModulo.addElement("II");
        vModulo.addElement("III");
        vModulo.addElement("IV");
        vModulo.addElement("V");
        cmbModulo = new JComboBox(vModulo);
        cmbModulo.setPreferredSize(new Dimension(225, 25));
        fondo.add(new JLabel("Modulo"), a);
        a.gridx = 1;
        fondo.add(cmbModulo, a);
        a.gridx = 0;
        a.gridy = 5;

        a.gridx = 0;
        a.gridy = 6;
        fondo.add(txtfMateria, a);
        fondo.add(new JLabel("Materia"), a);
        a.gridx = 1;
        fondo.add(txtfMateria, a);

        a.gridx = 0;
        a.gridy = 7;
        fondo.add(txtfFecha, a);
        fondo.add(new JLabel("Fecha"), a);
        a.gridx = 1;
        fondo.add(txtfFecha, a);

        a.gridx = 0;
        a.gridy = 8;
        fondo.add(txtfHoraIngreso, a);
        fondo.add(new JLabel("Hora de Ingreso"), a);
        a.gridx = 1;
        fondo.add(txtfHoraIngreso, a);

        a.gridx = 0;
        a.gridy = 9;
        fondo.add(txtfHoraSalida, a);
        fondo.add(new JLabel("Hora de Salida"), a);
        a.gridx = 1;
        fondo.add(txtfHoraSalida, a);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(20, 0, 20, 0);

        c.gridx = 0;
        c.gridy = 10;
        panel.add(btnGuardar, c);
        c.gridx = 0;
        fondo.add(btnGuardar, c);
        btnGuardar.addActionListener(new OyenteRegistarDocente(this));//damos la accion al boton

        c.gridx = 0;
        c.gridy = 10;
        panel.add(btnEditar, c);
        c.gridx = 1;
        fondo.add(btnEditar, c);
        btnEditar.addActionListener(new OyenteEditarDocente(this));//damos la accion al boton

        c.gridx = 0;
        c.gridy = 10;
        panel.add(btnEliminar, c);
        c.gridx = 2;
        fondo.add(btnEliminar, c);
        btnEliminar.addActionListener(new OyenteEliminarDocente(this));//damos la accion al boton

        c.gridx = 2;
        c.gridy = 11;
        panel.add(btnSalir, c);
        c.gridx = 1;
        fondo.add(btnSalir, c);
        btnSalir.addActionListener(new OyenteSalir());//damos la accion al boton

    }

    public Docente guardarDocente() {

        dct = new Docente();

        dct.setNro_de_ID(txtfCedula.getText());
        dct.setNombres(txtfNombres.getText());
        dct.setApellidos(txtfApellidos.getText());
        dct.setLaboratorio((String) cmbLaboratorio.getSelectedItem());
        dct.setCarrera((String) cmbCarrera.getSelectedItem());
        dct.setModulo((String) cmbModulo.getSelectedItem());
        dct.setMateria((String) txtfMateria.getText());
        dct.setFecha(txtfFecha.getText());
        dct.setHora_Ingreso(txtfHoraIngreso.getText());
        dct.setHora_Salida(txtfHoraSalida.getText());

        return dct;
    }

    public void limpiarCamposDocentes() {
        txtfCedula.setText("");
        txtfNombres.setText("");
        txtfApellidos.setText("");
        cmbLaboratorio.setSelectedIndex(0);
        cmbCarrera.setSelectedIndex(0);
        cmbModulo.setSelectedIndex(0);
        txtfMateria.setText("");
        txtfFecha.setText("");
        txtfHoraIngreso.setText("");
        txtfHoraSalida.setText("");
    }

    public void bloquearCampos() {
        //  txtfCedula.setEditable(false);
        txtfNombres.setEditable(false);
        txtfApellidos.setEditable(false);
        cmbLaboratorio.setEditable(false);
        cmbCarrera.setEditable(false);
        cmbModulo.setEditable(false);
        txtfMateria.setEditable(false);
        txtfFecha.setEditable(false);
        txtfHoraIngreso.setEnabled(false);
        txtfHoraSalida.setEnabled(false);

    }

    public void desbloquearCampos() {
        txtfCedula.setEditable(true);
        txtfNombres.setEditable(true);
        txtfApellidos.setEditable(true);
        cmbLaboratorio.setEditable(true);
        cmbCarrera.setEditable(true);
        cmbModulo.setEditable(true);
        txtfMateria.setEditable(true);
        txtfFecha.setEditable(true);
        txtfHoraIngreso.setEnabled(true);
        txtfHoraSalida.setEnabled(true);
    }

    public String verificarDocente() {
        return txtfCedula.getText();

    }

    public void cargarCampos(Docente docente) {

        txtfCedula.setText(docente.getNro_de_ID());
        txtfNombres.setText(docente.getNombres());
        txtfApellidos.setText(docente.getApellidos());
        cmbLaboratorio.setSelectedItem(docente.getLaboratorio());
        cmbCarrera.setSelectedItem(docente.getCarrera());
        cmbModulo.setSelectedItem(docente.getModulo());
        txtfMateria.setText(docente.getMateria());
        txtfFecha.setText(docente.getFecha());
        txtfHoraIngreso.setText(docente.getHora_Ingreso());
        txtfHoraSalida.setText(docente.getHora_Salida());
    }

    public String eliminarDocente() {
        return txtfCedula.getText();

    }

    public class OyenteSalir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == btnSalir) {
                dispose();
            }
        }
    }

    public class habilitar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btndesbloquear) {
                desbloquearCampos();

            }
        }

    }

}
