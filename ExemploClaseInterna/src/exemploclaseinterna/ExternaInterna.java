package exemploclaseinterna;

public class ExternaInterna {
    
    private int a = 8;
    
    public void verInterna(){
        Interna in = new Interna();
        in.amosar();
    }
   
    
    private class Interna{
        
        public void amosar(){
            System.out.println("desde a clase interna");
            System.out.println(a);
        }
    }
}
