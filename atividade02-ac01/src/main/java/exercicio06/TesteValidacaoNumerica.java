package exercicio06;

import java.util.Scanner;

public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        Scanner leitorNumeros = new Scanner(System.in);
        ValidacaoNumerica util = new ValidacaoNumerica();

        while(true) {
            System.out.println("\nInsira um número inteiro positivo(negativo para finalizar): ");
            Integer num = leitorNumeros.nextInt();

            if(num < 0){
                System.out.println("Até mais");
                break;
            }
            else {
                util.verificarPrimo(num);
            }

        }
    }
}
