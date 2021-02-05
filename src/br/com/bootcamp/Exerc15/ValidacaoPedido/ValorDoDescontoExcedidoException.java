package br.com.bootcamp.Exerc15.ValidacaoPedido;

public class ValorDoDescontoExcedidoException extends RuntimeException{
    public ValorDoDescontoExcedidoException(String mensagem) {
        super(mensagem);
    }
}
