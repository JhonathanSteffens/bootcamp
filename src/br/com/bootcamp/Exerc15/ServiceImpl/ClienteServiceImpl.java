package br.com.bootcamp.Exerc15.ServiceImpl;

import br.com.bootcamp.Exerc15.Cliente;
import br.com.bootcamp.Exerc15.DAO.ClienteDAO;
import br.com.bootcamp.Exerc15.Service.ClienteService;
import br.com.bootcamp.Exerc15.ValidacaoCliente.NomeObrigatorioNullException;


import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private final ClienteDAO dao;

    public ClienteServiceImpl(ClienteDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Cliente buscar(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public Cliente inserir(Cliente objeto) {
            return dao.inserir(objeto);

    }

    @Override
    public Cliente alterar(Cliente objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Integer id) {
        dao.excluir(id);
    }
}
