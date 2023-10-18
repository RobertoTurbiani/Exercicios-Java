package exercicio02;

import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner leitorMedia = new Scanner(System.in);
        CalculoAluno calc = new CalculoAluno();

        System.out.println("Digite a nota1: ");
        Double nota01 = leitorMedia.nextDouble();
        System.out.println("Digite a nota2: ");
        Double nota02 = leitorMedia.nextDouble();

        Double resultadoMedia = calc.calcularMedia(nota01, nota02);

        String mensagem = String.format("""
                Sua média final é: %.2f
                """, resultadoMedia);

        System.out.println(mensagem);
    }
}
