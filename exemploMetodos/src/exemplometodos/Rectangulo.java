package exemplometodos;

public class Rectangulo {
    
    private float base,altura;
    
    //CONSTRUCTORES
    public Rectangulo(){
    }
    public Rectangulo(float base,float altura){
        this.base = base;
        this.altura = altura;
    }

    //METODOS DE ACCESO
    public void setBase(float b){
        base = b;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float a){
        altura = a;
    }
    public float getAltura(){
        return altura;
    }
    
    //METODOS
    public void mostrar(){
        System.out.println("base = "+base+" altura = "+altura);
    }
    public void area(float b,float al){
        float area = b*al;
        System.out.println("El area del rectangulo de base "+b+" y de altura "+al+" es "+area);
    }
    public float perimetro(float b,float a){
        float perimetro = b*2+a*2;
        return perimetro;
    }
    public String visualizar(){
        String visualizar= "base = "+base+" altura = "+altura;
        return visualizar;
    }
}
