package br.com.bootcamp.Exerc14;

import br.com.bootcamp.Exerc14.Venda;
import br.com.bootcamp.Exerc14.VendaDAO;

import java.time.LocalDate;
import java.util.List;

public interface VendaService {

    List<Venda> buscarTodos();

    Venda buscarPorId(Long id);


    Venda inserir(Venda objeto);

    Venda alterar(Venda objeto);

    void excluir(Long id);

    Long totalVendas(LocalDate dataInicial, LocalDate dataFinal);


}
