package br.com.angeliski.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import br.com.angeliski.modelos.PessoaComEndereco;

public interface PessoaComEnderecoRepository extends CrudRepository<PessoaComEndereco, Long> {

    List<PessoaComEndereco> findAllByPessoaId(Long pessoaId);

}
