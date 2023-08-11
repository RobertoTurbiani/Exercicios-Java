import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
      Integer mussarela = 1;
      Integer calabresa = 2;
      Integer quatroQueijos = 3;

      Integer vtMussarela = 0;
      Integer vtCalabresa = 0;
      Integer vtQuatroQueijos = 0;
      Integer votacao = ThreadLocalRandom.current().nextInt(1,11);

        for (int i = 1; i < 11; i++) {

         votacao = ThreadLocalRandom.current().nextInt(1,4);

            if (votacao.equals(mussarela)){
                vtMussarela +=1;
            } else if (votacao.equals(calabresa)) {
                vtCalabresa += 1;
            } else{
                vtQuatroQueijos += 1;
            }
        }

        System.out.println("Quantidade de votos: \n Mussarela:" + vtMussarela + " \n Calabresa:"
                + vtCalabresa + "\n QuatroQueijos:" + vtQuatroQueijos);

        if (vtMussarela > vtCalabresa && vtMussarela > vtQuatroQueijos){
            System.out.println("\n O sabor favorito segundo a pesquisa é Mussarela");
        } else if (vtCalabresa > vtMussarela && vtCalabresa > vtQuatroQueijos) {
            System.out.println("\n O sabor favorito segundo a pesquisa é Calabresa" );
        } else{
            System.out.println("\n O sabor favorito segundo a pesquisa é Quatro Queijos" );
        }
        /*

Sorteie os votos de 10 alunos diferentes (sem usar vetor) e exiba:
• Quantos votos obteve cada sabor.
• Qual o sabor favorito segundo a pesquisa

        */
    }
}
