package com.app;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int edad;

    public Empleado() {

    }


    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void leerDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        this.nombre = teclado.next();
        System.out.println("Ingrese Edad: ");
        this.edad = teclado.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("Ingrese Nombre: " + this.nombre);
        System.out.println("Ingrese Edad: " + this.edad);

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
