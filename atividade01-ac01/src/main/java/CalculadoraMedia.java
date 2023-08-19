import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite a primeira nota");

        Integer nota01 = leitor.nextInt();

        System.out.println("Digite a segunda nota");
        Integer nota02 = leitor.nextInt();

        Double media = (nota01 * 0.4) + (nota02 * 0.6);

        String mensagem = String.format ("""
               A media das notas são %2f""", media);

        System.out.println(mensagem);


    }
}
