import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        TesteIdade resultado = new TesteIdade();

        Integer idade = leitor.nextInt();

        resultado.classificaIdade(idade);

        System.out.println(resultado);

    }
}
