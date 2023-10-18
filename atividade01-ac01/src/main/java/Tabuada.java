import java.util.Iterator;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n Digíte o número correspondente a operação desejada: ");

        System.out.println("1 - para Soma");
        System.out.println("2 - para Multiplicação");
        System.out.println("3 - para Divisão");
        System.out.println("4 - para Subtração");
        System.out.println("5 - para Potencia");
        System.out.println("6 - para Porcentagem");
        System.out.println("0 - para Sair");

        Integer operacaoMatematica = leitor.nextInt();

        Integer resultado = 0;

        if(operacaoMatematica.equals(1)){
            System.out.println("Digite um número inteiro: ");
            Integer numeroEscolhido = leitor.nextInt();

            for(int i = 1; i <= 10; i++){
                resultado = numeroEscolhido + i;
                String resposta = String.format("""
                        %d + %d = %d
                        """, numeroEscolhido, i, resultado);
                System.out.println(resposta);
            }
        } else if (operacaoMatematica.equals(2)) {
            System.out.println("Digite um número inteiro: ");
            Integer numeroEscolhido = leitor.nextInt();

            for (int i = 1; i <= 10; i++){
                resultado = numeroEscolhido * i;
                String resposta = String.format("""
                        %d * %d = %d
                        """, numeroEscolhido, i, resultado);
                System.out.println(resposta);
            }
        } else if (operacaoMatematica.equals(3)) {
            System.out.println("Digite um número inteiro: ");
            Integer numeroEscolhido = leitor.nextInt();

            for (int i = 1; i <= 10; i++){
                resultado = numeroEscolhido / i;
                String resposta = String.format("""
                        %d / %d = %d
                        """, numeroEscolhido, i, resultado);
                System.out.println(resposta);
            }
        }else if(operacaoMatematica.equals(4)){
            System.out.println("Digite um número inteiro: ");
            Integer numeroEscolhido = leitor.nextInt();

            for (int i = 1; i <= 10; i++){
                resultado = numeroEscolhido - i;
                String resposta = String.format("""
                        %d - %d = %d
                        """, numeroEscolhido, i, resultado);
                System.out.println(resposta);
            }
        } else if (operacaoMatematica.equals(5)) {
            System.out.println("Digite um número inteiro: ");
            Integer numeroEscolhido = leitor.nextInt();

            for (int i = 1; i <= 10; i++){
                Double resultadoPotencia = Math.pow(numeroEscolhido, i);
                String resposta = String.format("""
                        %d ** %d = %.2f
                        """, numeroEscolhido, i, resultadoPotencia);
                System.out.println(resposta);
            }
        } else if(operacaoMatematica.equals(6)){
            System.out.println("Digite o número inteiro: ");
            Integer numeroEscolhido = leitor.nextInt();

            for (int i = 1; i <= 10; i++){
                resultado = numeroEscolhido % i;
                String resposta = String.format("""
                        %d %% %d = %d
                        """, numeroEscolhido, i, resultado);
                System.out.println(resposta);
        }
    } else{
            System.out.println("Até logo!");
        }
}
}
