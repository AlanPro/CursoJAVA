package com.app.practica2;

import java.util.Scanner;

public class Docente extends Persona {
    private float sueldo;
    private String gradoAcademico;

    public Docente() {
    }

    public Docente(float sueldo, String gradoAcademico) {
        this.sueldo = sueldo;
        this.gradoAcademico = gradoAcademico;
    }

    public Docente(String nombre, int edad, float sueldo, String gradoAcademico) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.gradoAcademico = gradoAcademico;
    }

    public void leerDatosDocente() {
        super.leerDatos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sueldo: ");
        sueldo = teclado.nextFloat();
        System.out.println("Grado Academico:");
        gradoAcademico = teclado.next();
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo :" + this.sueldo);
        System.out.println("Grado Academico :" + this.gradoAcademico);
    }


    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
}
