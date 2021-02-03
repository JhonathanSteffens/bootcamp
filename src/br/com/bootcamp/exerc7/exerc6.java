package br.com.bootcamp.exerc7;

import br.com.bootcamp.exerc7.empregado.Empregado;
import br.com.bootcamp.exerc7.empregadocomicionado.EmpregadoComicionado;
import br.com.bootcamp.exerc7.gerente.Gerente;

import java.util.ArrayList;
import java.util.List;

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

        EmpregadoComicionado comissionado = new EmpregadoComicionado(
                "Debora",
                "123",
                100,
                20,
                500,
                10
        );

        double salarioComissionado = comissionado.calculaValorTotalSalario();
        System.out.println("salario Comissionado: " + salarioComissionado);

        List<EmpregadoComicionado> vendedores = new ArrayList<>();
        vendedores.add(comissionado);


        Empregado gerente = new Gerente(
                "Debora",
                "123",
                100,
                20,
                vendedores,
                10,
                500
        );
        double salarioGerente = gerente.calculaValorTotalSalario();
        System.out.println("salarioGerente: " + salarioGerente);
    }
}
