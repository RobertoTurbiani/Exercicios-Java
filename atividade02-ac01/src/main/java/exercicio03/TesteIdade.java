package exercicio03;

import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitorIdade = new Scanner(System.in);
        Idade idade = new Idade();

        System.out.println("Digite a sua idade: ");
        Integer idadeDigitada = leitorIdade.nextInt();
        idade.classificaIdade(idadeDigitada);
    }
}