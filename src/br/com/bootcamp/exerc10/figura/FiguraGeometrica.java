package br.com.bootcamp.exerc10.figura;

public abstract class FiguraGeometrica implements Figura{
    double lado1;
    double lado2;

    public FiguraGeometrica(
            double lado1,
            double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
}
