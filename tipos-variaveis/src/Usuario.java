public class Usuario {
    public static void main(String[] args) {
        SmartTv SmartTv = new SmartTv();
        System.out.println("TV ligada ?" + SmartTv.ligada);
        System.out.println("Canal Atual ?" + SmartTv.canal);
        System.out.println("Volume Atual ?" + SmartTv.volume);
        
        SmartTv.ligar();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.subirCanal();
        SmartTv.subirCanal();
        SmartTv.subirCanal();
        SmartTv.mudarCanal(12);
        SmartTv.desligar();
    }
}
