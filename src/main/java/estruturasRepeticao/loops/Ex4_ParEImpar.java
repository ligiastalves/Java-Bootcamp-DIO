package estruturasRepeticao.loops;
//Faça um programa que peça N numeros inteiros
//Calcule e mostre a quantidade de numeros pares e impares

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumero;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Digite a quantidade de numeros: ");
        quantNumero = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;
            if (numero % 2 ==0) quantPares ++;

            else quantImpares++;

        }while(count < quantNumero);
        System.out.println("Pares: " + quantPares);
        System.out.println("Impares: " + quantImpares);
    }
}
