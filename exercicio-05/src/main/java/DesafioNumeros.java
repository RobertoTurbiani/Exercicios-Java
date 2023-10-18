import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> ListaDeNumeros = new ArrayList();

        Integer escolha;
        do{
            System.out.println("Digite um numero inteiro:");
            escolha = leitor.nextInt();

            if(escolha != 0){
                ListaDeNumeros.add(escolha);
            }
        } while(escolha != 0);

        System.out.println(ListaDeNumeros);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Integer soma = 0;
        Integer menor = ListaDeNumeros.get(0);
        Integer maior = menor;
        for (int i = 0; i < ListaDeNumeros.size(); i++){
            Integer numeroDaVez = ListaDeNumeros.get(i);

            if(numeroDaVez % 2 == 0){
                pares.add(numeroDaVez);
            } else{
                impares.add(numeroDaVez);
            }

            soma += numeroDaVez;

            if(numeroDaVez < menor){
                menor = numeroDaVez;
            }

            if(numeroDaVez > maior){
                maior = numeroDaVez;
            }


        }

        String mensagem = String.format("Numeros Pares: %s\n" + "Soma dos numeros: %d\n" +
                "Numeros Impares: %s\n" +
                "Menor Numero: %d\n" +
                "Maior Numero: %d\n", pares, soma, impares, menor, maior);
        System.out.println(mensagem);
    }
}
