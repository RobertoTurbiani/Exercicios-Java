package exercíco02;

import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner leitorMedia = new Scanner(System.in);
        CalculoAluno calc = new CalculoAluno();

        System.out.println("Digite sua primeira nota:");
        Double nota01 = leitorMedia.nextDouble();

        System.out.println("Digite sua segunda nota:");
        Double nota02 = leitorMedia.nextDouble();

        Double resultado = calc.calcularMedia(nota01, nota02);

        String msgMedia = String.format("Sua média é: %.1f", resultado);
        System.out.println(msgMedia);
    }
}