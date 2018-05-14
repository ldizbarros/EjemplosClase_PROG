package exemplotiposlambda;

import java.util.function.Supplier;

public class Persoa {
    
    private String nome;
    private String apelido;
    private String direccion;
    Supplier <Persoa> novaPersoa;

    public Persoa() {
    }

    public Persoa(String nome, String apelido, String direccion) {
        this.nome = nome;
        this.apelido = apelido;
        this.direccion = direccion;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nApelido: " + apelido + "\nDireccion: " + direccion;
    }
    
    public void crearPersoa(){
        novaPersoa = () -> {
            return (new Persoa("Pepita","Perez","Urzaiz"));
        };
    }
    
    public void verPersoa(){
        crearPersoa();
        System.out.println(novaPersoa.get());    
    }
}
