package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Ligia", LocalDate.of(2020,1,1));
        Assertions.assertEquals(3, pessoa.getIdade()); //eu espero que seja 3 anos, quando eu chamar getIdade
    }

    @Test
    void retornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Ligia", LocalDate.of(2020,1,1));
        Assertions.assertFalse(pessoa.ehMaiorDeIdade());
    }

    @Test
    void ValidarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        Pessoa pessoa1 = new Pessoa("Jose", LocalDate.now());
        Assertions.assertNotNull(pessoa1);
    }
}