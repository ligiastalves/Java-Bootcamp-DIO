package controleFluxo.desafios;

import java.util.Scanner;
//Dado um inteiro positivo n , retorne o menor inteiro positivo que é um múltiplo 2 de e n
public class desafioMultiplo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
            minimoMultiplo = numero;
        } else {
            minimoMultiplo = numero * 2;
        }

        System.out.println("O resultado eh:" + minimoMultiplo);
    }
}