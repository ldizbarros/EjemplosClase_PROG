package exemploficheiros.persoas;

public class Alumno {
    private String nome;
    private float nota;

    public Alumno() {
    }

    public Alumno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " ---> " + nota;
    }
}
