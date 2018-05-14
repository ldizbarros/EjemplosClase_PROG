package exemploclaseinterna;

public class InternaAnonima {
    
    IOperable anon = new IOperable(){
        
        @Override
        public void suma(double a,double b){
            System.out.println("Suma: "+(a+b));
        }
    };
    
    public void operacion(){
        anon.suma(3, 2);
    }
}
