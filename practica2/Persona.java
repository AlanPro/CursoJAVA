package com.app.practica2;

import java.util.Scanner;

public class Persona {

    // Propiedades/Atributos de clase
    private String nombre;
    private int edad;

    // Constructor
    public Persona() {
        this.nombre = "Ninguno";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos Getter y Setter
    // Getter => Retornar valores de una propiedad
    // Setter => Asignar un valor a una propiedad
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

    // Otros metodos
    public String observacionEdad(){
        String observacion = this.edad > 18 ? "Mayor de edad": "Menor de edad";
        return observacion;
    }

    public void cumpleanios(){
        this.edad++; // this.edad = this.edad + 1;
    }

    public char obtenerInicial(){
        return this.nombre.charAt(0);
    }

    public void leerDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Edad : ");
        edad = teclado.nextInt();
        System.out.println("Nombre :");
        nombre = teclado.next();

    }

    public void mostrarDatos()
    {
        System.out.println("Nombre :"+this.getNombre());
        System.out.println("Edad :"+this.getEdad());

    }
}
