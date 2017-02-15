package br.com.angeliski.modelos;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA_COM_ENDERECO")
public class PessoaComEnderecoIdEmbeddable {

    @EmbeddedId
    private PessoaEnderecoId pessoaEnderecoId;
    private String nome;
    private String enderecoCompleto;


    public PessoaEnderecoId getPessoaEnderecoId() {
        return pessoaEnderecoId;
    }

    public void setPessoaEnderecoId(PessoaEnderecoId pessoaEnderecoId) {
        this.pessoaEnderecoId = pessoaEnderecoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }
}
