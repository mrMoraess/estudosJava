package learn.methods;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.printf("Canal: %s %n", canal);

    }

    public void aumentarVolume() {
        volume++;
        System.out.printf("Volume: %s %n", volume);
    }

    public void reduzirVolume() {
        volume--;
        System.out.printf("Volume: %s %n", volume);
    }

    public void ligar() {
        ligada = true;
        System.out.printf("Status: %s %n", ligada ? "Ligada" : "Desligada");
    }

    public void desligar() {
        ligada = false;
        System.out.printf("Status: %s %n", ligada ? "Ligada" : "Desligada");
    }
}
