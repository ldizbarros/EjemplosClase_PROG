package exemplocondicional1;

import java.util.Scanner;


public class ExemploCondicional1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro numero:");
        int num2 = sc.nextInt();
        
        if (num1==num2){
            System.out.println("LOs numeros son iguales");
        }
        else if (num1>num2){
                System.out.println(num1+" es mayor que "+num2);
            }
            else{
                System.out.println(num1+" es menor que "+num2);
            }
        
        //Tamen se pode facer asi:
        //String respuesta = (num1>num2)?num1+" es mayor que "+num2:num1+" es menor que "+num2;
        //System.out.println(respuesta);
    }
    
}
