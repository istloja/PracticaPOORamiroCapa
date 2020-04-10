/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.OyenteBuscarEquipo;
import Controladores.OyenteEditarDocente;
import Controladores.OyenteEditarEquipo;
import Controladores.OyenteEliminarDocente;
import Controladores.OyenteEliminarEquipo;
import Controladores.OyenteRegistarDocente;
import Controladores.OyenteRegistrarEquipo;
import FondoPanel.FondoPanel;
import Modelo.Equipos;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Lil
 */
public class VentanaEquipos extends JFrame {

    JTextField txtfTipodeEquipo = new JTextField(20);
    JTextField txtfNro_de_Serie = new JTextField(20);
    JTextField txtfMarca = new JTextField(20);
    JTextField txtfModelo = new JTextField(20);
    JTextField txtfPertenece = new JTextField(20);
    JTextField txtfSaladeUbicacion = new JTextField(20);
    JComboBox cmbEstado = new JComboBox();
    JComboBox cmbFuncionamiento = new JComboBox();
    JTextArea txtObservaciones = new JTextArea(5, 20);
    JButton btnGuardar = new JButton("Registrarse");
    JButton btnBuscar = new JButton("Buscar");
    JButton btnEditar = new JButton("Editar");
    JButton btnEliminar = new JButton("Eliminar");
    JButton btnSalir = new JButton("Salir");
    JButton btndesbloquear = new JButton("Habilitar");

    FondoPanel fondo = new FondoPanel();
    JPanel panel = new JPanel();
    Equipos eqp = new Equipos();

    public VentanaEquipos() {

        super("DATO DEL EQUIPO");
        setSize(650, 650);
        setLocation(100, 100);
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
        fondo.add(txtfTipodeEquipo, a);
        fondo.add(new JLabel("Tipo de Equipo"), a);
        a.gridx = 1;
        fondo.add(txtfTipodeEquipo, a);

        a.gridx = 2;
        fondo.add(btnBuscar, a);
        btnBuscar.addActionListener(new OyenteBuscarEquipo(this));//damos la accion al boton

        a.gridx = 0;
        a.gridy = 1;
        fondo.add(txtfNro_de_Serie, a);
        fondo.add(new JLabel("N° de Serie"), a);
        a.gridx = 1;
        fondo.add(txtfNro_de_Serie, a);

        a.gridx = 2;
        fondo.add(btndesbloquear, a);
        btndesbloquear.addActionListener(new havilitar());//damos la accion al boton

        a.gridx = 0;
        a.gridy = 2;
        fondo.add(txtfMarca, a);
        fondo.add(new JLabel("Marca"), a);
        a.gridx = 1;
        fondo.add(txtfMarca, a);

        a.gridx = 0;
        a.gridy = 3;
        fondo.add(txtfModelo, a);
        fondo.add(new JLabel("Modelo"), a);
        a.gridx = 1;
        fondo.add(txtfModelo, a);

        a.gridx = 0;
        a.gridy = 4;
        fondo.add(txtfPertenece, a);
        fondo.add(new JLabel("Pertenece a"), a);
        a.gridx = 1;
        fondo.add(txtfPertenece, a);

        a.gridx = 0;
        a.gridy = 5;
        fondo.add(txtfSaladeUbicacion, a);
        fondo.add(new JLabel("Sala de Ubicacion"), a);
        a.gridx = 1;
        fondo.add(txtfSaladeUbicacion, a);

        //creamos un combobox
        Vector vEstado = new Vector();
        vEstado.addElement("");
        vEstado.addElement("Bueno");
        vEstado.addElement("Regular");
        vEstado.addElement("Malo");
        cmbEstado = new JComboBox(vEstado);
        cmbEstado.setPreferredSize(new Dimension(225, 25));
        a.gridx = 0;
        a.gridy = 6;
        fondo.add(new JLabel("Estado"), a);
        a.gridx = 1;
        fondo.add(cmbEstado, a);

        //creamos un combo box
        Vector vFuncionamiento = new Vector();
        vFuncionamiento.addElement("");
        vFuncionamiento.addElement("Activo");
        vFuncionamiento.addElement("Inactivo");

        cmbFuncionamiento = new JComboBox(vFuncionamiento);
        cmbFuncionamiento.setPreferredSize(new Dimension(225, 25));
        a.gridx = 0;
        a.gridy = 7;
        fondo.add(new JLabel("Funcionamiento"), a);
        a.gridx = 1;
        fondo.add(cmbFuncionamiento, a);

        a.gridx = 0;
        a.gridy = 8;
        fondo.add(new JLabel("Observaciones"), a);
        a.gridx = 1;

        a.gridx = 0;
        a.gridy = 9;
        fondo.add(txtObservaciones, a);
        txtObservaciones.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        a.gridx = 1;
        fondo.add(txtObservaciones, a);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(20, 0, 20, 0);

        c.gridx = 0;
        c.gridy = 10;
        panel.add(btnGuardar, c);
        c.gridx = 0;
        fondo.add(btnGuardar, c);
        btnGuardar.addActionListener(new OyenteRegistrarEquipo(this));//damos la accion al boton

        c.gridx = 0;
        c.gridy = 10;
        panel.add(btnEditar, c);
        c.gridx = 1;
        fondo.add(btnEditar, c);
        btnEditar.addActionListener(new OyenteEditarEquipo(this));//damos la accion al boton

        c.gridx = 0;
        c.gridy = 10;
        panel.add(btnEliminar, c);
        c.gridx = 2;
        fondo.add(btnEliminar, c);
        btnEliminar.addActionListener(new OyenteEliminarEquipo(this));//damos la accion al boton

        c.gridx = 2;
        c.gridy = 11;
        panel.add(btnSalir, c);
        c.gridx = 1;
        fondo.add(btnSalir, c);
        btnSalir.addActionListener(new OyenteSalir());//damos la accion al boton

    }

