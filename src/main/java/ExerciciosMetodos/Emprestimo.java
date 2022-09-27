package ExerciciosMetodos;
//Calcule o valor final de um emprestimo a partir do valor solicitado.
//taxas e parcelas influenciam. Defina arbitrariamente as faixas que influenciam os valores

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public  static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valorEntrada, int parcelas){

        if(parcelas == 2){
            double valorFinal = valorEntrada + (valorEntrada  * getTaxaDuasParcelas());
            System.out.println("Valor final do emprestimo para 2 parcelas: R$ " + valorFinal);
        }else if (parcelas == 3){
            double valorFinal = valorEntrada + (valorEntrada * getTaxaTresParcelas());
            System.out.println("Valor final do emprestimo para 3 parcelas R$: " + valorFinal);
        }else{
            System.out.println("Quantidade de parcelas não existe!");
        }
    }

}
