package estruturasRepeticao.loops;

/*Faça um programa que gere a tabuada de qualquer numero inteiro de 1 a 10
o usuario deve informar de qual o numero ele deseja ver a tabuada
a saida deve ser conforme o exemplo abaixop:

Tabuada do 5:
5x1=5
5x2=10
...
5x10=50
*/

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + tabuada*i);
        }
    }
}
