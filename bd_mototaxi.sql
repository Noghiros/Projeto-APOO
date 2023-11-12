CREATE TABLE if not exists tbl_Clientes (
 ID_Cliente integer CONSTRAINT pk_id_autor PRIMARY KEY,
 Nome varchar(30) NOT NULL, 
 Cpf integer NOT NULL, 
 Telefone integer NOT NULL, 
 Email varchar(40) NOT NULL,
 Senha varchar(40) NOT NULL,
	
);

CREATE TABLE if not exists tbl_Motorista (
 ID_Moto integer CONSTRAINT pk_id_autor PRIMARY KEY,
 Nome varchar(30) NOT NULL, 
 Cpf integer NOT NULL, 
 Telefone integer NOT NULL, 
 Cnh integer NOT NULL, 
 Email varchar(40) NOT NULL,
 Senha varchar(40) NOT NULL,
 Modelo_veic varchar(40) NOT NULL, 
 Placa_veic varchar(40) NOT NULL, 
	);

CREATE TABLE if not exists tbl_PedCorrida (
 ID_Corrida integer CONSTRAINT pk_id_autor PRIMARY KEY,
 Endereco varchar(45) NOT NULL, 
 tipo varchar(10) NOT NULL, 
 obsv varchar(30),
	);