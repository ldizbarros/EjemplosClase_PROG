package exemplogui.aplicacion;

import java.awt.Color;
import javax.swing.*;

public class Ventana {
    
    JFrame marco = new JFrame("Ventana 1");
    JPanel panel1,panel2;
    
    public Ventana(){
        marco.setSize(800,600);
        panel1  = new JPanel();
        panel2  = new JPanel();
        panel1.setBounds(0,0,800,150);
        panel2.setBounds(0,300,800,150);
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        marco.setLayout(null);
        marco.add(panel1);
        marco.add(panel2);
        //marco.setLocationRelativeTo(marco);
        //marco.pack(); //hace que la ventana se ajuste a los elemntos que contiene
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}