package exemploexcepcion;

public class ExemploExcepcion {

    public static void main(String[] args) {
        //CapturaExcepcion c1 = new CapturaExcepcion();
        //c1.dividirCaptura();

        //VariosCatch vc1 = new VariosCatch();
        //vc1.dividirCapturaVariosCatch();
        
        //ConFinally cf1 = new ConFinally();
        //cf1.dividirCapturaVariosCatchConFinally();
        
        //PropagarExcepcion pe1 = new PropagarExcepcion();
        //try{
        //    pe1.dividirPropagarExcepcion();
        //}catch(ArithmeticException e1){
        //    System.out.println(e1.getMessage());
        //}
        
        DividirConMiExcepcion dme1 = new DividirConMiExcepcion();
        try{
            dme1.dividirMiExcepcion();
        }catch(MiExcepcion e1){
            System.out.println(e1.getMessage());
        }
    }
    
} 