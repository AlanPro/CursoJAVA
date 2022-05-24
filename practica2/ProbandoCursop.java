package com.app.practica2;

import java.util.Scanner;

public class ProbandoCursop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("******* SISTEMA DE INSCRIPCIONES ********");
        Curso cur01 = new Curso();
        System.out.println("Ingrese nombre del curso: ");
        cur01.setNombreCurso(teclado.next());
        System.out.println("Ingrese costo del curso: ");
        cur01.setCosto(teclado.nextDouble());

        // 2. Leer datos del docente: nombre, edad, sueldo,...
        System.out.println("-- INGRESE DATOS DEL DOCENTE");
        Docente doc = new Docente();
        doc.leerDatosDocente();
        cur01.setDocente(doc);

        // 3. Cantidad de estudiantes inscritos.
        System.out.println("-- DATOS DE ESTUDIANTES");
        System.out.println("Ingresar cantidad de estudiantes: ");
        int cantidadEstudiantes = teclado.nextInt();
        Estudiante estudiantes[] = new Estudiante[cantidadEstudiantes];
        // cur01.setEstudiantes(estudiantes);

        // 4. Leer datos de los estudiantes.
        for(int i = 0; i<cantidadEstudiantes; i++){
            System.out.println("--- INGRESAR ESTUDIANTE " + (i+1));
            Estudiante est = new Estudiante();
            est.leerDatosEstudiante();
            estudiantes[i] = est;
        }
        cur01.setEstudiantes(estudiantes);

        // 5. Mostrar datos del curso y los estudiantes
        System.out.println("****************************************");
        System.out.println("******** REPORTE DEL CURSO *************");
        System.out.println("****************************************");
        System.out.println("Curso: " + cur01.getNombreCurso());
        System.out.println("Costo: " + cur01.getCosto());

        System.out.println("Docente: " + cur01.getDocente().getGradoAcademico()
                + " " + cur01.getDocente().getNombre());
        System.out.println("Sueldo docente: " + cur01.getDocente().getSueldo());
        System.out.println("------- LISTA DE ESTUDIANTES -------");
        System.out.println("# \t NOMBRE \t EDAD \t N1 \t  N2 \t  N3 \t PROM");
        for (int i=0; i<cur01.getEstudiantes().length; i++){
            System.out.println((i+1) + "\t" +
                    cur01.getEstudiantes()[i].getNombre() + "\t" +
                    cur01.getEstudiantes()[i].getEdad() + "\t" +
                    cur01.getEstudiantes()[i].getNota1() + "\t" +
                    cur01.getEstudiantes()[i].getNota2() + "\t" +
                    cur01.getEstudiantes()[i].getNota3() + "\t" +
                    cur01.getEstudiantes()[i].promedio() + "\t");
        }
    }
}
