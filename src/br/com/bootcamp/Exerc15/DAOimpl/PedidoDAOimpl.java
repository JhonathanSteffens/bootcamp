package br.com.bootcamp.Exerc15.DAOimpl;

import br.com.bootcamp.Exerc15.DAO.PedidoDAO;
import br.com.bootcamp.Exerc15.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAOimpl implements PedidoDAO {

    private final List<Pedido> pedidos = new ArrayList();

    @Override
    public List<Pedido> buscarTodos() {
        return pedidos;
    }

    @Override
    public Pedido buscar(Integer id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId().equals(id)) {
                return pedido;
            }
        }
        return null;
    }

    @Override
    public Pedido inserir(Pedido objeto) {
        objeto.setId( pedidos.size() +1);
        pedidos.add(objeto);
        return objeto;
    }

    @Override
    public Pedido alterar(Pedido objeto) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(objeto.getId())){
                pedidos.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void excluir(Integer id) {
        for(int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(id)){
                pedidos.remove(i);
                break;
            }
        }
    }
}
