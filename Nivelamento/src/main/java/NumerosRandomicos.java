import java.util.concurrent.ThreadLocalRandom;

public class NumerosRandomicos {
    public static void main(String[] args) {
        Integer numeroRandomico = ThreadLocalRandom.current().nextInt();
        System.out.println(numeroRandomico);

        Double numeroRandomicoReal = ThreadLocalRandom.current().nextDouble(0.0, 1.50);

        System.out.println(numeroRandomicoReal);
    }
}
