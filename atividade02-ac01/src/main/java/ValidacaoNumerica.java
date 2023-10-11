import java.util.Scanner;

public class ValidacaoNumerica {
    public static void main(String[] args) {

        do {

            Scanner leitor = new Scanner(System.in);

            TesteValidacaoNumerica primo = new TesteValidacaoNumerica();

            System.out.println("Digite um número positivo");
            Integer valores = leitor.nextInt();

            primo.verificarPrimo(valores);

            System.out.println(primo);
        }
        while (true);

    }
}
