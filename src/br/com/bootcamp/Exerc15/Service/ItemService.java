package br.com.bootcamp.Exerc15.Service;

import br.com.bootcamp.Exerc15.Item;

import java.util.List;

public interface ItemService {

    List<Item> buscarTodos();

    Item buscar(Integer id);

    Item inserir(Item objeto);

    Item alterar(Item objeto);

    void excluir(Integer id);
}
