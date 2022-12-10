package controleFluxo.desafios;
//programa que pergunte que turno voce estuda
//digitar m-matutino, v-vespertino e n-noturno
//imprima a msg Bom dia, boa tarde ou boa noite, ou valor invalido

import java.util.Scanner;

public class desafioTurno {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite em que turno voce estuda: ");
        char turno = leitor.next().toUpperCase().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido!");
        }
    }
}
