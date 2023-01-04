package testesJunit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTestes(){
    BancoDeDados.insereDados(new Pessoa("Jose", LocalDate.now()));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Jose", LocalDate.now()));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizaConexao(){
        BancoDeDados.finalizouConexao();
    }
 /*
 BeforeAll e AfterAll, execução unica no inicio e no fim do ciclo de teste
 BeforeEach e AfterEach executa antes e depois de cada teste que existir na classe
  */
}