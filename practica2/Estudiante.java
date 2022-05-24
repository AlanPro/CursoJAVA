package com.app.practica2;

import java.util.Scanner;

public class Estudiante extends Persona{
    private int nota1;
    private int nota2;
    private int nota3;

    public Estudiante() {
    }

    public Estudiante(int nota1, int nota2, int nota3) {

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    public Estudiante(String nombre, int edad, int nota1, int nota2, int nota3) {
        super(nombre, edad);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Nota 1 : "+this.getNota1());
        System.out.println("Nota 2 : "+this.getNota2());
        System.out.println("Nota 3 : "+this.getNota3());
        System.out.println("Promedio:"+this.promedio());
    }
    public void leerDatosEstudiante(){
        super.leerDatos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nota 1: ");
        nota1 = teclado.nextInt();
        System.out.println("Nota 2: ");
        nota2 = teclado.nextInt();
        System.out.println("Nota 3: ");
        nota3 = teclado.nextInt();
    }

    public float promedio(){
        return (nota1+nota2+nota3)/3;
    }

}
