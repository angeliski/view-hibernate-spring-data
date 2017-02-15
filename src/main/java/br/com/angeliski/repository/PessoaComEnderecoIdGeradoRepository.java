package br.com.angeliski.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import br.com.angeliski.modelos.PessoaComEnderecoIdGerado;

public interface PessoaComEnderecoIdGeradoRepository extends CrudRepository<PessoaComEnderecoIdGerado, Long> {

    List<PessoaComEnderecoIdGerado> findAllByPessoaId(Long pessoaId);

}
