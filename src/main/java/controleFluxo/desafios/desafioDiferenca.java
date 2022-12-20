package controleFluxo.desafios;

import java.util.Arrays;
import java.util.Scanner;

/*
/*O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a soma dos seus digitos.

Entrada
• Para encontrar o produto do valor, os dígitos deverão ser multiplicados.

• A soma, basta realizar uma adição entre os dígitos.

• A diferença, é necessário substrair o resultado final dos dois valores.

Explicação:
Produto de dígitos = 2 * 3 * 4 = 24
Soma dos dígitos = 2 + 3 + 4 = 9
Resultado = 24 - 9 = 15
*/
public class desafioDiferenca {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        int produto=1;
        int soma= 0;
        int resultado=0;

        for(int number : ints){
            produto *= number;
            soma += number;
        }
        System.out.println(resultado = produto - soma);

    }
}

