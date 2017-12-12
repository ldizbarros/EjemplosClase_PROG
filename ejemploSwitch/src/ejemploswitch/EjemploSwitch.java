package ejemploswitch;

import java.util.Scanner;

public class EjemploSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clase1 c1 = new Clase1();
        
        System.out.println("****** MENU ******");
        System.out.println("1)LUNES \n2)MARTES \n3)MIERCOLES \n4)JUEVES \n5)VIERNES \n6)SABADO \n7)DOMINGO \n");
        System.out.println("Elige una opcion");
        int op = sc.nextInt();
        c1.comparar(op);
    }
    
}
