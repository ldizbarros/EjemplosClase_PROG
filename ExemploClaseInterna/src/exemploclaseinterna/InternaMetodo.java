package exemploclaseinterna;

public class InternaMetodo {
    
    public void ver(){
        
        class Interna{
            
            public void amosar(){
                System.out.println("desde a clase interna metodo");
            }
        }
        Interna obxInterna = new Interna();
        obxInterna.amosar();
    }
}
