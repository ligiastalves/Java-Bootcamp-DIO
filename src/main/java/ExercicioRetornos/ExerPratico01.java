package ExercicioRetornos;

public class ExerPratico01 {

    public static void main(String[] args) {
        //Retornos
        System.out.println("Exercicio Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(4,4);
        System.out.println("Area do Retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Area do Trapezio: " + areaTrapezio);

    }
}
