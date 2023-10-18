package switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer opcao;

        do{
            System.out.println("""
                    1 - Depositar
                    2 - Sacar
                    3 - Rendimento
                    0 - Sair
                    """);
            opcao = in.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        System.out.println("Tchau");
    }
}
