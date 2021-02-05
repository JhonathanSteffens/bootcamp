package br.com.bootcamp.Exerc15.DAOimpl;

import br.com.bootcamp.Exerc15.Cliente;
import br.com.bootcamp.Exerc15.DAO.ClienteDAO;


import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private final List<Cliente> clientes = new ArrayList();

    @Override
    public List<Cliente> buscarTodos() {
        return clientes;
    }

    @Override
    public Cliente buscar(Integer id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente inserir(Cliente objeto) {
        objeto.setId( clientes.size() +1);
        clientes.add(objeto);
        return objeto;
    }

    @Override
    public Cliente alterar(Cliente objeto) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(objeto.getId())){
                clientes.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void excluir(Integer id) {
        for(int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)){
                clientes.remove(i);
                break;
            }
        }
    }
}
