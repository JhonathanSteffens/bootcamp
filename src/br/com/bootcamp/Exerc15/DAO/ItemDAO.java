package br.com.bootcamp.Exerc15.DAO;

import br.com.bootcamp.Exerc15.Item;


import java.util.List;

public interface ItemDAO {

    List<Item> buscarTodos();

    Item buscar(Integer id);

    Item inserir(Item objeto);

    Item alterar(Item objeto);

    void excluir(Integer id);

}
