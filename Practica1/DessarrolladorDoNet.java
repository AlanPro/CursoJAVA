package com.app;

import java.util.Scanner;

public class DessarrolladorDoNet extends Desarrollador{
    private boolean expertoASP;
    private boolean expertoMVC;

    public DessarrolladorDoNet() {

    }
    public void leerDatos(){
        super.leerDatos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Es experto en ASP: ");
        this.expertoASP = teclado.nextBoolean();
        System.out.println("Es experto en MVC: ");
        this.expertoMVC = teclado.nextBoolean();
    }
    public void mostrarDatos(){
        System.out.println("--- EMPLEADO DoNet ---");
        super.mostrarDatos();
        System.out.println("Es experto en ASP: "+(this.expertoASP?"Si":"No"));
        System.out.println("Es experto en MVC: "+(this.expertoMVC?"Si":"No"));
    }

    public boolean isExpertoASP() {
        return expertoASP;
    }

    public void setExpertoASP(boolean expertoASP) {
        this.expertoASP = expertoASP;
    }

    public boolean isExpertoMVC() {
        return expertoMVC;
    }

    public void setExpertoMVC(boolean expertoMVC) {
        this.expertoMVC = expertoMVC;
    }
}
