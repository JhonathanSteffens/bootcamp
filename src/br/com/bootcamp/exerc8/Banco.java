package br.com.bootcamp.exerc8;

import br.com.bootcamp.exerc8.contaBancaria.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<ContaBancaria> contaBancariasList = new ArrayList<>();

    public void inserir(ContaBancaria conta) {
        for(int i = 0; i < contaBancariasList.size(); i++){
            if (contaBancariasList.get(i).numeroDaConta == conta.numeroDaConta) {
                System.out.println("A conta já existe!");
                return;
            }
        }
        contaBancariasList.add(conta);
    }

    public void remover(ContaBancaria conta) {
        contaBancariasList.remove(conta);
    }

    public ContaBancaria procurar(Integer numeroConta){
                for(int i = 0; i < contaBancariasList.size(); i++){
                    if (contaBancariasList.get(i).numeroDaConta == numeroConta) {
                        return contaBancariasList.get(i);
                    }
                }
        return null;
    }
}
