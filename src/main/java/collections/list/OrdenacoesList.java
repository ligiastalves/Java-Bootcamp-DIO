package collections.list;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacoesList {

    /*Dadas as seguintes informaçõessobre meus gatos, crie uma Lista
    e ordene esta lista exibindo: (nome, idade e cor);

    Gato 1 = nome: Jon, Idade: 18, cor: pretp
    Gato 2 = nome: Simba, idade: 6, cor: tigrado
    Gato 3 = nome: Jon, idade: 12, cor: amarelo
    */

    /*public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18,"preto"));
            add(new Gato("Simba", 6,"tigrado"));
            add(new Gato("Jon", 12,"amarelo"));
        }};

        System.out.println("Ordem de inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural (nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("Ordem Idade");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade()); //usando o proprio objeto
        System.out.println(meusGatos);

        System.out.println("Ordem de Cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem nome/cor/idade");
        meusGatos.sort(new ComparatorNomeIdadeCor());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato> {
    @Getter
    String nome;
    Integer idade;
    String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
   // public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeIdadeCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0)  return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }*/
}