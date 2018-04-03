package exemploserializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Metodos {
    
    public String cadea(String s){
        return JOptionPane.showInputDialog(s);
    }
    
    public int enteiro(String s){
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }

    public void escribirFicheiro(String ficheiro){
        ObjectOutputStream fich = null;
        try{
            fich = new ObjectOutputStream(new FileOutputStream(ficheiro));
            for (int i = 0; i <2; i++) {
                Persoa p = new Persoa(cadea("nome :"),cadea("apelido :"),enteiro("edade :"),cadea("nome mascota :"),enteiro(" numero patas :"));
                fich.writeObject(p);
            }          
        } catch (IOException e){
             Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            if(fich != null){
                try {
                    fich.close();
                } catch (IOException ex) {
                    Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }   
    } 
    
    public void engadeFicheiro(String ficheiro) {
        MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;        
        try {
            esc = new MeuObjectOutputStream(new FileOutputStream(ficheiro,true));            
            for (int i = 0; i <1; i++){                
                Persoa p = new Persoa(cadea("nome :"),cadea("apelido :"),enteiro("edade :"),cadea("nome mascota :"),enteiro(" numero patas :"));
                esc.writeObject(p);
            }  
        } catch (IOException e) {
             Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            if(esc != null){
                try {
                    esc.close();
                } catch (IOException ex) {
                    Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void lerFicheiro(String ficheiro) throws IOException{
        ObjectInputStream ler = null;
        Persoa aux = null;
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
            aux=(Persoa)ler.readObject();
            while(aux!= null){
                System.out.println(aux.toString());
                aux=(Persoa)ler.readObject();
            }
        }catch (ClassNotFoundException ex) {
            System.out.println("erro 1" +ex.getMessage());                 
        }catch (IOException ex) {
            System.out.println("Se ha terminado de leer el fichero");
        }
        finally{
            if(ler != null){
                try {
                    ler.close();
                } catch (IOException ex) {
                    System.out.println("erro de peche "+ex.getMessage());
                }
            }
        }
    }
}
