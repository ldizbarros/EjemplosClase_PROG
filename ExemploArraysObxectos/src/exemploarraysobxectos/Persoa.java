package exemploarraysobxectos;

public class Persoa implements Comparable{
    private String nome;
    private String apelido1;
    private String dni;

    public Persoa() {
    }

    public Persoa(String nome, String apelido1, String dni) {
        this.nome = nome;
        this.apelido1 = apelido1;
        this.dni = dni;
    }

    public String getApelido1() {
        return apelido1;
    }

    public String getNome() {
        return nome;
    }

    public String getDni() {
        return dni;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Apelido: "+apelido1+"   -  DNI: " + dni;
    }

    //Esta funcion establece un criterio de comparacion para poder ordenar los objetos
    @Override
    public int compareTo(Object o) {
        Persoa per = (Persoa)o;  //Paso de un elemento global a un elemento Persoa
        if(dni.compareToIgnoreCase(per.getDni())>0){
            return 1;
        }else if(dni.compareToIgnoreCase(per.getDni())==0){
            return 0;
        }else{
            return -1;
        }
    }
}
