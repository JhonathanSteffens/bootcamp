package br.com.bootcamp.exerc10.figura;

public class Retangulo  extends FiguraGeometrica {
    public Retangulo(
            double lado1,
            double lado2
    ){
        super(lado1, lado2);
    }

    @Override
    public void getArea() {
        System.out.println("A área do retangulo é: " + lado1*lado2);
    }
}
