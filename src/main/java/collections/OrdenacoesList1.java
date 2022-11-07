package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacoesList1 {

    /*Dadas as seguintes informaçõessobre meus gatos, crie uma Lista
    e ordene esta lista exibindo: (nome, idade e cor);

    Gato 1 = nome: Jon, Idade: 18, cor: pretp
    Gato 2 = nome: Simba, idade: 6, cor: tigrado
    Gato 3 = nome: Jon, idade: 12, cor: amarelo
    */

    public static void main(String[] args) {

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

    }
}

class Gato implements Comparable<Gato> {

    String nome;
    Integer idade;
    String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
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
