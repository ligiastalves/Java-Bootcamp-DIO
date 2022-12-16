package controleFluxo.desafios;

import java.util.Scanner;

/*
Cada pizza é composta por 4 fatias.
Há N amigos e cada amigo precisa de exatamente X fatias.
Você deverá criar um código capaz de calcular o número mínimo de
pizzas que eles devem pedir para satisfazer seu apetite.
*/
public class desafioPizza {

    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite quantos amigos: ");
        int nAmigos = scanner.nextInt();
        System.out.println("Digite quantas fatias querem: ");
        int xFatias = scanner.nextInt();

        int fatias = nAmigos * xFatias;

        int div=(fatias/SLICE);
        int  resto = (fatias % SLICE);

        if (resto == 0) {
            System.out.println(div);
        } else {
            div = div+1;
            System.out.println(div);
        }
    }
}
