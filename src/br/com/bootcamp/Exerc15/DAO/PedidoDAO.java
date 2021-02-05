package br.com.bootcamp.Exerc15.DAO;

import br.com.bootcamp.Exerc15.Pedido;

import java.util.List;

public interface PedidoDAO {


        List<Pedido> buscarTodos();

        Pedido buscar(Integer id);

        Pedido inserir(Pedido objeto);

        Pedido alterar(Pedido objeto);

        void excluir(Integer id);
}
