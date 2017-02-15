package br.com.angeliski.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import br.com.angeliski.modelos.PessoaComEnderecoIdEmbeddable;
import br.com.angeliski.modelos.PessoaEnderecoId;

public interface PessoaComEnderecoIdEmbeddableRepository extends CrudRepository<PessoaComEnderecoIdEmbeddable, PessoaEnderecoId> {

    List<PessoaComEnderecoIdEmbeddable> findAllByPessoaEnderecoIdPessoaId(Long pessoaId);
}
