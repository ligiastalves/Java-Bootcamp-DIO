package testesJunit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class) //nomear os testes, a execução passa a veler pelo nome dado
public class EscolhendoAOrdemDosTest3 {

    @DisplayName("A")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}