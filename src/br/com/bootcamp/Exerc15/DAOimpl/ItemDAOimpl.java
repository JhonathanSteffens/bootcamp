package br.com.bootcamp.Exerc15.DAOimpl;

import br.com.bootcamp.Exerc15.DAO.ItemDAO;
import br.com.bootcamp.Exerc15.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDAOimpl implements ItemDAO {
    private final List<Item> itens = new ArrayList();

    @Override
    public List<Item> buscarTodos() {
        return itens;
    }

    @Override
    public Item buscar(Integer id) {
        for (Item item : itens) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public Item inserir(Item objeto) {
        objeto.setId( itens.size() +1);
        itens.add(objeto);
        return objeto;
    }

    @Override
    public Item alterar(Item objeto) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getId().equals(objeto.getId())){
                itens.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void excluir(Integer id) {
        for(int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getId().equals(id)){
                itens.remove(i);
                break;
            }
        }
    }
}
