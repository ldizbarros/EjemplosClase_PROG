package exemploficheiros;

import exemploficheiros.escritura.EscribirFicheiros;
import exemploficheiros.lectura.LerFicheiro;
import exemploficheiros.lectura.LerNumeros;
import exemploficheiros.lectura.LerPalabras;
import exemploficheiros.lectura.LerObxetos;
import java.util.ArrayList;
import java.util.Iterator;
import exemploficheiros.persoas.Alumno;
import java.io.IOException;

public class ExemploFicheiros {

    public static void main(String[] args) throws IOException {
        LerFicheiro obx1 = new LerFicheiro();
        //obx1.leerLineas();
        
        LerPalabras obx2 = new LerPalabras();
        //obx2.lerPalabras();
        //obx2.lerPalabrasConDelimitador();
        
        LerNumeros obx3 = new LerNumeros();
        //obx3.lerNumeros();
        //obx3.sumaNuemrosPares();
        
        LerObxetos obx4 = new LerObxetos();
        //obx4.lerObxetos();
        
        //ArrayList <Alumno> lista = obx4.listaSuspensos();
        //Iterator it = lista.iterator();
        //while(it.hasNext()){
        //    System.out.println(it.next());
        //}
        
        EscribirFicheiros obx5 = new EscribirFicheiros();
        obx5.escribirFrases();
        obx5.añadirContenido();
    }
    
}
