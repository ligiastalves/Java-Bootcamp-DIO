package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.*;

public class CondicionaisTest {

    @Test
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "Ligia") //Enabled ou Disabled
    //@EnabledOnOs(OS.LINUX) ex de fazer o teste só neste sistema operacional
    //@EnabledOnOs({OS.MAC, OS.LINUX}) array para mais de um SO
    //@EnabledOnJre(JAVA_17) // testar so nessa versao
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUserLigia(){
        //Assumptions.assumeTrue("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10,5+5);
    }
}
