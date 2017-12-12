package exemplobucles;

import java.util.Scanner;

/**
 * Realizar un programa que realice a suma e o producto de 7 numeros
 * que pedimos por teclado.
 */

public class ExemploBucles {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BucleWhile bw = new BucleWhile();
        BubleDoWhile bdw = new BubleDoWhile();
        BucleFor bf = new BucleFor();
        int op;
        
        do{
            System.out.println("\t****** MENU ******\n");
            System.out.println("\t1)WHILE \n\t2)DO...WHILE\n\t3)FOR\n\t0)SALIR \n");
            System.out.print("\tElige una opcion   ");
            op = sc.nextInt();
            switch (op){
                case 1:  bw.calcularWhile();
                    break;
                case 2:  bdw.calcularDoWhile();
                    break;
                case 3:  bf.calcularFor();
                    break;
                case 0: break;
            default: System.out.println("La opcion intoducida no es valida");
            }
        }while(op!=0);
  
    }
    
}
