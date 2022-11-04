package collections;

import java.util.ArrayList;
import java.util.List;

//Dada um lista comnotas de um aluno [7,8.5,9.3,5,7,0,3.6] faca:
public class ExemploList {
    //Dada um lista comnotas de um aluno [7,8.5,9.3,5,7,0,3.6] faca:

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adcione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        //System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: " );
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("Substituia a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exibir todas as notas na ordem em que foram adicionads "); //o arraylist já mantem essa lista na ordem);
        //System.out.println(notas); só imprimir o array ou usar um for each
        for (Double nota : notas)
            System.out.println(nota);
    }
}
