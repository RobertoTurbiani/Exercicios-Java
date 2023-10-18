import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
        Integer votacao = ThreadLocalRandom.current().nextInt(1,4);
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        for(int i = 1; i <= 10; i++){
            votacao = ThreadLocalRandom.current().nextInt(1,4);
            if(votacao == 1){
                mussarela += 1;
            } else if(votacao == 2){
                calabresa += 1;
            } else{
                quatroQueijos += 1;
            }
            System.out.println(votacao);

        }
        System.out.println("Mussarela obteve: " + mussarela + " votos");
        System.out.println("Calabresa obteve: " + calabresa + " votos");
        System.out.println("quatroQueijos obteve: " + quatroQueijos + " votos");

        if(mussarela > calabresa && mussarela > quatroQueijos){
            System.out.println("Segundo a pesquisa o sabor favorito do público é MUSSARELA!");
        } else if(calabresa > mussarela && calabresa > quatroQueijos){
            System.out.println("Segundo a pesquisa o sabor favorito do público é CALABRESA!");
        } else{
            System.out.println("Segundo a pesquisa o sabor favorito do público é QUATRO QUEIJOS!");
        }
    }
}
