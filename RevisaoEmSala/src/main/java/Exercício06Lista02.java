import java.util.concurrent.ThreadLocalRandom;

public class Exercício06Lista02 {
    public static void main(String[] args) {
        Integer escolha = 50;

        Boolean encontrado = false;

        Integer qtdPares = 0;

        Integer qtdImpares = 0;

        for (int i = 1;i < 201; i++){
            Integer sorteio = ThreadLocalRandom.current().nextInt(1,101);



            if (escolha.equals(sorteio) && !encontrado){
                System.out.println("Posição do numero: " + i);
                encontrado = true;
            }

            if (sorteio % 2 == 0){
                qtdPares++;
            }
            if (sorteio % 2 == 1){
                qtdImpares++;
            }

        }

        System.out.println("Quantidade pares: " + qtdPares);
        System.out.println("Quantidades de impares: " + qtdImpares);
    }
}
