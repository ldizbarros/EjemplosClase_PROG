package exemploficheiros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerFicheiro {
    
    Scanner sc;
    File ficheiro;
    
    public void leerLineas(){
        //ficheiro = new File("/home/local/DANIELCASTELAO/ldizbarros/Documentos/PROG/Tema 5/primero.txt");
        ficheiro = new File("segundo.txt");
        try {
            sc =  new Scanner(ficheiro);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }    
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        sc.close();
    }
}
