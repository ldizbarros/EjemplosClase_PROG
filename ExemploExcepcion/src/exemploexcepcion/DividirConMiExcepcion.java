package exemploexcepcion;

import javax.swing.JOptionPane;

public class DividirConMiExcepcion {
    private int num;
    private int den;

    public DividirConMiExcepcion(){
    
    }
    public DividirConMiExcepcion(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    public void dividirMiExcepcion() throws MiExcepcion{
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numerador"));
        den = Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
        if (den==0){
            throw new MiExcepcion("NO SE PUEDE DIVIDIR ENTRE 0");
        }
        System.out.println(num+" / "+den+" = "+num/den);
    }
}
