package estruturasRepeticao;

public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <=5; numero ++){
            if (numero ==3)
                //break;
                continue;
            System.out.println(numero);
        }
    }
}
