package collections.stream;

import java.util.*;

/*
utilizando exercicio proposto 3 da aula de map, refatoracao ordenacao map
Dadas as seguintes informações de id e contato, crie um dicionario e
 ordene este cidionario exibindo (nome - id - nome contato)
 */
public class StreamParte1 {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        //exemplo classe anonima

        //precisamos organizar os valores. Logo:
        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });*/

        //metodo static do Comparator(comparing)
        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));*/

        //usando Lambda
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        //imprimindo usando forEach
        set1.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));
    }
}

/*class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}*/

/*class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}*/
