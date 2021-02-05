package br.com.bootcamp.Exerc15.ValidacaoPedido;

import br.com.bootcamp.Exerc15.Pedido;

public class ValidaPedido {

    public void validaValorDoDesconto(Pedido pedido) {
        if (pedido.getVendedor().getPercentualDescontoMax()/100*pedido.getPedidoItem().getValorTotalSemDesconto() < (pedido.getPedidoItem().getValorTotalSemDesconto() - pedido.getPedidoItem().getValorTotal())){
            throw new PedidoException("O valor do desconto está acima do Máximo disponível para este vendedor");
        }
    }

}
