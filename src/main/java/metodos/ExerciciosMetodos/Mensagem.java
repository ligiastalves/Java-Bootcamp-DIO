package metodos.ExerciciosMetodos;
//A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
public class Mensagem {

    public static void obterHora(int hora){
        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> msgBomDia();
            case 13, 14, 15, 16, 17, 18 -> msgBoaTarde();
            case 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> msgBoaNoite();
            default -> System.out.println("hora invalida");
        }
    }
    public static void msgBomDia(){
        System.out.println("Bom dia!");
    }
    public static void msgBoaTarde(){
        System.out.println("Boa tarde!");
    }
    public static void msgBoaNoite(){
        System.out.println("Boa noite");
    }
}
