package exemploserializar2;

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
    
    public float decimal(String s){
        return Float.parseFloat(JOptionPane.showInputDialog(s));
    }
    
    public void escribirFicheiro(String ficheiro){
        ObjectOutputStream fich = null;
        try{
            fich = new ObjectOutputStream(new FileOutputStream(ficheiro));
            for (int i = 0; i <1; i++) {
                Mouse m = new Mouse(cadea("mouse:"));
                Rato r = new Rato(m);
                Pantalla p = new Pantalla(cadea("marca Pantalla"),decimal("pulgadas pantalla:"));
                CPU c = new CPU(enteiro("memoria CPU:"),enteiro("velocidade CPU:"));
                Ordenador o = new Ordenador(c,p,r);
                fich.writeObject(o);
            }          
        } catch (IOException e){
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            try {
                fich.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
    
    public void lerFicheiro(String ficheiro) throws IOException{
        ObjectInputStream ler = null;
        Ordenador aux = null;
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
            aux=(Ordenador)ler.readObject();
            while(aux!= null){
                System.out.println(aux.toString());
                aux=(Ordenador)ler.readObject();
            }
        }catch (ClassNotFoundException ex) {
            System.out.println("erro 1" +ex.getMessage());                 
        }catch (IOException ex) {
            System.out.println("Se ha terminado de leer el fichero");
        }
        finally{
            try {
                ler.close();
            } catch (IOException ex) {
                System.out.println("erro de peche "+ex.getMessage());
            }
        }
    }
    
    public void engadeFicheiro(String ficheiro) {
        MiObjectOutputStream esc = null;
        ObjectOutputStream fich = null;        
        try {
            esc = new MiObjectOutputStream(new FileOutputStream(ficheiro,true));            
            for (int i = 0; i <1; i++){                
                Mouse m = new Mouse(cadea("mouse:"));
                Rato r = new Rato(m);
                Pantalla p = new Pantalla(cadea("marca Pantalla"),decimal("pulgadas pantalla:"));
                CPU c = new CPU(enteiro("memoria CPU:"),enteiro("velocidade CPU:"));
                Ordenador o = new Ordenador(c,p,r);
                esc.writeObject(o);
            }  
        } catch (IOException e) {
             Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            try {
                esc.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
