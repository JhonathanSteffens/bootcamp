package br.com.bootcamp.exer4.livro;

public class Livro {
    private Integer id;
    private String nomeDoLivro;

    public Livro (Integer id, String nomeDoLivro){
        this.id = id;
        this.nomeDoLivro = nomeDoLivro;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nomeDoLivro='" + nomeDoLivro + '\'' +
                '}';
    }
}
