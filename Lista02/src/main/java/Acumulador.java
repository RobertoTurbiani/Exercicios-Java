import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 10);

        int i = 0;
        int soma = 0;
        while(numeroSorteado != 0){
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(numeroSorteado);
            soma += numeroSorteado;
            i++;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
