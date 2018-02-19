package exemploficheiros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import exemploficheiros.persoas.Alumno;

public class LerObxetos {
    Scanner sc;
    
    public void lerObxetos(){
        String linea;
        String [] lista = new String[2];
        Alumno al;
        try {
            sc =  new Scanner(new File("alumnos.txt"));
            while(sc.hasNextLine()){
                linea = sc.nextLine();
                lista=linea.split(" ");
                al = new Alumno(lista[0],Float.parseFloat(lista[1]));
                System.out.println(al);
            }    
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        sc.close();
    }
    
    public ArrayList <Alumno> listaSuspensos(){
        String linea;
        String [] lista = new String[2];
        ArrayList <Alumno> listaSuspensos = new ArrayList();
        Alumno al;
        try {
            sc =  new Scanner(new File("alumnos.txt"));
            while(sc.hasNextLine()){
                linea = sc.nextLine();
                lista=linea.split(" ");
                float numero = Float.parseFloat(lista[1]);
                if (numero<5){
                    al = new Alumno(lista[0],Float.parseFloat(lista[1]));
                    listaSuspensos.add(al);
                }
            }    
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        sc.close();
        return listaSuspensos;
    }
}