    public Equipos guardarEquipo() {

        eqp = new Equipos();

        eqp.setTipodeEquipo(txtfTipodeEquipo.getText());
        eqp.setNro_de_Serie(txtfNro_de_Serie.getText());
        eqp.setMarca(txtfMarca.getText());
        eqp.setModelo(txtfModelo.getText());
        eqp.setPertenece(txtfPertenece.getText());
        eqp.setSala_de_Ubicacion(txtfSaladeUbicacion.getText());
        eqp.setEstado((String) cmbEstado.getSelectedItem());
        eqp.setFuncionamiento((String) cmbFuncionamiento.getSelectedItem());
        eqp.setObservaciones(txtObservaciones.getText());

        return eqp;
    }

    public void limpiarCamposEquipo() {

        txtfTipodeEquipo.setText("");
        txtfNro_de_Serie.setText("");
        txtfMarca.setText("");
        txtfModelo.setText("");
        txtfPertenece.setText("");
        txtfSaladeUbicacion.setText("");
        cmbEstado.setSelectedIndex(0);
        cmbFuncionamiento.setSelectedIndex(0);
        txtObservaciones.setText("");
    }

    public void bloquearCampos() {

        txtfTipodeEquipo.setEditable(false);

        txtfMarca.setEditable(false);
        txtfModelo.setEditable(false);
        txtfPertenece.setEditable(false);
        txtfSaladeUbicacion.setEditable(false);
        cmbEstado.setEditable(false);
        cmbFuncionamiento.setEditable(false);
        txtObservaciones.setEditable(false);

    }

    public void desbloquearCampos() {
        txtfTipodeEquipo.setEditable(true);
        txtfNro_de_Serie.setEditable(true);
        txtfMarca.setEditable(true);
        txtfModelo.setEditable(true);
        txtfPertenece.setEditable(true);
        txtfSaladeUbicacion.setEditable(true);
        cmbEstado.setEditable(true);
        cmbFuncionamiento.setEditable(true);
        txtObservaciones.setEditable(true);

    }

    public String verificarEquipo() {

        return txtfNro_de_Serie.getText();
    }

    public void cargarCampos(Equipos equipo) {

        txtfTipodeEquipo.setText(equipo.getTipodeEquipo());
        txtfNro_de_Serie.setText(equipo.getNro_de_Serie());
        txtfMarca.setText(equipo.getMarca());
        txtfModelo.setText(equipo.getModelo());
        txtfPertenece.setText(equipo.getPertenece());
        txtfSaladeUbicacion.setText(equipo.getSala_de_Ubicacion());
        cmbEstado.setSelectedItem(equipo.getEstado());
        cmbFuncionamiento.setSelectedItem(equipo.getFuncionamiento());
        txtObservaciones.setText(equipo.getObservaciones());
    }

    public String eliminarEquipo() {
        return txtfNro_de_Serie.getText();

    }

    public class OyenteSalir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btnSalir) {
                dispose();
            }
        }

    }

    public class havilitar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btndesbloquear) {
                desbloquearCampos();

            }
        }
    }

}
