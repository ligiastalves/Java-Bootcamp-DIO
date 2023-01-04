package testesJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validadCenariodeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456321", 100);

        TransferenciasEntreContas transferenciasEntreContas = new TransferenciasEntreContas();

        //não espera que lance a exceção
        Assertions.assertDoesNotThrow(() ->
                transferenciasEntreContas.transfere(contaOrigem, contaDestino, -1));

        //Assertions.assertThrows(IllegalArgumentException.class, () ->
        //        transferenciasEntreContas.transfere(contaOrigem,contaDestino, -1));
    }

}