package exemploexpresionslambda;

public class Operacion{
    
    //Usando una expresion LAMBDA
    IOperable anon = (int a, int b) -> { return (a+b); };
    //Expresion reducida
    //IOperable anon = (a,b) -> {return (a+b);};
    
    public int operacion(){
        return anon.suma(5,3);
    }
    
    //Usando una clase anonima 
//    IOperable anonima = new IOperable(){
//        
//        @Override
//        public int suma(int a,int b){
//            return (a+b);
//        }
//    };
//    
//    public int operacion(){
//        return anonima.suma(5,3);
//    }
}
