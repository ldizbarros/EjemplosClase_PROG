package exemploserializacion;

import java.io.Serializable;

public class Persoa implements Serializable{
    private String nome,apelido;
    private int edade;
    private Mascota mascota = new Mascota();

    public Persoa() {
    }

    public Persoa(String nome, String apelido, int edade,String nomeMas,int numPatas) {
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
        mascota.setNome(nomeMas);
        mascota.setNumPatas(numPatas);
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getEdade() {
        return edade;
    }

    public Mascota getMas() {
        return mascota;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\napelido: " + apelido + "\nedade: " + edade + "\nmascota: " + mascota;
    }
}
