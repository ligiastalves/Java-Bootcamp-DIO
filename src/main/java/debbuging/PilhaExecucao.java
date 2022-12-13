package debbuging;
//pilha de execução do programa java
public class PilhaExecucao {

    public static void main(String[] args) {
        System.out.println("Iniciou o programa no metodo main");
        a();
        System.out.println("Finalizou o programa no metodo main");
    }

    static void a(){
        System.out.println("Entrou no metodo A");
        b();
        System.out.println("Finalizou o metodo A");
    }

    static void b(){
        System.out.println("Entrou no metodo B");
        for(int i=0; i<=4;i++)
            System.out.println(i);
        c();
        System.out.println("Finalizou o metodo B");
    }

    static void c(){
        System.out.println("Entrou no metodo C");
        //Thread.dumpStack();
        System.out.println("Finalizou o metodo C");
    }
}
