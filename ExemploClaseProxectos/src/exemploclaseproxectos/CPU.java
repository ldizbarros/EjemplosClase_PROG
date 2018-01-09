package exemploclaseproxectos;


public class CPU {
    private int memoria;
    private int velocidade;

    public CPU() {
    }

    public CPU(int memoria, int velocidade) {
        this.memoria = memoria;
        this.velocidade = velocidade;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "  Memoria: " + memoria + "\n  Velocidade: " + velocidade;
    }
    
}
