package controleFluxo.desafios;

import java.util.Scanner;

public class desafioFlechaEscudoEspada {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int jogadaJogador = leitor.nextInt();

        System.out.println("Digite o valor do produto: ");
        int jogadaInimigo = leitor.nextInt();

        int result = jogadaJogador-jogadaInimigo;

        if (result == 0) {
            System.out.println("Empatou");
        } else {
            if (result == -1 || result == 2) {
                System.out.println("Perdeu");
            } else {
                System.out.println("Ganhou");
            }
        }
    }
}
