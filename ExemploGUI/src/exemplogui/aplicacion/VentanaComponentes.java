package exemplogui.aplicacion;

import javax.swing.*;
import javax.swing.JPanel;

public class VentanaComponentes {
    
    JFrame marco = new JFrame("Ventana Componentes");
    JPanel panel  = new JPanel();
    JLabel etUsuario = new JLabel("Usuario:");
    JLabel etPass = new JLabel("Contrasinal:");
    JButton boton1 = new JButton("Engadir");
    JButton botonLimpar = new JButton("Limpar");
    JTextField jtUsuario = new JTextField(5);
    JPasswordField jpPass = new JPasswordField(5);
     
    public VentanaComponentes(){
        marco.setSize(500,300);
        
        etUsuario.setBounds(150, 50, 80, 30);
        panel.add(etUsuario);
        jtUsuario.setBounds(225, 55, 100, 25);
        panel.add(jtUsuario);
        etPass.setBounds(130, 100, 100, 30);
        panel.add(etPass);
        jpPass.setBounds(225, 105, 100, 25);
        panel.add(jpPass);
        boton1.setBounds(130, 160, 100, 30);
        panel.add(boton1);
        botonLimpar.setBounds(250, 160, 100, 30);
        panel.add(botonLimpar);
        panel.setLayout(null);
        
        marco.add(panel);
        
        //marco.pack();
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
