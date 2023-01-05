package testesMockito;

import TestesMockito.GeradorDeNumeros;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.anyInt;

/**
 * Teste da classe {@Link GeradorDeNumeros} exemplificando testes de métodos estáticos
 */
@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTest {

    @Test
    void validaGeracaoListaDeNumeros() {
        MockedStatic<GeradorDeNumeros> gerador = Mockito.mockStatic(GeradorDeNumeros.class);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        gerador.when(() -> GeradorDeNumeros.geraNumerosAleatorios(anyInt()))
                .thenReturn(integers);

        Assertions.assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios(8));
    }

}