package estruturasRepeticao.Arrays;

//crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa

import java.util.Random;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4 };

        System.out.print("Vetor: ");
        int count = 0;
        while(count <= (vetor.length -1)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        //forma inversa
        System.out.print("\nVetor: ");
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
