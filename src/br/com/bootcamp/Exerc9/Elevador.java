package br.com.bootcamp.Exerc9;

public class Elevador {
    private Integer andarAtual;
    private Integer totalAndares;
    private Integer capacidadePessoas;
    private Integer quantidadeAtual;

    public Elevador (
                     Integer totalAndares,
                     Integer capacidadePessoas
                     ){
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
        this.quantidadeAtual = 0;
    }

    public void entra(){
        if (quantidadeAtual < capacidadePessoas) {
            quantidadeAtual = quantidadeAtual + 1;
            System.out.println("Pessoa entrou no elevador!");
            System.out.println("Quantidade atual de pessoas no elevador: " + quantidadeAtual);
            System.out.println("-------------------------------");
        }
        else {
            System.out.println("Não é possível entrar mais pessoas no elevador");
            System.out.println("-------------------------------");
        }
    }

    public void sai(){
        if (quantidadeAtual > 0) {
            quantidadeAtual = quantidadeAtual - 1;
            System.out.println("Pessoa saiu do elevador!");
            System.out.println("Quantidade atual de pessoas no elevador: " + quantidadeAtual);
            System.out.println("-------------------------------");
        }
        else {
            System.out.println("O elevador está vazio");
            System.out.println("-------------------------------");
        }
    }

    public void sobe() {
        if(andarAtual < totalAndares){
            andarAtual++;
            System.out.println("O elevador subiu um andar");
            System.out.println("Agora o elevador está no "+ andarAtual + " andar");
            System.out.println("-------------------------------");
        } else{
            System.out.println("O elevador já está no seu andar máximo");
            System.out.println("-------------------------------");
        }
    }

    public void desce() {
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("O elevador desceu um andar");
            System.out.println("Agora o elevador está no "+ andarAtual + " andar");
            System.out.println("-------------------------------");
        } else{
            System.out.println("O elevador já está no térreo");
            System.out.println("-------------------------------");
        }
    }
}

