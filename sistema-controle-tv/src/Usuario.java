public class Usuario {
    public static void main(String[] args) {
        ControleTv controleTv = new ControleTv();

        System.out.println("Tv ligada: " + controleTv.ligado);
        System.out.println("Canal atual: " + controleTv.canal);
        System.out.println("Volume atual: " + controleTv.volume);

        controleTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + controleTv.ligado);

        controleTv.desligar();
        System.out.println("Novo Status -> TV ligada ? " + controleTv.ligado);

        controleTv.aumentandoVolume();
        System.out.println("qual o volume ? " + controleTv.volume);

        controleTv.diminuindoVolume();
        System.out.println("qual o volume agora ? " + controleTv.volume);

        controleTv.aumentarCanal();
        System.out.println("qual o canal ? " + controleTv.canal);

        controleTv.diminuirCanal();
        System.out.println("qual o canal ? " + controleTv.canal);

        controleTv.mudarCanal(13);
        System.out.println("qual o canal ? " + controleTv.canal);
    }
}
