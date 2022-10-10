package ExerciciosSobrecarga;

import org.w3c.dom.ls.LSOutput;

//sobrecarga: mantem-se o nome do metodo e altera a sua lista de parametros(tipo de variavel e quantidades), muda a sua assinatura
public class Quadrilatero {

    public static void area(double lado){
        System.out.println("Area do quadrado: " + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Area dos retangulos: " + lado1 * lado2);
    }
    public static void area (double baseMaior, double baseMenor, double altura){
        System.out.println("Area dos trapezio: " + ((baseMaior+baseMenor)*altura) / 2);
    }
    public static void area(float diagonal1, float diagonal2){
        System.out.println("Area do losango: " + (diagonal1*diagonal2) / 2 );
    }

}
