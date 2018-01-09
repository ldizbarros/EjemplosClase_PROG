package com.laura.taller;

import com.laura.ventas.Ventas;
import exemplopaquetes.Coche;
import javax.swing.JOptionPane;

public class Taller {
    private Coche matricula;
    private float factura;

    public Taller() {
    }

    public Taller(Coche matricula, float factura) {
        this.matricula = matricula;
        this.factura = factura;
    }

    public Coche getMatricula() {
        return matricula;
    }

    public float getFactura() {
        return factura;
    }

    public void setMatricula(Coche matricula) {
        this.matricula = matricula;
    }

    public void setFactura(float factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Taller:\n Coche: \n" + matricula + "\n Factura: " + factura;
    }
    
    public void costeArranxo(Ventas coche){
        String matr1 = this.matricula.getMatricula();
        String matr2 =  coche.getCoche().getMatricula();
        
        if (matr1.equalsIgnoreCase(matr2)){
            System.out.println("Coche mercado en CochesVigo");
            factura=factura*0.8F;
        }else{
            System.out.println("Coche non mercado en CochesVigo");
        }
        
        System.out.println("O arreglo do coche costa : "+factura+" €");
    }
}
