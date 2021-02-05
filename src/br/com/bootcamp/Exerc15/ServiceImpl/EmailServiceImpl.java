package br.com.bootcamp.Exerc15.ServiceImpl;

import br.com.bootcamp.Exerc15.Pedido;
import br.com.bootcamp.Exerc15.Service.EmailService;

public class EmailServiceImpl implements EmailService {

    @Override
    public double valorComissao(Pedido pedido) {
        double valorComissao;
        valorComissao = pedido.getVendedor().getPercentualComissao() / 100 * pedido.getPedidoItem().getValorTotal();
        return valorComissao;
    }
}
