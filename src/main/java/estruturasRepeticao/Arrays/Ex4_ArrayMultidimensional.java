package estruturasRepeticao.Arrays;
//gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9

import java.util.Random;

public class Ex4_ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] M = new int[4][4];

        //for para a matrix linha
        for (int i = 0; i < M.length; i++) {
            // for para coluna
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
