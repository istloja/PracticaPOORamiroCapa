/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SOFT06
 */
public class Ventana extends JFrame {

    JFrame v = new JFrame();
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JButton bt = new JButton(" CALCULAR ");
    JButton bt1 = new JButton(" SALIR ");
    JLabel l = new JLabel(" Precio: ");
    JLabel l1 = new JLabel(" Total: ");
    JLabel l2 = new JLabel(" Estudiante ");
    JLabel l3 = new JLabel(" Fumador ");
    JLabel l4 = new JLabel(" Menor de Edad ");
    JTextField t = new JTextField(15);
    JTextField t1 = new JTextField(15);
    JCheckBox ch = new JCheckBox();
    JCheckBox ch1 = new JCheckBox();
    JCheckBox ch2 = new JCheckBox();

    public Ventana() {
        v.setTitle(" Agencia de Viajes ");
        v.setLocation(300, 300);
        v.setSize(300, 450);
        v.setResizable(true);
        Componentes();
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);

    }

    public void Componentes() {
        v.getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
        a.gridx = 0;
        a.gridy = 0;
        a.insets = new Insets(5, 5, 5, 5);
        p.add(p1);

        p1.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        p1.setBackground(Color.LIGHT_GRAY);
        b.insets = new Insets(5, 5, 5, 5);

        b.gridx = 0;
        b.gridy = 1;
        p1.add(l, b);

        b.gridx = 1;
        p1.add(t, b);

        b.gridx = 0;
        b.gridy = 2;
        p1.add(l1, b);

        b.gridx = 1;
        b.gridy = 2;
        p1.add(t1, b);

        p2.setBackground(Color.PINK);
        a.gridy = 3;
        p.add(p2, a);

        p2.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);

        p2.add(ch, c);
        c.gridx = 1;

        p2.add(l2, c);
        c.gridx = 2;

        p2.add(ch1, c);
        c.gridx = 3;

        p2.add(l3, c);
        c.gridx = 4;

        p2.add(ch2, c);
        c.gridx = 5;

        p2.add(l4, c);
        c.gridx = 6;

        p3.setBackground(Color.GREEN);
        a.gridy = 4;
        p.add(p3, a);
        p3.setLayout(new GridBagLayout());
        GridBagConstraints d = new GridBagConstraints();
        d.gridx = 0;
        d.gridy = 0;

        p3.add(bt, d);
        d.gridx = 5;

        p3.add(bt1, d);
        d.gridx = 6;

    }

    public static void main(String[] args) {
        Ventana a = new Ventana();
    }

}
