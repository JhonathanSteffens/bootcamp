package br.com.bootcamp.exerc6;

import br.com.bootcamp.exerc6.empregado.Empregado;
import br.com.bootcamp.exerc6.empregadocomicionado.EmpregadoComicionado;

public class exerc6 {
    public static void main(String[] args) {
        Empregado empregado = new Empregado(
                "Debora",
                "123",
                100,
                10
        );
        double salarioEmpregado = empregado.calculaValorTotalSalario();
        System.out.println("salarioEmpregado: " + salarioEmpregado);

        Empregado comissionado = new EmpregadoComicionado(
                "Debora",
                "123",
                100,
                20,
                500,
                10
        );
        double salarioComissionado = comissionado.calculaValorTotalSalario();
        System.out.println("salarioComissionado: " + salarioComissionado);
    }
}
