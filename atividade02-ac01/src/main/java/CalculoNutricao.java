import java.util.Scanner;

public class CalculoNutricao {
    public static void main(String[] args) {

        Scanner leitorAltura = new Scanner(System.in);
        Scanner leitorPeso = new Scanner(System.in);

        TesteCalculoNutricao nutri = new TesteCalculoNutricao();

        System.out.println("Digite a sua altura");
        Double altura = leitorAltura.nextDouble();

        System.out.println("Digite o seu peso");
        Double peso = leitorPeso.nextDouble();

        nutri.calculaIMC(altura,peso);

        System.out.println(nutri);
    }
}
