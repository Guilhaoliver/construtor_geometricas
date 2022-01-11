package com.senac;

public class Quadrado {

    private double lado;
    private double area;

    public Quadrado(double lado) {
        this.lado = lado;
        this.calcularArea(lado);
    }

    private double calcularArea(double lado) {
        return area = lado * lado;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
