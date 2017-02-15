# view-hibernate-spring-data


Esse repositório é o exemplo implementado no artigo [mapeando views com hibernate no spring-data](https://angeliski.com.br/2017/02/15/mapeando-views-com-hibernate-no-spring-data/).

Para executar esse projeto, você precisará:

 - alterar a propriedade *spring.jpa.hibernate.ddl-auto* *application.properties* para **update**
 - Comentar a anotação @Entity nas classes *PessoaComEnderecoIdGerado*, *PessoaComEnderecoIdEmbeddable* e *PessoaComEndereco*
 - Criar uma base com nome angeliski no seu mysql local (ou mudar no datasource caso queira usar outra)
 - Subir a aplicação e permitir que o hibernate crie as tabelas
 - Rodar o script sql da view presente no arquivo *view_pessoa_com_endereco.sql* 
 - E descomentar as classes comentadas anteriormente
 - alterar a propriedade *spring.jpa.hibernate.ddl-auto* *application.properties* para **none**


Essa complexidade toda é porque o exemplo mantém os três cenários apresentados no post. Se você quiser alterar ou contribuir melhorando isso, sinta se a vontade para abrir um pull-request.

