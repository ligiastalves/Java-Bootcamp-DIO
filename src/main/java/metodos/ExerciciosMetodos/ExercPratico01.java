package metodos.ExerciciosMetodos;

public class ExercPratico01 {

    public static void main(String[] args) {

        System.out.println("Exercicio calculadora");
        Calculadora.soma(5,7);
        Calculadora.subtracao(15,40);
        Calculadora.multiplicacao(36,55);
        Calculadora.divisao(67,30);

        System.out.println("Exercicio mensagem");
        Mensagem.obterHora(7);
        Mensagem.obterHora(14);
        Mensagem.obterHora(23);

        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());//usando um metodo como parametro
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas()); //usando um metodo como parametro
        Emprestimo.calcular(1500,5);

    }
}
