package exemplogui.aplicacion;

import javax.swing.JFrame;

public class Ventana2 extends JFrame{
    
    public Ventana2(){
        this.setSize(800,300);
        this.setLocationRelativeTo(this);
        this.setTitle("Ventana 2");
        //this.pack(); //hace que la ventana se ajuste a los elemntos que contiene
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
