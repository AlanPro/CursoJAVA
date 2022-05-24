package com.app.practica2;

public class Cubo implements CuerpoGeometrico {
    private int lado;

    public Cubo() {
    }

    public Cubo(int lado) {
        this.lado = lado;
    }

    public float calculaArea() {
        return 6 * lado * lado;
    }

    public float calculaVolumen() {
        return lado * lado * lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void mostrarDatos() {
        System.out.println("----CUBO----");
        System.out.println("Area :"+ calculaArea());
        System.out.println("Volumen :"+calculaVolumen());
    }


}
