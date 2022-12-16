package controleFluxo.desafios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*
Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz.

Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.

Ex1: 19 - true
Explicação:
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
Ex2: 2 - False
*/

public class desafioNumeroFeliz {

    public static void main(String[] args) {

        boolean numFeliz;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scan.nextInt();

        double quadradoDoNum = (Math.pow(num, 2));
        System.out.println("O quadrado de " + num + " é: " + quadradoDoNum);


    }
}

