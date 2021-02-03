package br.com.bootcamp.exerc5;

public class Main {
    public static void main(String[] args) {

        Empregado empregado = new Empregado("Debora", "123",2500,150);
        double valor2 = empregado.calculaValorTotalSalario();
        System.out.println(empregado.getNome());
        System.out.println(valor2);
    }
}
