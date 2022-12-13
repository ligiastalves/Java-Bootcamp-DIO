package collections.set;

import java.util.*;

//Dada um lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6] faca:
public class ExemploSet {

    public static void main(String[] args) {


        System.out.println("Crie uma lista e adicione as sete notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //System.out.println(notas);
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5: ");

        //System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

        //System.out.println("Substituia a nota 5.0 pela nota 6.0: ");

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) { //ve se tem proximo apos o cursor
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A Soma foi: " + soma);

        System.out.println("Exiba a media das notas: " + soma / notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //System.out.println("Remova a nota na posição 0: ");

        System.out.println("Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) { //tem proximo?
            Double next = iterator1.next(); //guarda na variavel
            if (next < 7) iterator1.remove(); //esse proximo é menor que sete? Sim, remove
        }
        System.out.println(notas);

        System.out.println("Exibir todas as notas na ordem em que foram adicionads "); //o arraylist já mantem essa lista na ordem);
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se apagou toda a lista: " + notas.isEmpty());
        System.out.println("Confira se apagou toda a lista: " + notas2.isEmpty());

    }
}
