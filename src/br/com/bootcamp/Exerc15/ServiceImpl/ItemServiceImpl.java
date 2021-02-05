package br.com.bootcamp.Exerc15.ServiceImpl;

import br.com.bootcamp.Exerc15.DAO.ItemDAO;
import br.com.bootcamp.Exerc15.Item;
import br.com.bootcamp.Exerc15.Service.ItemService;
import br.com.bootcamp.Exerc15.ValidacaoCliente.NomeObrigatorioNullException;
import br.com.bootcamp.Exerc15.ValidacaoItem.ItemInativoException;
import br.com.bootcamp.Exerc15.ValidacaoItem.ValidaItem;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    private final ItemDAO dao;

    public ItemServiceImpl(ItemDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Item> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Item buscar(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public Item inserir(Item objeto) {
        ValidaItem validaItem = new ValidaItem();
        validaItem.validarInativo(objeto);
        validaItem.validarItemZerado(objeto);
        return dao.inserir(objeto);
    }

    @Override
    public Item alterar(Item objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Integer id) {
        dao.excluir(id);
    }
}
