package com.app.practica2;

public class Curso {
    private String nombreCurso;
    private double costo;
    private Docente docente = new Docente(); // Composicion
    private Estudiante estudiantes[];        // Agregacion

    public Curso(){
        this.nombreCurso = "Ninguno";
        this.costo = 0;
    }

    public Curso(String nombreCurso, double costo){
        this.nombreCurso = nombreCurso;
        this.costo = costo;
    }

    public int totalEstudiantesInscritos(){
        return getEstudiantes().length;
    }
    public int totalAprobados(){
        Estudiante[] v_estudiantes = getEstudiantes();
        int cant=0;
        for(int i=0;i<v_estudiantes.length;i++)
        {
            if (v_estudiantes[i].promedio()>51)
            {
                cant++;
            }
        }
        return cant;
    }
    public int totalReprobados(){
        Estudiante[] v_estudiantes = getEstudiantes();
        int cant=0;
        for(int i=0;i<v_estudiantes.length;i++)
        {
            if (v_estudiantes[i].promedio()<51)
            {
                cant++;
            }
        }
        return cant;
    }
    public void mostrarDatosEstudiante(){
        Estudiante[] v_estudiantes = getEstudiantes();

        for(int i=0;i<v_estudiantes.length;i++)
        {
            v_estudiantes[i].mostrarDatos();
        }

    }
    

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
}
