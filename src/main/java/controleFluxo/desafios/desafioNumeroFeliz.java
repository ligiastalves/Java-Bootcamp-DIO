package controleFluxo.desafios;

import java.util.*;
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

    static int quadradoDigito(int n) {
        int digito;
        int quadrado = 0;
        while (n > 0) {
            digito = n % 10;
            quadrado += digito * digito;
            n /= 10;
        }
        return quadrado;
    }
    static boolean numFeliz(int n) {
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(n);
        while (n != 0) {
            if (n == 1) return true;
            n = quadradoDigito(n);
            if ((s.contains(n)) && n != (int) s.toArray()[s.size() - 1]) return false;
            s.add(n);
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scan.nextInt();
        System.out.println(numFeliz(num));
    }
}
