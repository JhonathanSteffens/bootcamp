package br.com.bootcamp.Exerc12;

public class Exerc12 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("rua goianases",231,"Australopitecos","Cagibrina",
                "543","s/complemento");
        Proprietario proprietario = new Proprietario("José","123","234",endereco);
        Carro carro = new Carro(proprietario,50);
        carro.setVelocidadeMaxima(5);
        carro.setModelo("Civic");
        carro.acelera();
        carro.acelera();
        carro.acelera();
        carro.acelera();
        carro.acelera();
        System.out.println("Autonomia de viagem do carro é: " + carro.autonomia(10) + " km");
        System.out.println("A velocidade atual do carro é " + carro.getVelocidadeAtual());

    }
}
