package Vista;

import java.awt.Color;
import static java.awt.Color.RED;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Nombres_Aleatorios  {
    
JFrame f=new JFrame();
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JList lst = new JList();
    JTextArea tx = new JTextArea(5, 5);
    JButton Bt = new JButton("oprimir");
   JTextField tf = new JTextField(10);
   JLabel l = new JLabel("ingrese un numero");
   

    public Nombres_Aleatorios() {
        //super("Nombres Aletoriamente");
        f.setSize(500, 500);
        f.setLocation(100, 100);
        componentes();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void componentes() {
        f.getContentPane().add(p);
        p.setBorder(BorderFactory.createLineBorder(Color.yellow));
        p.setBackground(Color.LIGHT_GRAY);
        p.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
        a.insets = new Insets(15, 10, 15, 10);
        a.gridx = 0;
        a.gridy = 0;
        p.add(p1, a);

        //p1
        p1.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        p1.setBackground(Color.MAGENTA);
         p1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
         
        b.insets = new Insets(5, 10, 5, 10);

        String Nombres[] = {"jhon","fernando","mario","michel","faviola"};

        lst = new JList(Nombres);

        a.gridx = 0;
        a.gridy = 0;
        p1.add(lst, b);
        
        //are
        b.gridx = 1;
        p1.add(tx, b);
        p.add(p1, b);

        //p2
        p.add(p2, a);
        p2.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        p2.setBackground(Color.CYAN);
         p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        c.insets = new Insets(3, 3, 3, 3);
        
        c.gridx = 0;
        c.gridy = 1;
        p2.add(tf, c);
        
        c.gridx = 0;
        c.gridy = 0;
        p2.add(l, c);

        c.gridx = 0;
        c.gridy = 2;
        p2.add(Bt, c);
        

        
        Bt.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                int p = lista1(lst.getSelectedIndex());

            }
            

            private int lista1(int p) {

                int a;
                a = ThreadLocalRandom.current().nextInt(0, Nombres.length);

                tx.setText(Nombres[a]);
                

                return 0;
            }
        });
        
        

    }

    public static void main(String[] args) {

       Nombres_Aleatorios  NA = new Nombres_Aleatorios();
    }
}
