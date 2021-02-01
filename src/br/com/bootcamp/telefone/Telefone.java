package br.com.bootcamp.telefone;

public class Telefone {

    private TipoTelefone tipoTelefone;
    private Integer ddd;
    private Integer numero;

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public Integer getDdd() {
        return ddd;
    }

    public Integer getNumero() {
        return numero;
    }
}
