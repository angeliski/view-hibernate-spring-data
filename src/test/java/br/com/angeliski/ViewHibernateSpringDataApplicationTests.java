package br.com.angeliski;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import br.com.angeliski.modelos.PessoaComEndereco;
import br.com.angeliski.modelos.PessoaComEnderecoIdEmbeddable;
import br.com.angeliski.modelos.PessoaComEnderecoIdGerado;
import br.com.angeliski.repository.PessoaComEnderecoIdEmbeddableRepository;
import br.com.angeliski.repository.PessoaComEnderecoIdGeradoRepository;
import br.com.angeliski.repository.PessoaComEnderecoRepository;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewHibernateSpringDataApplicationTests {

    @Autowired
    private PessoaComEnderecoRepository pessoaComEnderecoRepository;

    @Autowired
    private PessoaComEnderecoIdEmbeddableRepository pessoaComEnderecoIdEmbeddableRepository;

    @Autowired
    private PessoaComEnderecoIdGeradoRepository pessoaComEnderecoIdGeradoRepository;

    @Test
    public void carregarEnderecosEsperandoDuplicidade() {
        List<PessoaComEndereco> enderecos = pessoaComEnderecoRepository.findAllByPessoaId(1L);
        assertEquals(2, enderecos.size());
    }


    @Test
    public void carregarEnderecosSemDuplicidadeParaQuandoIdEstiverEmDuasColunas() throws Exception {
        List<PessoaComEnderecoIdEmbeddable> enderecos = pessoaComEnderecoIdEmbeddableRepository.findAllByPessoaEnderecoIdPessoaId(1L);
        assertEquals(2, enderecos.size());
    }


    @Test
    public void carregarEnderecosSemDuplicidadeParaQuandoIdForUnico() {
        List<PessoaComEnderecoIdGerado> enderecos = pessoaComEnderecoIdGeradoRepository.findAllByPessoaId(1L);
        assertEquals(2, enderecos.size());
    }
}
