package exemplothis;

import javax.swing.JOptionPane;

public class ExemploThis {

    public static void main(String[] args) {
        
        Rectangulo rec1 = new Rectangulo(8,9);
        System.out.println("Rec1 --> "+rec1.toString());
        
        Rectangulo rec2 = new Rectangulo(6);
        System.out.println("Rec2 --> "+rec2.toString());
        
        Rectangulo rect1 = rec1.incrementar();
        System.out.println("Rect1 --> "+rect1.toString());
        
        rec2.mudarBase();
        System.out.println("Rec2 --> "+rec2.toString());
    }
    
}
