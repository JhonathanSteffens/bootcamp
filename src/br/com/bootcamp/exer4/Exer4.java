package br.com.bootcamp.exer4;

import br.com.bootcamp.exer4.aluno.Aluno;
import br.com.bootcamp.exer4.gerenciador.GerenciadorEmprestimo;
import br.com.bootcamp.exer4.livro.Livro;

public class Exer4 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos");
        Aluno aluno2 = new Aluno("Antonio");
        Aluno aluno3 = new Aluno("Carolina");
        Aluno aluno4 = new Aluno("Renata");
        Aluno aluno5 = new Aluno("Jhonathan");

        Livro livro1 = new Livro(1, "Senhor dos Aneis" );
        Livro livro2 = new Livro(2, "O Pequeno Príncipe" );
        Livro livro3 = new Livro(3, "O Hobbit" );
        Livro livro4 = new Livro(4, "Jogos Vorazes" );
        Livro livro5 = new Livro(5, "Divergente" );
        Livro livro6 = new Livro(6, "Os Elefantes nunca Esquecem" );


        GerenciadorEmprestimo listaLivros = new GerenciadorEmprestimo();
        GerenciadorEmprestimo listaAlunos = new GerenciadorEmprestimo();
        GerenciadorEmprestimo livrosEmprestados = new GerenciadorEmprestimo();
        GerenciadorEmprestimo alunosEmprestados = new GerenciadorEmprestimo();

        listaAlunos.adicionarAluno(aluno1);
        listaAlunos.adicionarAluno(aluno2);
        listaAlunos.adicionarAluno(aluno3);
        listaAlunos.adicionarAluno(aluno4);
        listaAlunos.adicionarAluno(aluno5);

        listaLivros.adicionarLivro(livro1);
        listaLivros.adicionarLivro(livro2);
        listaLivros.adicionarLivro(livro3);
        listaLivros.adicionarLivro(livro4);
        listaLivros.adicionarLivro(livro5);
        listaLivros.adicionarLivro(livro6);

        for(int i = 0; i < listaAlunos.getAlunos().size(); i++){
            Aluno alunoAtual = listaAlunos.getAlunos().get(i);
            System.out.println("pessoaAtual: "+alunoAtual);
        }

        for(int i = 0; i < listaLivros.getLivros().size(); i++){
            Livro livroAtual = listaLivros.getLivros().get(i);
            System.out.println("livroAtual: "+livroAtual);
        }

        listaLivros.emprestar(livro1, aluno1);
        listaLivros.emprestar(livro2, aluno2);
        listaLivros.emprestar(livro3, aluno3);
        listaLivros.emprestar(livro3, aluno4);

        for(int i = 0; i < livrosEmprestados.getLivrosEmprestados().size(); i++){
            Livro livroAtual = livrosEmprestados.getLivrosEmprestados().get(i);
            System.out.println("Histórico de Empréstimo: " + livroAtual);
        }

        for(int i = 0; i < alunosEmprestados.getAlunoEmprestado().size(); i++){
            Aluno alunoAtual = alunosEmprestados.getAlunoEmprestado().get(i);
            System.out.println("Histórico de Empréstimo: " + alunoAtual);
        }

    }
}
