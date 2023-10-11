import java.util.Scanner;

public class CalculoAluno {
    public static void main(String[] args) {

        CalcularMedia media = new CalcularMedia();

        Scanner leitor01 = new Scanner(System.in);
        Scanner leitor02 = new Scanner(System.in);

        System.out.println("digite a primeira nota");
        Double nota01 = leitor01.nextDouble();

        System.out.println("digite a segunda nota");
        Double nota02 = leitor02.nextDouble();

        media.calcularMedia(nota01, nota02);


        System.out.println(media);

    }
}
