package br.com.bootcamp.Exerc14;


import br.com.bootcamp.Exerc14.Venda;
import br.com.bootcamp.Exerc14.VendaService;

import java.time.LocalDate;
import java.util.List;

public class VendaServiceImpl implements VendaService {

    private final VendaService dao;

    public VendaServiceImpl(VendaService dao) {
        this.dao = dao;
    }

    @Override
    public List<Venda> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Venda buscarPorId(Long id) {
        return dao.buscarPorId(id);
    }

    @Override
    public Venda inserir(Venda objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public Venda alterar(Venda objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Long id) {
        dao.excluir(id);
    }

    @Override
    public Long totalVendas(LocalDate dataInicial, LocalDate dataFinal) {
        return dao.totalVendas(dataInicial, dataFinal);
    }
}
