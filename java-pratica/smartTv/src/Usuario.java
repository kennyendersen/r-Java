public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        // CHAMADAS
        smartTv.ligar();
        smartTv.mudarCanal(598);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(405);
        smartTv.desligar();

        
        //  STATUS
        System.out.println("\nA TV está ligada? " + smartTv.ligada);
        System.out.println("Canal = " + smartTv.canal);
        System.out.println("Volume = " + smartTv.volume);
        

    }
    
}
