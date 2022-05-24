package com.app.practica2;

public class PruebaCuerpoGeometrico {
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(4);
        Cubo cubo2 = new Cubo(8);
        cubo1.mostrarDatos();
        cubo2.mostrarDatos();
        Esfera esfera1 = new Esfera(5F);
        Esfera esfera2 = new Esfera(8F);
        Esfera esfera3 = new Esfera(25F);
        esfera1.mostrarDatos();
        esfera2.mostrarDatos();
        esfera3.mostrarDatos();

    }
}
