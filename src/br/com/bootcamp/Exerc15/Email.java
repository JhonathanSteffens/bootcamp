package br.com.bootcamp.Exerc15;

public class Email {
    private String de;
    private String para;
    private String titulo;
    private String conteudo;

    public Email(String de, String para) {
        this.de = de;
        this.para = para;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


}
