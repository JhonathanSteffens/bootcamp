package br.com.bootcamp.Exerc15.ValidacaoCliente;

import br.com.bootcamp.Exerc15.Cliente;

public class ValidaCliente {

    public void ValidaNomeCliente (Cliente cliente){
        if (cliente.getNome() == null) {
            throw new NomeObrigatorioNullException("O nome do cliente não pode ser nulo!");
        }
    }
}
