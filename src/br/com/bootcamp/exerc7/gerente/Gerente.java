package br.com.bootcamp.exerc7.gerente;
import br.com.bootcamp.exerc7.empregadocomicionado.EmpregadoComicionado;
import java.util.List;


public class Gerente extends EmpregadoComicionado {
    private double ajudaCusto;
    private double valorComissao;
    private List<EmpregadoComicionado> listaVendedores;
    public Gerente (String nome,
                    String cpf,
                    double valorSalarioBase,
                    double valorImpostos,
                    List<EmpregadoComicionado> listaVendedores,
                    double percentualComissao,
                    double ajudaCusto) {
        super(nome, cpf, valorSalarioBase, valorImpostos, somatorioProdutosVendidos(listaVendedores), percentualComissao);
        this.ajudaCusto = ajudaCusto;
    }

    private static double somatorioProdutosVendidos (List<EmpregadoComicionado> listaVendedores) {
        double total = 0;
        for(int i = 0; i < listaVendedores.size(); i++){
            total = total + listaVendedores.get(i).getValorProdutosVendidos();
        }

        return total;
    }


    @Override
    public double calculaValorTotalSalario() {
        return getValorSalarioBase() + valorComissao - getValorImpostos() + ajudaCusto;
    }


}
