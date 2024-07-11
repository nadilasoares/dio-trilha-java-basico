public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Qual o canal atual? " + smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTV.canal);

        System.out.println("Volume atual: " + smartTV.volume);

        

        System.out.println("A TV está ligada? " + smartTV.ligada);
        System.out.println("Qual o canal atual? " + smartTV.canal);
        System.out.println("Qual o volume atual? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status da TV --> está ligada?: " + smartTV.ligada);
    }
}


