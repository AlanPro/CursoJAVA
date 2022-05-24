package com.app.practica2;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("a) Imprimir el primer carácter. Por ejemplo:");
        String in_a ="Programacion";
        System.out.println("IN ->"+ in_a);
        System.out.println("OUT ->"+ in_a.charAt(0));
        System.out.println("b) Imprimir el último carácter. Por ejemplo:");
        String in_b ="Programacion";
        System.out.println("IN ->"+ in_b);
        System.out.println("OUT ->"+ in_b.charAt(in_b.length()-1));
        System.out.println("c) Imprimir en forma inversa. Por ejemplo:\n");

        StringBuilder in_c = new StringBuilder("Programacion");
        System.out.println("IN ->"+ in_c.toString());
        System.out.println("OUT ->"+ in_c.reverse().toString());
        System.out.println("d) Imprimir cada carácter del string separado con un guion. Por Ejemplo:");
        String in_d ="Programacion";
        String in_d_res ="";
        for (int i = 0; i<in_d.length();i++)
        {
            in_d_res = in_d_res+" - "+ in_d.charAt(i);
        }
        System.out.println("IN ->"+ in_d);

        System.out.println("OUT ->"+ in_d.substring(1));
        System.out.println("e) Imprimir la cantidad de vocales almacenadas. Por ejemplo:");
        String in_e ="Programacion";
        System.out.println("IN ->"+ in_e);
        int cantidad = 0;
        for (int i = 0; i<in_d.length();i++) {
            if (in_e.charAt(i) == 'a' ||
                    in_e.charAt(i) == 'e' ||
                    in_e.charAt(i) == 'i' ||
                    in_e.charAt(i) == 'o' ||
                    in_e.charAt(i) == 'u')
            {cantidad++;}

        }
        System.out.println("OUT ->"+ cantidad);
    }
}
