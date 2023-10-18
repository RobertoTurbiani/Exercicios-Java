import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Integer nota1 = 0;
        Integer nota2 = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua primeira nota:");
        nota1 = in.nextInt();
        System.out.println("Digite sua segunda nota:");
        nota2 = in.nextInt();

        String mensagem = String.format("""
                Sua primeira nota é: %d 
                Sua segunda nota é: %d """, nota1, nota2);

        System.out.println(mensagem);

        System.out.println("A média da sua nota é: " + ((nota1*0.4) + (nota2*0.6)));
    }
}
