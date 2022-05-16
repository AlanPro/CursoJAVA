package com.app;

import java.util.Scanner;

public class Desarrollador extends Empleado{

    private int aniosExperiencia;
    private String descripcion;

    public Desarrollador()
    {
     super();
    }

    public void leerDatos(){
        super.leerDatos();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese Años de Experiencia: ");
        this.aniosExperiencia = teclado.nextInt();
        System.out.println("Ingrese Descripcion: ");
        this.descripcion = teclado.next();
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Ingrese Descripcion: "+this.descripcion);
        System.out.println("Ingrese Años de Experiencia: "+this.aniosExperiencia );
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
