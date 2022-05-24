package com.app.practica2;

import java.util.Scanner;

public class Electrodomestico {
    private String codigo;
    private String nombre;
    private String marca;
    private float precio;

    public Electrodomestico() {
    }

    public Electrodomestico(String codigo, String nombre, String marca, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public void leerDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Codigo :");
        codigo = teclado.next();
        System.out.println("Nombre: ");
        nombre = teclado.next();
        System.out.println("Marca: ");
        marca = teclado.next();
        System.out.println("Precio: ");
        precio = teclado.nextFloat();
    }

    public void modificarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre = teclado.next();
        System.out.println("Marca: ");
        marca = teclado.next();
        System.out.println("Precio: ");
        precio = teclado.nextFloat();
    }

    public void mostrarDatos(){
        System.out.println("------Electrodomestico-------");
        System.out.println("Codigo : "+this.getCodigo());
        System.out.println("Nombre : "+this.getNombre());
        System.out.println("Marca  : "+this.getMarca());
        System.out.println("Precio :"+this.getPrecio());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
