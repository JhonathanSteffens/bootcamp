package br.com.bootcamp.Exerc15.ServiceImpl;

import br.com.bootcamp.Exerc15.Pedido;
import br.com.bootcamp.Exerc15.DAO.PedidoDAO;
import br.com.bootcamp.Exerc15.Service.PedidoService;
import br.com.bootcamp.Exerc15.ValidacaoPedido.ValorDoDescontoExcedidoException;
import br.com.bootcamp.Exerc15.Vendedor;

import java.util.List;

public class PedidoServiceImpl implements PedidoService {
    private final PedidoDAO dao;

    public PedidoServiceImpl(PedidoDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Pedido> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Pedido buscar(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public Pedido inserir(Pedido objeto) {
        if (objeto.getVendedor().getPercentualDescontoMax() < (objeto.getPedidoItem().getValorTotalSemDesconto() - objeto.getPedidoItem().getValorTotal())){
            throw new ValorDoDescontoExcedidoException("O valor do desconto está acima do Máximo disponível para este vendedor");
        } else {
            return dao.inserir(objeto);
        }

    }

    @Override
    public Pedido alterar(Pedido objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Integer id) {
        dao.excluir(id);
    }


}
