import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {

        Integer jogado = 15;
        Integer sorteado = ThreadLocalRandom.current().nextInt(1,100);
        Integer pares = 0;
        Integer impares = 0;
        Integer posicao = 0;

        for (int i = 1; i <= 200 ; i++) {

            if (sorteado % 2 == 0){
                pares += 1;
            } else {
                impares += 1;
            }

            System.out.println(sorteado = ThreadLocalRandom.current().nextInt(0,100));

            if (sorteado.equals(jogado)){
                posicao = i;
            }

        }
        System.out.println("O número 15 apareceu pela primeira vez na Posicao " + posicao );
        System.out.println("Números pares " + pares);
        System.out.println("Números impares " + impares);
    }
}

