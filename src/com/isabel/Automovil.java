package com.isabel;

public class Automovil {
    private String fabricante;
    private String añoFab;
    private String modelo;
    private int capLlenado;
    private String color;

    public Automovil() {
    }

    public Automovil(String fabricante, String añoFab, String modelo, int capLlenado, String color) {
        this.fabricante = fabricante;
        this.añoFab = añoFab;
        this.modelo = modelo;
        this.capLlenado = capLlenado;
        this.color = color;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(String añoFab) {
        this.añoFab = añoFab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapLlenado() {
        return capLlenado;
    }

    public void setCapLlenado(int capLlenado) {
        this.capLlenado = capLlenado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil\n" +
                "Fabricante= " + fabricante + '\n' +
                "Año de Fabricación= " + añoFab + '\n' +
                "Modelo= " + modelo + '\n' +
                "Capacidad de Llenado= " + capLlenado +'\n'+
                "Color= " + color +
                "\n\n" ;
    }
}
