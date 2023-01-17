package testesMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validadarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos de Minas", "Rua 2", "Apto", "Centro");
        //Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("741852963")).thenReturn(dadosLocalizacao);
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao); // matches
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Ligia", "123654789", LocalDate.now(), "741852963");

        Assertions.assertEquals("Ligia", pessoa.getNome());
        Assertions.assertEquals("123654789", pessoa.getDocumento());
        Assertions.assertEquals("MG", pessoa.getEndereco().getUf());
        Assertions.assertEquals("Apto", pessoa.getEndereco().getComplemento());
    }

    @Test
    void lancarExceptionQuandoChamarApiDosCorreios(){

        //Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);
        //outra forma
        Mockito.doThrow(IllegalArgumentException.class)
                .when(apiDosCorreios)
                .buscaDadosComBaseNoCep(anyString());

        Assertions.assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Ligia", "123654789", LocalDate.now(), "741852963"));
    }
}
