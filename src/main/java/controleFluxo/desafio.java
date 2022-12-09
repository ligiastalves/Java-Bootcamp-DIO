package controleFluxo;

import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        int posicao;

        for (int i = 0; i < nomesFila.length; i++){
            System.out.println("Digite 3 nomes: ");
            nomesFila[i] = nome.next();

            posicao = i+1;
            System.out.println(nomesFila[i] + " - esta na posicao: " + posicao);
        }

    }
}