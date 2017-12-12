package exemplothis;

public class Rectangulo {
    private float base;
    private float altura;
    
    public Rectangulo(){
        
    }
    public Rectangulo(float base,float altura){
        this.base=base;
        this.altura=altura;
    }
    //chamamos o constructor con this
    public Rectangulo(float b){
        this(b,4);
    }
    
    
    public void setBase(float b){
        base=b;
    }
    public void setAltura(float a){
        altura=a;
    }
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    
    @Override
    public String toString(){
        return "Rectangulo: Base = "+base+" Altura = "+altura;
    }
    
    public Rectangulo incrementar(){
        base++;
        altura+=2;
        return this;
    }
    
    public float area(){
        return base*altura;
    }
    
    public Rectangulo mudarBase(){
        base=15;
        return this;
    }
}
