package br.com.bootcamp.Exerc15.ValidacaoItem;

import br.com.bootcamp.Exerc15.Item;

public class ValidaItem {

    public void validarInativo(Item item) {
        if (item.getInativo()) {
            throw new ItemInativoException("O item está inativo");
        }
    }

    public void validarItemZerado(Item item) {
        if (item.getVlrUnit() == 0) {
            throw new ValorItemZeradoException("O valor do Item não não pode ser zero");
        }
    }
}
