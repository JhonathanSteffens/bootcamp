package br.com.bootcamp.Exerc15;

import br.com.bootcamp.Exerc15.DAO.ClienteDAO;
import br.com.bootcamp.Exerc15.DAO.ItemDAO;
import br.com.bootcamp.Exerc15.DAO.PedidoDAO;
import br.com.bootcamp.Exerc15.DAOimpl.ClienteDAOImpl;
import br.com.bootcamp.Exerc15.DAOimpl.ItemDAOimpl;
import br.com.bootcamp.Exerc15.DAOimpl.PedidoDAOimpl;
import br.com.bootcamp.Exerc15.Service.ClienteService;
import br.com.bootcamp.Exerc15.Service.ItemService;
import br.com.bootcamp.Exerc15.Service.PedidoService;
import br.com.bootcamp.Exerc15.ServiceImpl.ClienteServiceImpl;
import br.com.bootcamp.Exerc15.ServiceImpl.ItemServiceImpl;
import br.com.bootcamp.Exerc15.ServiceImpl.PedidoServiceImpl;

import java.time.LocalDateTime;

public class Exerc15 {
    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAOImpl();
        ClienteService clienteService = new ClienteServiceImpl(clienteDAO);

        ItemDAO itemDAO = new ItemDAOimpl();
        ItemService itemService = new ItemServiceImpl(itemDAO);

        PedidoDAO pedidoDAO = new PedidoDAOimpl();
        PedidoService pedidoService = new PedidoServiceImpl(pedidoDAO);



        Item item1 = new Item(1,"mouse",false,5,5);
        Item item2 = new Item(2,"teclado",false,4, 5);
        Item item3 = new Item(3,"monitor",false,3, 5);
        Item item4 = new Item(4,"gabinete",false,10, 5);
        Item item5 = new Item(5,"placa de vídeo",false,6, 5);


        Vendedor vendedor1 = new Vendedor(1,"Beatriz",5,70);
        Vendedor vendedor2 = new Vendedor(2,"Marcos",5,70);
        Vendedor vendedor3 = new Vendedor(3,"Jorge",5,70);

        Cliente cliente1 = new Cliente(1,"Pereirinha","123","Pereirinha@gmail.com");
        Cliente cliente2 = new Cliente(2,"José","234","Braga@gmail.com");
        Cliente cliente3 = new Cliente(3,"Yorshka","235","Yorshka@gmail.com");

        PedidoItem pedidoItem1 = new PedidoItem(4,3,5);
        PedidoItem pedidoItem2 = new PedidoItem(1,10,3);

        Pedido pedido1 = new Pedido(1,cliente1, vendedor1, LocalDateTime.now(),
                LocalDateTime.now(),LocalDateTime.now(),"Rua Goias",
                "n/d",FormaDePagamento.DINHEIRO,item1, pedidoItem1);

        Pedido pedido2 = new Pedido(2,cliente2, vendedor3, LocalDateTime.now(),
                LocalDateTime.now(),LocalDateTime.now(),"Rua das Lajotas",
                "n/d",FormaDePagamento.CARTAO,item3,pedidoItem2);


        clienteService.inserir(cliente1);
        clienteService.inserir(cliente2);
        clienteService.inserir(cliente3);
        itemService.inserir(item1);
        itemService.inserir(item2);
        itemService.inserir(item3);
        itemService.inserir(item4);
        itemService.inserir(item5);
        pedidoService.inserir(pedido1);
        //System.out.println(pedidoService.inserir(pedido2));
    }
}
