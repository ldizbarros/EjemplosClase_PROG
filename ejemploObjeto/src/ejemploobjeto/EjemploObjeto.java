package ejemploobjeto;

public class EjemploObjeto {

    public static void main(String[] args) {
        Semaforo unsemaforo = new Semaforo();   //Instancio un objeto de tipo semmaforo
        Semaforo outrosemaforo = new Semaforo();
        Semaforo tercersemaforo = new Semaforo();
        
        unsemaforo.darCor("rojo");
        String respuesta = unsemaforo.dimeCor();
        System.out.println(respuesta);

        outrosemaforo.darCor("amarillo");
        respuesta = outrosemaforo.dimeCor();
        System.out.println(respuesta);
        
        tercersemaforo.darCor("verde");
        System.out.println(tercersemaforo.dimeCor());
        
    }
    
}
