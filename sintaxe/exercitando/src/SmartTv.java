public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o Canal: ");
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentado o volume para " + volume);
        
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void ligar(){
        ligada = true;
        System.out.println("Ligando a TV");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Desligando a TV");
    }


}
