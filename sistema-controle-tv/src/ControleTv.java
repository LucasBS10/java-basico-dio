import java.util.Scanner;

public class ControleTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }

    public void aumentandoVolume(){
        volume ++;
        System.out.println("Volume aumentado " + volume);
    }
    public void diminuindoVolume(){
        volume --;
        System.out.println("Volume diminuido " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    /*public void mcanqq(){
        Scanner canalqq = new Scanner(System.in);
        System.out.println("Qual o canal vc quer escolher ? ");
        canalqq.next();
        System.out.println("Canal escolhido: " + canalqq);
    }*/

}