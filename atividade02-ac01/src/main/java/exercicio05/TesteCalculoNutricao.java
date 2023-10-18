package exercicio05;

import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {
        Scanner leitorIMC = new Scanner(System.in);
        CalculoNutricao calculoNutricao = new CalculoNutricao();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o peso: ");
            Double peso = leitorIMC.nextDouble();

            System.out.println("Digite a altura: ");
            Double altura = leitorIMC.nextDouble();

            calculoNutricao.calculaIMC(peso, altura);

            Double IMC = calculoNutricao.calculaIMC(peso, altura);

            String mensagemIMC = String.format("""
                    Seu IMC é: %.2f
                    """, IMC);
            System.out.println(mensagemIMC);

            System.out.println("Quer parar a execução do IMC?\n0: Finalizar\n1: Continuar");
            Integer respostaUsuario = leitorIMC.nextInt();

            if (respostaUsuario == 0) {
                continuar = false;
                System.out.println("Programa IMC finalizado!!");
            }
        }
        leitorIMC.close();
    }
}
