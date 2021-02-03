package br.com.bootcamp.exer4.gerenciador;

import br.com.bootcamp.exer4.aluno.Aluno;
import br.com.bootcamp.exer4.livro.Livro;
import br.com.bootcamp.exer4.solicitacao.SolicitacaoEmprestimo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmprestimo {

    public List<Aluno> alunos = new ArrayList<>();
    public List<Livro> livros = new ArrayList<>();
    public List<Livro> livrosEmprestados = new ArrayList<>();
    public List<Aluno> alunoEmprestado = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }


    public Integer livroDisponivel(Livro livro) {
        Integer variavelControle = 0;
        for (int i = 0; i < livros.size(); i++) {
            Livro livroAtual = livros.get(i);
            if (livro.getId() == livroAtual.getId()) {
                variavelControle = 1;
            }
        }


        return variavelControle;
    }

    public void emprestar(Livro livro, Aluno aluno) {
        if (livroDisponivel(livro) == 1) {
            System.out.println("O livro pode ser emprestado!");
            for (int i = 0; i < livros.size(); i++) {
                Livro livroAtual = livros.get(i);
                if (livro.getId() == livroAtual.getId()) {
                    livros.remove(livroAtual);
                    livrosEmprestados.add(livroAtual);
                    alunoEmprestado.add(aluno);
                }
            }
        }
        else {
            System.out.println("O livro solicitado não pode ser emprestado!");
        }
    }



    public List<Livro> getLivros() {
        return livros;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Aluno> getAlunoEmprestado() {
        return alunoEmprestado;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}
