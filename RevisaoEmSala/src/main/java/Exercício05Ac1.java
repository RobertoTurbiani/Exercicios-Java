import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercício05Ac1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        Integer escolha;

        do {
            System.out.println("Digite um numero inteiro");
            escolha = leitor.nextInt();

            if (escolha != 0){
                numeros.add(escolha);
            }

        }while (escolha != 0);

        System.out.println(numeros);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        Integer soma = 0;
        Integer menor = numeros.get(0);
        Integer maior = menor;

        for (int i = 0; i < numeros.size(); i++){
            Integer numeroAtual = numeros.get(i);

            if (numeroAtual %2 == 0){
                pares.add(numeroAtual);

            } else {
                impares.add(numeroAtual);

            }

            soma += numeroAtual;

            if (numeroAtual < menor){
                menor = numeroAtual;
            }

            if (numeroAtual > maior){
                maior = numeroAtual;
            }

        }

        System.out.println(String.format("""
                Numeros pares: %d,
                Numeros impares: %d,
                Soma dos números: %d
                Menor numero: %d
                Maior numero: %d""", pares,impares,soma,menor,maior));
    }
}
