package com.app;

public class Factura {
    private int nro;
    private String aNombreDe;
    private String nit;
    private int dia;
    private int mes;
    private int anio;
    private float importe;
    private int descuentoPorcentual;

    public Factura() {

    }

    public float totalCancelar() {
        return importe - (importe * descuentoPorcentual / 100);
    }

    public void reporte() {
        System.out.println("--- REPORTE FACTURA " + this.nro + " ---");
        System.out.println("Nro : " + this.nro);
        System.out.println("Nombre : " + this.aNombreDe);
        System.out.println("Fecha : " + this.dia+"/"+this.mes+"/"+this.anio);
        System.out.println("Importe : " + this.importe);
        System.out.println("Descuento : " + this.descuentoPorcentual+"%");
        System.out.println("Total a cancelar : " + this.totalCancelar());
    }

    public Factura(int nro, String aNombreDe, String nit, int dia, int mes, int anio, float importe, int descuentoPorcentual) {
        this.nro = nro;
        this.aNombreDe = aNombreDe;
        this.nit = nit;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.importe = importe;
        this.descuentoPorcentual = descuentoPorcentual;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getaNombreDe() {
        return aNombreDe;
    }

    public void setaNombreDe(String aNombreDe) {
        this.aNombreDe = aNombreDe;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getDescuentoPorcentual() {
        return descuentoPorcentual;
    }

    public void setDescuentoPorcentual(int descuentoPorcentual) {
        this.descuentoPorcentual = descuentoPorcentual;
    }
}
