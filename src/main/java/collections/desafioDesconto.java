package collections;

/*A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor marcado do produto,
e na segunda linha o valor do produto com o desconto já aplicado.
A saída deverá retornar o percentual de desconto que foi aplicado no produto, conforme exemplo abaixo.
*/

import java.util.Scanner;

public class desafioDesconto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        int M = input.nextInt();
        System.out.println("Digite o valor do produto com desconto: ");
        int S = input.nextInt();

        int percentual = 100;
        int desconto = (S * percentual) / M - (percentual);

        System.out.println("O desconto foi de " + desconto * (-1) + "%");
    }
}
