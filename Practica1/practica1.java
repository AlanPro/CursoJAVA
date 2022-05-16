package com.app;

import java.util.Scanner;

public class practica1 {

    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("--------------- Registrar Factura" + i);
            System.out.println("Ingrese Nro: ");
            int nro = teclado.nextInt();
            System.out.println("Ingrese Nombre: ");
            String aNombreDe = teclado.next();
            System.out.println("Ingrese Nit: ");
            String nit = teclado.next();
            System.out.println("Ingrese dia: ");
            int dia = teclado.nextInt();
            System.out.println("Ingrese mes: ");
            int mes = teclado.nextInt();
            System.out.println("Ingrese año: ");
            int anio = teclado.nextInt();
            System.out.println("Ingrese Importe: ");
            float importe = teclado.nextFloat();
            System.out.println("Ingrese Descuento: ");
            int descuento = teclado.nextInt();

            Factura fac= new Factura(nro,aNombreDe,nit,dia,mes,anio,importe,descuento);
            fac.reporte();
        }*/

        DesarrolladorJava java1=new DesarrolladorJava();
        java1.leerDatos();
        java1.mostrarDatos();
        DesarrolladorJava java2=new DesarrolladorJava();
        java2.leerDatos();
        java2.mostrarDatos();

        DessarrolladorDoNet do1=new DessarrolladorDoNet();
        do1.leerDatos();
        do1.mostrarDatos();
        DessarrolladorDoNet do2=new DessarrolladorDoNet();
        do2.leerDatos();
        do2.mostrarDatos();

        DessarrolladorPhp php1=new DessarrolladorPhp();
        php1.leerDatos();
        php1.mostrarDatos();

        DessarrolladorPhp php2=new DessarrolladorPhp();
        php2.leerDatos();
        php2.mostrarDatos();



    }
}
