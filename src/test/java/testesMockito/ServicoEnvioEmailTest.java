package testesMockito;

import TestesMockito.Email;
import TestesMockito.Formato;
import TestesMockito.PlataformaDeEnvio;
import TestesMockito.ServicoEnvioEmail;
import lombok.experimental.StandardException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Teste da classe {@link ServicoEnvioEmail} exemplificando testes usando Argument Captor
 */
@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> emailCaptor;

    @Test
    public void validaDadosEnviadosParaPlataforma() {

        String enderecoDeEmail = "usuario@provedor.com";
        String mensagem = "Mensagem de Teste 123";
        boolean ehFormatoHtml = false;

        servico.enviaEmail(enderecoDeEmail,mensagem,ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(emailCaptor.capture());
        Email emailCapturado = emailCaptor.getValue();
        Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }


}