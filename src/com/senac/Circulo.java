package com.senac;

public class Circulo {

    private double raio;
    private double pi;
    private double areaDoCirculo;

    public Circulo(double raio, double pi) {
        this.raio = raio;
        this.pi = pi;
        this.calcularAreaDoCirculo(pi , raio);
    }

    private double calcularAreaDoCirculo(double pi, double raio) {
        return areaDoCirculo = pi * (raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getAreaDoCirculo() {
        return areaDoCirculo;
    }

    public void setAreaDoCirculo(double areaDoCirculo) {
        this.areaDoCirculo = areaDoCirculo;
    }
}
