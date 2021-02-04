package br.com.bootcamp.Exerc14;

import java.time.LocalDate;

public class Venda {

    private Long id;

    private LocalDate data;

    public Venda(LocalDate data) { this.data = data; }

    public Long getId() { return id;}

    public void setId(Long id) { this.id = id; }

    public void setData(LocalDate data) { this.data = data; }

    public LocalDate getData() { return data; }

}
