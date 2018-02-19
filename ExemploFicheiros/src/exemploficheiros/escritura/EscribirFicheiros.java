package exemploficheiros.escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFicheiros {
    File ficheiro;
    PrintWriter escribir;
    FileWriter escribir2;
    
    public void escribirFrases(){
        try {
            ficheiro = new File("frases.txt");
            escribir = new PrintWriter(ficheiro);
            escribir.println("Hola");
            escribir.println("Soy el chico de las poesias");
            escribir.println("Tu fiel admirador");
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }  
    }
    
    public void añadirContenido() throws IOException{
        try {
            ficheiro = new File("frases.txt");
            escribir2 = new FileWriter(ficheiro, true);
            escribir2.write("hola caracola2");
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        finally{
            escribir2.close();
        }
    }
}
