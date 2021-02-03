package exerc11;

public class Assento {
    Integer numeroAssento;
    Boolean estaLivre;

    public Assento(Integer numeroAssento,
                   Boolean estaLivre){
        this.numeroAssento = numeroAssento;
        this.estaLivre = estaLivre;
    }

    @Override
    public String toString() {
        return "Assento{" +
                "numeroAssento=" + numeroAssento +
                '}';
    }
}
