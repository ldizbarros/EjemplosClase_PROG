package exemplostream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Metodos {
    
    List <Alumno> listaAlumnos = new ArrayList();
    List <Alumno> listaSuspensos;
    
    public void crearLista(){
        listaAlumnos.add(new Alumno("111","Ana","DAM1",4));
        listaAlumnos.add(new Alumno("222","Ana","DAM1",8));
        listaAlumnos.add(new Alumno("333","Anton","DAM2",6));
        listaAlumnos.add(new Alumno("444","Brais","FPB",5));
        listaAlumnos.add(new Alumno("555","Alex","DAM1",3));
        listaAlumnos.add(new Alumno("666","Noa","ADM",7));
    }
    
    public void amosar(){
        crearLista();
        listaAlumnos.stream().forEach(alumno->System.out.println(alumno));
        //Usando referencias a metodos
        //listaAlumnos.stream().forEach(System.out::println);
    }
    
    public void amosarAlumnoDeterminado(){
        crearLista();
        listaAlumnos.stream().filter(al->al.getNome().startsWith("A")).forEach(System.out::println);
        //OTRA FORMA
        //listaAlumnos.stream().filter(al->al.getNome().charAt(0)=='A').forEach(System.out::println);
    }
    
    public void aprobados(){
        crearLista();
        listaAlumnos.stream().filter(al->al.getNota()>=5).forEach(System.out::println);
    }
    
    public void suspensos(){
        crearLista();
        listaSuspensos = listaAlumnos.stream().filter(al->al.getNota()<5).collect(Collectors.toList());
    }
    
    public void amosarSuspensos(){
        listaSuspensos.stream().forEach(System.out::println);
    }
    
    public void buscarAlumnoDNI(String dni){
        crearLista();
        listaAlumnos.stream().filter(al->al.getDni().equalsIgnoreCase(dni)).forEach(System.out::println);
    }
    
    public void maiorNota(){
        crearLista();
        System.out.println(listaAlumnos.stream().max(Comparator.comparing(a->a.getNota())).get());
        //System.out.println(listaAlumnos.stream().max((a1,a2)->a1.getNota()-a2.getNota()).get());
    }
    
    public void ordenar(){
        crearLista();
        listaAlumnos.stream().sorted((a1,a2)->a1.getNome().compareTo(a2.getNome())).forEach(System.out::println);  
    }
    
    public void subirNota(){
        crearLista();
        listaAlumnos.stream().map(a1->a1.getNota()+2).forEach(System.out::println);
    }
    
    public void subirNotaAprobados(){
        crearLista();
        listaAlumnos.stream().filter(al->al.getNota()>5).map(a1->a1.getNota()+2).forEach(System.out::println);
    }
}
