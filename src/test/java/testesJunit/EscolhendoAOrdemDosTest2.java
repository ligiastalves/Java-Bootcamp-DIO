package testesJunit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.MethodName.class) //ordem alfabetica
@TestMethodOrder(MethodOrderer.Random.class) // ordem aleatoria
public class EscolhendoAOrdemDosTest2 {

    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
