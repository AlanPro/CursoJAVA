package com.app;

import java.util.Scanner;

public class DesarrolladorJava extends Desarrollador{
    private boolean expertoJSE;
    private boolean expertoJEE;

    public DesarrolladorJava() {

    }
    public void leerDatos(){
        super.leerDatos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Es experto en JSE: ");
        this.expertoJSE = teclado.nextBoolean();
        System.out.println("Es experto en JEE: ");
        this.expertoJEE = teclado.nextBoolean();
    }
    public void mostrarDatos(){
        System.out.println("--- EMPLEADO JAVA ---");
        super.mostrarDatos();
        System.out.println("Es experto en JSE: "+(this.expertoJSE?"Si":"No"));
        System.out.println("Es experto en JEE: "+(this.expertoJEE?"Si":"No"));
    }

    public boolean isExpertoJSE() {
        return expertoJSE;
    }

    public void setExpertoJSE(boolean expertoJSE) {
        this.expertoJSE = expertoJSE;
    }

    public boolean isExpertoJEE() {
        return expertoJEE;
    }

    public void setExpertoJEE(boolean expertoJEE) {
        this.expertoJEE = expertoJEE;
    }
}
