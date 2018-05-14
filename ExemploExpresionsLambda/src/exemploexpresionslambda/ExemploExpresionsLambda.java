package exemploexpresionslambda;

public class ExemploExpresionsLambda {

    public static void main(String[] args) {
        Operacion obx = new Operacion();
        System.out.println("Suma: "+obx.operacion());
        
        EventoClaseAnonima ventanaEvento1 = new  EventoClaseAnonima();
        
        EventoExpresionLambda ventanaEvento2 = new EventoExpresionLambda();
    }
    
}
