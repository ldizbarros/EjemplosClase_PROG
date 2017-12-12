package exemplometodos;

import java.util.Scanner;

public class ExemploMetodos {

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        Scanner sc = new Scanner(System.in);
        
        rec1.mostrar();
   
        System.out.print( "Introduzca la base del rectangulo " );
        float base = sc.nextFloat();
        System.out.print( "Introduzca la altura del rectangulo " );
        float altura = sc.nextFloat();
        
        Rectangulo rec2 = new Rectangulo(base,altura);
        rec2.mostrar();
        rec2.area(base,altura);
        
        System.out.println( "Perimetro = "+ rec2.perimetro(base,altura) );
        
        rec2.setBase(5);
        float al = rec2.getAltura();
        System.out.println("Altura = "+al);
        
        System.out.println(rec2.visualizar()   );
    }
    
}
