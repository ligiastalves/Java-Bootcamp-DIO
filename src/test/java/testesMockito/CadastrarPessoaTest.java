package testesMockito;

import TestesMockito.ApiDosCorreios;
import TestesMockito.CadastrarPessoa;
import TestesMockito.DadosLocalizacao;
import TestesMockito.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.beans.AppletInitializer;
import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validadrDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos de Minas", "Rua 2", "Apto", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("741852963")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Ligia", "123654789", LocalDate.now(), "741852963");

        Assertions.assertEquals("Ligia", pessoa.getNome());
        Assertions.assertEquals("123654789", pessoa.getDocumento());
        Assertions.assertEquals("MG", pessoa.getEndereco().getUf());
        Assertions.assertEquals("Apto", pessoa.getEndereco().getComplemento());
    }

}
