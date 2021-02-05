package br.com.bootcamp.Exerc15;

import java.time.LocalDateTime;

public class Pedido {
    private Integer id;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataValidade;
    private LocalDateTime dataPrevisaoEntrega;
    private String enderecoEntrega;
    private String observacao;
    private FormaDePagamento formaDePagamento;
    private Item itens;
    private PedidoItem pedidoItem;

    public Pedido(Integer id,
                  Cliente cliente,
                  Vendedor vendedor,
                  LocalDateTime dataCadastro,
                  LocalDateTime dataValidade,
                  LocalDateTime dataPrevisaoEntrega,
                  String enderecoEntrega,
                  String observacao,
                  FormaDePagamento formaDePagamento,
                  Item itens,
                  PedidoItem pedidoItem) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataCadastro = dataCadastro;
        this.dataValidade = dataValidade;
        this.dataPrevisaoEntrega = dataPrevisaoEntrega;
        this.enderecoEntrega = enderecoEntrega;
        this.observacao = observacao;
        this.formaDePagamento = formaDePagamento;
        this.itens = itens;
        this.pedidoItem = pedidoItem;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDateTime dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDateTime getDataPrevisaoEntrega() {
        return dataPrevisaoEntrega;
    }

    public void setDataPrevisaoEntrega(LocalDateTime dataPrevisaoEntrega) {
        this.dataPrevisaoEntrega = dataPrevisaoEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Item getItens() {
        return itens;
    }

    public void setItens(Item itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public PedidoItem getPedidoItem() {
        return pedidoItem;
    }

    public void setPedidoItem(PedidoItem pedidoItem) {
        this.pedidoItem = pedidoItem;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", dataCadastro=" + dataCadastro +
                ", dataValidade=" + dataValidade +
                ", dataPrevisaoEntrega=" + dataPrevisaoEntrega +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", observacao='" + observacao + '\'' +
                ", formaDePagamento=" + formaDePagamento +
                ", itens=" + itens +
                ", pedidoItem=" + pedidoItem +
                '}';
    }

    public StringBuilder resumo(Pedido pedido){
        StringBuilder string = new StringBuilder();
        string.append("-------------------------------------------").append("\n");
        string.append("             Relatório do Pedido           ").append("\n");
        string.append("-------------------------------------------").append("\n");
        string.append("Id do Pedido: ").append(pedido.getId()).append("\n");
        string.append("Nome do Cliente: ").append(pedido.getCliente().getNome()).append("\n");
        string.append("Nome do Vendedor: ").append(pedido.getVendedor().getNome()).append("\n");
        string.append("Data de Cadastro: ").append(pedido.getDataCadastro()).append("\n");
        string.append("Data de Previsão de Entrega: ").append(pedido.getDataPrevisaoEntrega()).append("\n");
        string.append("Data de Validade: ").append(pedido.getDataValidade()).append("\n");
        string.append("Endereço de Entrega: ").append(pedido.getEnderecoEntrega()).append("\n");
        string.append("Observação: ").append(pedido.getObservacao()).append("\n");
        string.append("Forma de Pagamento: ").append(pedido.getFormaDePagamento().getDescricao()).append("\n");
        string.append("Id do Item: ").append(pedido.getItens().getId()).append("\n");
        string.append("Descrição do Item: ").append(pedido.getItens().getDescricao()).append("\n");
        string.append("Valor Unitário do Item: ").append(pedido.getPedidoItem().getValorUnitario()).append("\n");
        string.append("Quantidade Adquirida: ").append(pedido.getPedidoItem().getQuantidade()).append("\n");
        string.append("Valor Total Sem Desconto: ").append(pedido.getPedidoItem().getValorTotalSemDesconto()).append("\n");
        string.append("Valor Total: ").append(pedido.getPedidoItem().getValorTotal()).append("\n");
        return string;
    }

}


