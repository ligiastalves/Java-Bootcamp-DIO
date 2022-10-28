package excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploRuntimeException {

    public static void main(String[] args) {

        //Number valor = Double.valueOf("a1.75");
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("valor");
    }
    /*A propostas de exceçoes checked/ unchecked é o fato de ao tentar usar um metodo
    esse metodo determina que vc precisa tratar um erro imediatamente, diferente das runtime exception
    que o erro pode acontecer mas voce nao tratou pq foi detectado ou perceberam que poderia ser um erro
    nao tao recorrente
    */
}
