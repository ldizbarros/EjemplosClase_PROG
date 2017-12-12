package exemplointerruptor;

public class ExemploInterruptor {

    public static void main(String[] args) {
        
        int num=1,sw=0;
        
        while(num<=6){
            if (sw==0){
                System.out.println("Hola");
                sw=1;
            }else{
                System.out.println("Adios");
                sw=0;
            }
            num++;
        }
    }
    
}
