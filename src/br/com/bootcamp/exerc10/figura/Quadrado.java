package br.com.bootcamp.exerc10.figura;

public class Quadrado extends FiguraGeometrica{

    public Quadrado(
           double lado1,
            double lado2
    ){
        super(lado1, lado2);
    }

    @Override
    public void getArea() {
        System.out.println("A área é: " + lado1*lado2);
    }
}
