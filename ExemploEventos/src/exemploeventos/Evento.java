package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

public class Evento implements ActionListener{
    JFrame marco = new JFrame("Ventana Eventos");
    JPanel panel  = new JPanel();
    JButton bAzul = new JButton("Azul");
    JButton bRojo = new JButton("Rojo");
    JButton bAmarillo = new JButton("Amarillo");
    
    public Evento(){
        marco.setSize(300,250);
        
        panel.add(bAzul);
        panel.add(bRojo);
        panel.add(bAmarillo);
        marco.add(panel);
        
        bAzul.addActionListener(this);
        bRojo.addActionListener(this);
        bAmarillo.addActionListener(this);
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton==bAzul){
            panel.setBackground(Color.BLUE);
        }else if (boton==bRojo){
            panel.setBackground(Color.RED);
        }else{
             panel.setBackground(Color.YELLOW);
        }
        
    }
}
