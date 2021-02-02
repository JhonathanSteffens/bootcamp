package br.com.bootcamp.exer3.grupoDePessoas;

import br.com.bootcamp.exer3.pessoa.Pessoa;

import java.time.LocalDate;
import java.time.Period;
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

    public void encontraMaiorIdade(List pessoasList) {
        if (!pessoasList.isEmpty()){
            LocalDate hoje = LocalDate.now();

            Pessoa primeirapessoa = getPessoasList().get(0);

            int maiorIdade = calculaIdade(primeirapessoa.getDataNascimento(), hoje);
            for(int i = 1; i < pessoasList.size(); i++){
                Pessoa pessoaAtual = getPessoasList().get(i);
                int idade = calculaIdade(pessoaAtual.getDataNascimento(), hoje);
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
            }

            List<Pessoa> maioresIdades = new ArrayList<>();

            for(int i = 0; i < pessoasList.size(); i++){
                Pessoa pessoaAtual = getPessoasList().get(i);
                int idade = calculaIdade(pessoaAtual.getDataNascimento(), hoje);
                if (idade == maiorIdade) {
                    maioresIdades.add(pessoaAtual);
                }
            }

            for(int i = 0; i < maioresIdades.size(); i++){
                Pessoa pessoaAtual = maioresIdades.get(i);
                System.out.println("Pessoa com maior idade: " + pessoaAtual);
            }
            System.out.println();
        }
    }

    public void encontraMenorIdade (List pessoasList) {
        if (!pessoasList.isEmpty()) {
            LocalDate hoje = LocalDate.now();

            Pessoa primeirapessoa = getPessoasList().get(0);

            int menorIdade = calculaIdade(primeirapessoa.getDataNascimento(), hoje);

            for(int i = 1; i < pessoasList.size(); i++){
                Pessoa pessoaAtual = getPessoasList().get(i);
                int idade = calculaIdade(pessoaAtual.getDataNascimento(), hoje);
                if (idade < menorIdade) {
                    menorIdade = idade;
                }
            }

            List<Pessoa> menoresIdades = new ArrayList<>();
            for(int i = 0; i < pessoasList.size(); i++) {
                Pessoa pessoaAtual = getPessoasList().get(i);
                int idade = calculaIdade(pessoaAtual.getDataNascimento(), hoje);
                if(idade == menorIdade){
                    menoresIdades.add(pessoaAtual);
                }
            }

            for(int i = 0; i < menoresIdades.size(); i++){
                Pessoa pessoaAtual = menoresIdades.get(i);
                System.out.println("A pessoa com a menor idade é:" + pessoaAtual);
            }
        }
    }


    public int calculaIdade (LocalDate dataInicial,
                                 LocalDate dataFinal){
        return  Period.between(dataInicial, dataFinal).getYears();

    }

    public List<Pessoa> getPessoasList() {
        return pessoasList;
    }


}





