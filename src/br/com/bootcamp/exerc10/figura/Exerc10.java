package br.com.bootcamp.exerc10.figura;

public class Exerc10 {

    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(5, 5);

        quadrado.getArea();

        FiguraGeometrica triangulo = new Triangulo(6, 4);

        triangulo.getArea();

        FiguraGeometrica retangulo = new Retangulo(8, 4);

        retangulo.getArea();
    }
}
