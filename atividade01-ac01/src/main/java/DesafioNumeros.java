import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {

        Scanner mensagem = new Scanner(System.in);

        System.out.println("Digite um número");

        Integer soma = 0;
        Integer maior = 0;
        Integer menor = 1000000;

        List <Integer> listaNumeros = new ArrayList();
        List <Integer> listaPar = new ArrayList();
        List <Integer> listaImpar = new ArrayList();

        Integer adicionaNumero;
        do {
            adicionaNumero = mensagem.nextInt();
            if (adicionaNumero != 0) {
                listaNumeros.add(adicionaNumero);
            }
        } while (adicionaNumero != 0);

        for (int i = 0; i < listaNumeros.size(); i++) {

            Integer numeroAtual = listaNumeros.get(i);
            soma += numeroAtual;

            if (numeroAtual % 2 == 0){
                listaPar.add(numeroAtual);
            }else{
                listaImpar.add(numeroAtual);

            };

            if (numeroAtual > maior){
                maior = numeroAtual;
            };

            if (numeroAtual < menor && numeroAtual > 0){
                menor = numeroAtual;
            };
        }


        String mensagemFinal = String.format("""
               Os números pares são %d
               Os números impares são %d
               A soma dos números deu %d
               O maior número é %d
               O menor número é %d
                """, listaPar.size(), listaImpar.size(), soma, maior, menor);

        System.out.println(mensagemFinal);

    }
}