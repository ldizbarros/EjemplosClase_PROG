package exemploexpresionslambda;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

public class EventoExpresionLambda {
    JFrame marco = new JFrame("Ventana Eventos");
    JPanel panel  = new JPanel();
    JButton bAzul = new JButton("Azul");
    JButton bRojo = new JButton("Rojo");
    JButton bAmarillo = new JButton("Amarillo");
    
    public EventoExpresionLambda(){
        marco.setSize(300,250);
        
        panel.add(bAzul);
        panel.add(bRojo);
        panel.add(bAmarillo);
        marco.add(panel);
        
        ActionListener accion1 = (ActionEvent e) -> {panel.setBackground(Color.BLUE);};
        bAzul.addActionListener(accion1);
        
        bRojo.addActionListener((ActionEvent e) -> {
            panel.setBackground(Color.RED);
        });
        bAmarillo.addActionListener((ActionEvent e) -> {
            panel.setBackground(Color.YELLOW);
        });
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
