CREATE OR REPLACE VIEW pessoa_com_endereco AS
  SELECT
    p.id                                                   pessoa_id,
    e.id                                                   endereco_id,
    p.nome,
    concat(e.logradouro, ', ', e.bairro, ' - CEP:', e.cep) endereco_completo
  FROM pessoa p INNER JOIN endereco e ON p.id = e.pessoa_id;