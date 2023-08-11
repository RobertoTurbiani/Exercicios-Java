import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {




        Integer numeroJogado = 4;
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt( 0,11);

        int i = 0;

        while (!numeroJogado.equals(numeroSorteado)){

            System.out.println(numeroSorteado = ThreadLocalRandom.current().nextInt( 0,11));
            i++;
        }

        if (i <= 3) {
            System.out.println( i + " Você é MUITO sortudo");
        } else if (i <=10) {
            System.out.println(i + " Você é sortudo");
        } else {
            System.out.println(i + " É melhor você parar de apostar e ir trabalhar");
        }

        }
    }

