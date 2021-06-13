DROP TABLE IF EXISTS clientes;

CREATE TABLE clientes (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(60) NOT NULL,
  celular VARCHAR(15) NOT NULL,
  nascimento Date NULL,
  cpf varchar(11),
  ativo boolean default true,
  rua varchar(100),
  numero varchar(10),
  complemento vachar(50),
  bairro varchar(50),
  cidade varchar(50),
  uf char(2)
);