package br.com.bootcamp.exerc10.figura;

public class Triangulo extends FiguraGeometrica{
    public Triangulo(
            double lado1,
            double lado2
    ){
        super(lado1, lado2);
    }

    @Override
    public void getArea() {
        System.out.println("A área do triangulo é: " + lado1 * lado2 / 2);
    }

}
