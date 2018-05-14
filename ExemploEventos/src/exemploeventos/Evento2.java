package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

public class Evento2 {
    JFrame marco = new JFrame("Ventana Eventos");
    JPanel panel  = new JPanel();
    JButton bAzul = new JButton("Azul");
    JButton bRojo = new JButton("Rojo");
    JButton bAmarillo = new JButton("Amarillo");
    
    public Evento2(){
        marco.setSize(300,250);
        
        panel.add(bAzul);
        panel.add(bRojo);
        panel.add(bAmarillo);
        marco.add(panel);
        
        PonColor color = new PonColor();
        bAzul.addActionListener(color);
        bRojo.addActionListener(color);
        bAmarillo.addActionListener(color);
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public class PonColor implements ActionListener{
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
}
