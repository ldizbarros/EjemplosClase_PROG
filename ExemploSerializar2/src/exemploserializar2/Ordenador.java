package exemploserializar2;

import java.io.Serializable;

public class Ordenador implements Serializable{
    private CPU procesador;
    private Pantalla pantalla;
    private Rato rato;
    
    public Ordenador (CPU proce,Pantalla pantalla, Rato rato){
        procesador =  proce;
        this.pantalla = pantalla;
        this.rato = rato;
    }
    
    public Ordenador (){
        procesador = new CPU();
        pantalla = new Pantalla();
        rato = new Rato();
    }

    public CPU getProcesador() {
        return procesador;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public Rato getRato() {
        return rato;
    }

    public void setProcesador(CPU procesador) {
        this.procesador = procesador;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public void setRato(Rato rato) {
        this.rato = rato;
    }

    @Override
    public String toString() {
        return "Ordenador:\n Procesador: \n" + procesador + "\n Pantalla: \n" + pantalla + "\n Rato: \n" + rato;
    }
    
    
}
