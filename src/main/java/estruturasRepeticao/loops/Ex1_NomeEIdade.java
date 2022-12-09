package estruturasRepeticao.loops;
import java.util.Scanner;

//Ler conjunto de dois valores um para nome e um para idade
//parar o programa qndo inserir 0 no campo nome

public class Ex1_NomeEIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade:");
            idade = scan.nextInt();
        }
        System.out.println("Continua aqui...");
    }
}
