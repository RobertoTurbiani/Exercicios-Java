import java.util.concurrent.ThreadLocalRandom;

public class NumerosRandomicos {

    public static void main(String[] args) {
        Integer numeroRandomico = ThreadLocalRandom.current().nextInt( -1,11);

        Double numeroRandomicoReal = ThreadLocalRandom.current().nextDouble(10.4, 15.2);

        System.out.println(numeroRandomico);
        System.out.println(numeroRandomicoReal);

    }
}
