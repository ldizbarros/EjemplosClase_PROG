package exemploherdanza;

public class Persoa {
    private String nome;
    private String apelido;
    private int edade;
    
    public Persoa(){
        
    }
    public Persoa(String nome,String apelido,int edade){
        this.nome=nome;
        this.apelido=apelido;
        this.edade=edade;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nom){
        nome=nom;
    }
    public String getApelido(){
        return apelido;
    }
    public void setApelido(String ape){
        apelido=ape;
    }
    public int getEdade(){
        return edade;
    }
    public void setEdade(int ed){
        edade=ed;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
    }
    
    
}
