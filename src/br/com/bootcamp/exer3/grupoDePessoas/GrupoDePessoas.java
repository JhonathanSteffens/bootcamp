package br.com.bootcamp.exer3.grupoDePessoas;

import br.com.bootcamp.exer3.pessoa.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class GrupoDePessoas {

    public List<Pessoa> pessoasList = new ArrayList<>();

    public void adicionar(Pessoa pessoa) {
        if (ehmaiorque18anos(pessoa.getDataNascimento())) {
            pessoasList.add(pessoa);
            System.out.println("Pessoa adicionada com sucesso");
        } else {
            System.out.println("Pessoa não pode ser adicionada pois é menor que 18 anos");
        }
    }


    public Boolean ehmaiorque18anos(LocalDate dataNascimento) {
        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNascimento.getYear();

        if (hoje.get(Calendar.MONTH) < dataNascimento.getMonthValue()) {
            idade--;
        } else {
            if (hoje.get(Calendar.MONTH) == dataNascimento.getMonthValue() && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.getDayOfMonth()) {
                idade--;
            }
        }
        return idade >= 18;
    }

    public List<Pessoa> getPessoasList() {
        return pessoasList;
    }
}





