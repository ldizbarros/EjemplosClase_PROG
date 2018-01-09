package com.laura.ventas;

import exemplopaquetes.Coche;

public class Ventas {
    private Coche coche;
    private int precio;
    private String marca;

    public Ventas() {
    }

    public Ventas(Coche coche, int precio, String marca) {
        this.coche = coche;
        this.precio = precio;
        this.marca = marca;
    }

    public Coche getCoche() {
        return coche;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ventas:\n Coche:\n" + coche + "\n Precio: " + precio + "\n Marca: " + marca;
    }
    
}
