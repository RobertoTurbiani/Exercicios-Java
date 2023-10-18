import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nomeDoUsuario = leitor.nextLine();

        System.out.println(nomeDoUsuario);

        System.out.println("Digite sua idade (somente numero): ");
        Integer idade = leitor.nextInt();

        System.out.println(idade);

        System.out.println("Digite sua altura:");

        Double altura = leitor.nextDouble();

        System.out.println(altura);

//        Scanner in = new Scanner(System.in);
//        String nome = "William";
//        System.out.println("Digite seu nome");
//        String nomeLeitor = in.nextLine();
//
//        System.out.println(nome.equals(nomeLeitor));
    }
}
