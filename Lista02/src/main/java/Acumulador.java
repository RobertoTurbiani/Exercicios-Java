import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {

        Integer sorteados = ThreadLocalRandom.current().nextInt(0,11);


        int i = 0;
        Integer soma = 0;
        while(!sorteados.equals(0)) {

            System.out.println(sorteados = ThreadLocalRandom.current().nextInt(0, 11));
            soma += sorteados;
            i++;
        }

        System.out.println("A soma dos números é " + soma);
    }
}
