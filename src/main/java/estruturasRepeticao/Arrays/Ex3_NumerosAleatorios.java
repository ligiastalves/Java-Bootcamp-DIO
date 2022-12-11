package estruturasRepeticao.Arrays;
//FAca um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100)
//armaze-os em um vetor e ao final mostre os numeros e seus sucessores

import java.util.Random;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println("\nSucessores dos numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
