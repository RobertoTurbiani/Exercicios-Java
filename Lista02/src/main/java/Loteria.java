import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Integer numeroEscolhido = 5;
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);

        int i = 0;
        while(numeroSorteado != numeroEscolhido){
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println(numeroSorteado);
            i++;
        }

        if(i <= 3){
            System.out.println(i + " Veze(s). Você é MUITO sortudo");
        } else if(i <= 10){
            System.out.println(i + " Vezes. Você é sortudo");
        } else {
            System.out.println(i + " Vezes. É melhor você parar de apostar e ir trabalhar");
        }
    }
}
