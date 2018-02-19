package exemploficheiros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerPalabras {
    
    Scanner sc;
    File ficheiro;
    
    public void lerPalabras(){
        ficheiro = new File("/home/local/DANIELCASTELAO/ldizbarros/Documentos/PROG/Tema 5/primero.txt");
        try {
            sc =  new Scanner(ficheiro);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }    
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        sc.close();
    }
    
    public void lerPalabrasConDelimitador(){
        ficheiro = new File("/home/local/DANIELCASTELAO/ldizbarros/Documentos/PROG/Tema 5/primero.txt");
        try {
            sc =  new Scanner(ficheiro).useDelimiter("\\s*,\\s*");
            while(sc.hasNext()){
                System.out.println(sc.next());
            }    
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        sc.close();
    }
}
