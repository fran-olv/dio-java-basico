public class Tv {
// Ela tenha as características: ligada (boolean), canal (int) e volume (int);
    boolean ligada;
    int canal = 0;
    int volume = 0;


// Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

// Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

// Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
    public mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("voce está assistindo o canal": canal);
    
    }

}
