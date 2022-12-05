package metodos.ExerciciosMetodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv  smartTv = new SmartTv();


        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV LIGADA ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV LIGADA ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
    }

}
