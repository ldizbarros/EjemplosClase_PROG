package exemploficheiros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerNumeros {
    Scanner sc;
    File ficheiro;
    
    public void lerNumeros(){
        ficheiro = new File("/home/local/DANIELCASTELAO/ldizbarros/Documentos/PROG/Tema 5/numeros.txt");
        try {
            sc =  new Scanner(ficheiro).useDelimiter("\\s*,\\s*");
            while(sc.hasNextInt()){
                System.out.println(sc.nextInt());
            }    
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        sc.close();
    }
    
    public void sumaNuemrosPares(){
        ficheiro = new File("/home/local/DANIELCASTELAO/ldizbarros/Documentos/PROG/Tema 5/numeros.txt");
        int suma=0,num;
        try {
            sc =  new Scanner(ficheiro).useDelimiter("\\s*,\\s*");
            while(sc.hasNextInt()){
                num=sc.nextInt();
                if (num%2==0){
                   suma=suma+num;
                }
            }
            System.out.println("A suma dos numeros pares e: "+suma);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        sc.close();
    }
}
