package estruturasRepeticao.Arrays;
//faca um programa que leia 6 caracteres e diga quantas consoantes foram lidas
//imprima as consoantes

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];


        int qtdeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qtdeConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.println("As consoantes foram: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nSão: " + qtdeConsoantes);
    }
}