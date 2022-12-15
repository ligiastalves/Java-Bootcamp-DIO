package collections.map;

import java.util.*;

/*
Dadas as seguintes informaões sobre meus livros favoritos (ex da Cami) e seus autores,
crie um dicionario e ordene este dicionario exibindo (Nome Autor - Nome Livro)

Autor = Hawking, Stephen
Livro = nome: Uma breve história do tempo - pag 256
Aturo = Duhigg, Charles
Livro = nome: O Poder do habito, pag 408
Autor = Harari, Yuval Naah
Livro = nome: 21 liçoes para o seculo 21 pag 432
 */
public class OrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("\t--Ordem aleatoria\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do habito", 408));
            put(" Harari, Yuval Naah", new Livro("21 liçoes para o seculo 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\t--Ordem de inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do habito", 408));
            put(" Harari, Yuval Naah", new Livro("21 liçoes para o seculo 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\t--Ordem alfabetica autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros) {{
            put(" Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do habito", 408));
            put(" Harari, Yuval Naah", new Livro("21 liçoes para o seculo 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\t--Ordem alfabetica dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //System.out.println("\t--ordenar por numero de paginas\t--");
    }

}