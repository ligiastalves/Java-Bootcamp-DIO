package controleFluxo;
//condicional composta e encadeada
//condição ternária
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota= 3;

//        if (nota >= 7) {
//            System.out.println("Aprovado");
//
//        }else if(nota >= 5 && nota < 7) {
//            System.out.println("Prova Recuperação");
//
//        }else{
//            System.out.println("Reprovado");
//        }
        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        String resultado = nota >= 5 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
