package execício05;

import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {
        Scanner leitorIMC = new Scanner(System.in);
        Scanner leitorNome = new Scanner(System.in);

        CalculoNutricao calculoNutricao = new CalculoNutricao();

        System.out.println("Qual o seu nome?");
        String nomeDigitado = leitorNome.nextLine();

        System.out.println("Digite seu peso:");
        Double pesoDigitado = leitorIMC.nextDouble();

        System.out.println("Digite sua altura:");
        Double alturaDigitada = leitorIMC.nextDouble();

        System.out.println("Quer parar a execução do IMC?");
        Integer respostaUsuario = leitorIMC.nextInt();

        if (respostaUsuario != 0) {
            calculoNutricao.nomeDoUsuario(nomeDigitado);
            calculoNutricao.calculaIMC(pesoDigitado,alturaDigitada);
        } else {
            System.out.println("Programa IMC finalizado!!");
        }

    }
}
