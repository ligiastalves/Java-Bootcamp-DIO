SELECT numero, nome FROM banco;
SELECT banco_numero, numero, nome FROM agencia;
SELECT numero, nome FROM cliente;
SELECT banco_numero, agencia_numero, numero, digito, cliente_numero FROM conta_corrente; 
SELECT id, nome FROM tipo_transacao;
SELECT banco_numero, agencia_numero, conta_corrente_numero, conta_corrente_digito, cliente_numero, valor FROM cliente_transacoes;

SELECT COUNT(1) FROM banco; -- 151
SELECT COUNT(1) FROM agencia; -- 296

-- 296 REGISTROS
SELECT banco.numero, banco.nome, agencia.numero, agencia.nome
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero;

-- 9 bancos
SELECT banco.numero
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero
GROUP BY banco.numero;


-- 9 BANCOS, APENAS CONTOU
SELECT COUNT (DISTINCT banco.numero)
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero;

-- 438
SELECT banco.numero, banco.nome, agencia.numero, agencia.nome
FROM banco
LEFT JOIN agencia ON agencia.banco_numero = banco.numero;

-- traz campos null tbm, sem registro
SELECT agencia.numero, agencia.nome, banco.numero, banco.nome
FROM agencia
RIGHT JOIN banco ON banco.numero = agencia.banco_numero;

-- 296
SELECT agencia.numero, agencia.nome, banco.numero, banco.nome
FROM agencia
LEFT JOIN banco ON banco.numero = agencia.banco_numero;

-- funciona como o left join
SELECT banco.numero, banco.nome, agencia.numero, agencia.nome
FROM banco
FULL JOIN agencia ON agencia.banco_numero = banco.numero;

CREATE TABLE IF NOT EXISTS teste_a (id SERIAL PRIMARY KEY, valor VARCHAR(10));
CREATE TABLE IF NOT EXISTS teste_b (id SERIAL PRIMARY KEY, valor VARCHAR(10));

INSERT INTO teste_a (valor) VALUES ('teste 1');
INSERT INTO teste_a (valor) VALUES ('teste 2');
INSERT INTO teste_a (valor) VALUES ('teste 3');
INSERT INTO teste_a (valor) VALUES ('teste 4');

INSERT INTO teste_b (valor) VALUES ('teste a');
INSERT INTO teste_b (valor) VALUES ('teste b');
INSERT INTO teste_b (valor) VALUES ('teste c');
INSERT INTO teste_b (valor) VALUES ('teste d');

SELECT tbla.valor, tblb.valor
FROM teste_a tbla
CROSS JOIN teste_b tblb;

DROP TABLE IF EXISTS teste_a;
DROP TABLE IF EXISTS teste_b;

SELECT  banco.nome,
		agencia.nome,
		conta_corrente.numero,
		conta_corrente.digito,
		cliente.nome
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero
JOIN conta_corrente
		-- ON conta_corrente.banco_numero = agencia.banco_numero
		ON conta_corrente.banco_numero = banco.numero
		AND conta_corrente.agencia_numero = agencia.numero
		JOIN cliente
		ON cliente.numero = conta_corrente.cliente_numero;