package com.app;

import java.util.Scanner;

public class DessarrolladorPhp extends Desarrollador{
    private boolean expertoCodeIgniter;
    private boolean expertoMysql;

    public DessarrolladorPhp() {

    }
    public void leerDatos(){
        super.leerDatos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Es experto en CodeIgniter: ");
        this.expertoCodeIgniter = teclado.nextBoolean();
        System.out.println("Es experto en Mysql: ");
        this.expertoMysql = teclado.nextBoolean();
    }
    public void mostrarDatos(){
        System.out.println("--- EMPLEADO PHP ---");
        super.mostrarDatos();
        System.out.println("Es experto en CodeIgniter: "+(this.expertoCodeIgniter?"Si":"No"));
        System.out.println("Es experto en Mysql: "+(this.expertoMysql?"Si":"No"));


    }

    public boolean isExpertoCodeIgniter() {
        return expertoCodeIgniter;
    }

    public void setExpertoCodeIgniter(boolean expertoCodeIgniter) {
        this.expertoCodeIgniter = expertoCodeIgniter;
    }

    public boolean isExpertoMysql() {
        return expertoMysql;
    }

    public void setExpertoMysql(boolean expertoMysql) {
        this.expertoMysql = expertoMysql;
    }
}
