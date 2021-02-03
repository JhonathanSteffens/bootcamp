package br.com.bootcamp.exer4.aluno;

public class Aluno {
    private String nomeAluno;

    public Aluno (String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        nomeAluno = nomeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                '}';
    }
}
