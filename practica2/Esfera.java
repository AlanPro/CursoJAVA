package com.app.practica2;

import static com.app.practica2.CuerpoGeometrico.Pi;

public class Esfera {
    private float radio;

    public Esfera() {
    }

    public Esfera(float radio) {
        this.radio = radio;
    }

    public float calculaArea() {
        return radio*radio*4*Pi;
    }

    public float calculaVolumen() {
        return radio*radio*radio*4/3*Pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void mostrarDatos() {
        System.out.println("----Esfera----");
        System.out.println("Area :"+ calculaArea());
        System.out.println("Volumen :"+calculaVolumen());
    }
}
