package collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamParte2 {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        //numerosAleatorios.stream().forEach(System.out::println);

        //Sem usar Stream
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set");
        /*numerosAleatorios.stream()
                .limit(5) // 0 1 2 4 = não repete numero e coloca em ordem crescente
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        */
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros.");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a media dos numeros");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()//metodo para media retorna um optional double (serve para trabalhar com numeros null)
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares da lista");
        collectList.removeIf(i -> (i % 2 != 0));
        System.out.println(collectList);

        //Para treinar depois:
        /*System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");
        System.out.println("Retirando os numeros repetidos da lista, quantos numeros ficam?");
        System.out.println("Mostre o menor valor da lista: ");
        System.out.println("Mostre o maior valor da lista: ");
        System.out.println("Pegue apenas os numeros impares e some: ");
        System.out.println("Mostre a lista na ordem numerica:");
        System.out.println("agrupe os valores impares multiplos de 3 e de 5");
        dica: collect(Collectors.groupingBy(new Function<T, K>() {
            @Override
            public K apply(T t) {
                return null;
            }
        }));
        */

    }
}

