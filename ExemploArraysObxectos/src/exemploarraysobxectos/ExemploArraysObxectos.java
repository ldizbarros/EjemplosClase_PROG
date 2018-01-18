package exemploarraysobxectos;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ExemploArraysObxectos {

    public static void main(String[] args) {
        MetodosArray obx1 = new MetodosArray();
        
        Persoa[] listaPersoas = {new Persoa("Laura","Diz","77461794W"),new Persoa("Pepe","Rodriguez","77489856R"),
            new Persoa("Luis","Perez","77412369F"),new Persoa("Ana","Sanchez","77458962T")};
        
        obx1.buscar(listaPersoas, "77461794W");
        
        Arrays.sort(listaPersoas);
        obx1.amosar(listaPersoas);
        
        obx1.amosar(listaPersoas);
        
        Persoa[] persoas = obx1.crearArray(4);
        obx1.amosar(persoas); 
    }
    
}
