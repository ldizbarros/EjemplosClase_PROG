package exemploexcepcion;

public class MiExcepcion extends Exception{

    public MiExcepcion(){
        super("Informacion da excepcion");
    }
    public MiExcepcion(String message) {
        super(message);
    }
    
}
