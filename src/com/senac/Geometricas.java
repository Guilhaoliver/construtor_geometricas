package com.senac;

public class Geometricas {

    private double ladoQuadrado;
    private double areaDoQuadrado;
    private double areaDoCirculo;
    private double areaDoTriangulo;
    private double pi;

    public Geometricas(double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
        this.pi = 3.14;
        this.areaDoQuadrado = calcularAreaDoQuadrado(ladoQuadrado);
        this.areaDoTriangulo = calcularAreaDoTriangulo(ladoQuadrado);
        this.areaDoCirculo = calcularAreaDoCirculo(ladoQuadrado);
    }

    private double calcularAreaDoCirculo(double ladoQuadrado) {
        return ((ladoQuadrado/2)*(ladoQuadrado/2))*pi;
    }

    private double calcularAreaDoTriangulo(double ladoQuadrado) {
        return (ladoQuadrado * ladoQuadrado) / 2;
    }

    private double calcularAreaDoQuadrado(double ladoQuadrado) {
        return ladoQuadrado * ladoQuadrado;
    }

    public double getLadoQuadrado() {
        return ladoQuadrado;
    }

    public void setLadoQuadrado(double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    public double getAreaDoQuadrado() {
        return areaDoQuadrado;
    }

    public void setAreaDoQuadrado(double areaDoQuadrado) {
        this.areaDoQuadrado = areaDoQuadrado;
    }

    public double getAreaDoCirculo() {
        return areaDoCirculo;
    }

    public void setAreaDoCirculo(double areaDoCirculo) {
        this.areaDoCirculo = areaDoCirculo;
    }

    public double getAreaDoTriangulo() {
        return areaDoTriangulo;
    }

    public void setAreaDoTriangulo(double areaDoTriangulo) {
        this.areaDoTriangulo = areaDoTriangulo;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
}
