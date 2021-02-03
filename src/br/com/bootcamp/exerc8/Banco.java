package br.com.bootcamp.exerc8;

import br.com.bootcamp.exerc8.contaBancaria.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<ContaBancaria> contaBancariasList = new ArrayList<>();

    public void inserir(ContaBancaria conta) {

        contaBancariasList.add(conta);
    }

    public void remover(ContaBancaria conta) {
        contaBancariasList.remove(conta);
    }

    public ContaBancaria procurar(Integer numeroConta){
            if (!(contaBancariasList.size() == 0)){
                for(int i = 0; i < contaBancariasList.size(); i++){
                    if (contaBancariasList.get(i).numeroDaConta == numeroConta) {
                        return contaBancariasList.get(i);
                    }
                }
            }
        return null;
    }
}
