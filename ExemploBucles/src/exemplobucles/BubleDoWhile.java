package exemplobucles;

import java.util.Scanner;

public class BubleDoWhile {
    
    public void calcularDoWhile(){
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        int suma = 0;
        int mul = 1;
        
        do{
            System.out.println("Introduzca un numero: ");
            int num = sc.nextInt();
            suma+=num;
            mul*=num;
            cont++;
        }while(cont<7);
        
        System.out.println("Suma: "+suma+"\nMultiplicacion: "+mul);
    }
}
