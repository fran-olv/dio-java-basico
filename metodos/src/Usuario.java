public class Usuario {
    public static void main(String[] args) {
        
        Tv minhaTv = new Tv();

        System.out.println("tv ligada? "+ minhaTv.ligada);
        System.out.println("Canal Atual: "+ minhaTv.canal);
        System.out.println("volume atual: "+ minhaTv.volume);

        minhaTv.desligar();
        System.out.println("tv ligada? "+ minhaTv.ligada);


        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.diminuirVolume();
        minhaTv.aumentarVolume();
        minhaTv.diminuirVolume();

        System.out.println("volume atual: "+ minhaTv.volume)

                


    }
}
