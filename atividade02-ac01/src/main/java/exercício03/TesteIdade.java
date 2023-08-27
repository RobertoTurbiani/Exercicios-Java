package exercício03;

import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitorIdade = new Scanner(System.in);
        Idade faixaEtaria = new Idade();

        System.out.println("Digite sua idade:");
        Integer idadeDigitada = leitorIdade.nextInt();
        faixaEtaria.classificaIdade(idadeDigitada);
    }
}
