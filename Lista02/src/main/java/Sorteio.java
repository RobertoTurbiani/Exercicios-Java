import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer numeroEscolhido = 76;
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 100);
        Integer pares = 0;
        Integer impares = 0;
        Integer posicao = 0;
        Boolean encontrado = false;

        for (int i = 1; i <= 200; i++) {
            System.out.println(numeroSorteado = ThreadLocalRandom.current().nextInt(0,101));

            if(numeroSorteado % 2 == 0){
                pares += 1;
            } else{
                impares += 1;
            }

            if (numeroSorteado.equals(numeroEscolhido) && !encontrado){
                posicao = i;
                encontrado = false;
            }

        }
        System.out.println("O número " + numeroEscolhido + " apareceu pela primeira vez na Posicao " + posicao);
        System.out.println("Números pares " + pares);
        System.out.println("Números impares " + impares);
    }
}
