package collections.set;
/*Dadas as seguintes informaçoes sobre minhas series favoritas.
Crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de epesodio)

Serie 1 = Nome: Lost, gnero:  aventura, tempoEpisodio: 40
Serie 2 = Nome: Outlander, genero: drama, tempoEpisodio: 60
Serie 3 = Nome: La casa de Papel, genero: Ação, tempoEpisodio: 60
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("---\tOrdem aleatoria\t---");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Lost","Aventura", 40));
            add(new Serie("Outlander","Drama",60));
            add(new Serie("La Casa de Papel", "Ação", 60));
        }};
        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() +
                    " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem de inserção:\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Lost","Aventura", 40));
            add(new Serie("Outlander","Drama",60));
            add(new Serie("La Casa de Papel", "Ação", 60));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() +
                    " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() +
                    " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisorio());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() +
                    " - " + serie.getTempoEpisodio());
    }
}