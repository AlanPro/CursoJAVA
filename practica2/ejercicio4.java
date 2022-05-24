package com.app.practica2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        boolean sw = true;
        List<Electrodomestico> lista = new ArrayList<Electrodomestico>();

        while (sw) {
            System.out.println("-- MENU PRINCIPAL - PRODUCTOS --");
            System.out.println("1. Adicionar nuevo producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Editar un producto");
            System.out.println("5. Salir de la aplicación");
            System.out.print("#>");
            int opcion;
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Electrodomestico tmp = new Electrodomestico();
                    tmp.leerDatos();
                    lista.add(tmp);
                    break;
                case 2:

                    for (Electrodomestico el : lista){
                        el.mostrarDatos();
                    }
                    break;
                case 3:
                    List<Electrodomestico> lista2 = new ArrayList<Electrodomestico>();
                    String opcion2="N";
                    for (Electrodomestico el : lista){
                        el.mostrarDatos();
                        System.out.println("Desea Eliminar el Resgitro S/N");
                        opcion2 = teclado.next();
                        if(!opcion2.equals("S"))
                        {
                            lista2.add(el);
                        }
                    }
                    lista =lista2;
                    break;
                case 4:
                    List<Electrodomestico> lista3 = new ArrayList<Electrodomestico>();
                    String opcion3="N";
                    for (Electrodomestico el : lista){
                        el.mostrarDatos();
                        System.out.println("Desea Editar el Resgitro S/N");
                        opcion3 = teclado.next();
                        if(opcion3.equals("S"))
                        {
                            el.modificarDatos();
                            lista3.add(el);
                        }
                        else{
                            lista3.add(el);
                        }
                    }
                    lista =lista3;
                    break;
                case 5:
                    System.out.println("Saleindo ....");
                    sw = false;
                    break;
            }

        }

    }
}
