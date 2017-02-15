package br.com.angeliski.modelos;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PessoaEnderecoId implements Serializable{

    private Long pessoaId;
    private Long enderecoId;

    public Long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Long pessoaId) {
        this.pessoaId = pessoaId;
    }

    public Long getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Long enderecoId) {
        this.enderecoId = enderecoId;
    }
}
