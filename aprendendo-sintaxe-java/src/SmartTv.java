public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
        public void ligar() {
            ligada = true;
            System.out.println("Ligando Tv");
        }

        public void desligar() {
            ligada = false;
            System.out.println("Desligando Tv");
        }
        
        public void aumentarVolume() {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
        
        public void diminuirVolume() {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
        
        public void subirCanal() {
            canal++;
            System.out.println("Mudando de canal para: " + canal);

        }
        
        public void abaixarCanal() {
            canal--;
            System.out.println("Mudando de canal para: " + canal);

        }
        
        public void mudarCanal(int novoCanal) {
            canal = novoCanal;
            System.out.println("Mudando de canal para: "+ canal);

        }
}