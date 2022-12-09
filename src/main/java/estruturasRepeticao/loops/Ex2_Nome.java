package estruturasRepeticao.loops;

//faça um programa que pega um noa de 0 a 10.
//mostre msg caso o valor seja invalido e continue pedindo
// até informar um valor valido

import java.util.Scanner;

public class Ex2_Nome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota invalida! Digite uma nota entre 0 e 10");
            nota = scan.nextInt();
        }
    }
}