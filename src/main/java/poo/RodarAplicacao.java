package poo;
//Exercicio para entender Herança Upcast e Downcast
public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast implicito
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast explicito
        Vendedor vendedor_ = (Vendedor) new Funcionario();
        //downcast é conceito valido na OO mas deve ser evitado, geralmente vai dar erro

        //ex de erro em fazer um downcast
        //Gerente gerente_ = new Funcionario();
    }
}