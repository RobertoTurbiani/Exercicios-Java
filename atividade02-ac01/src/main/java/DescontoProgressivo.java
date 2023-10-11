import java.util.Scanner;

public class DescontoProgressivo {
    public static void main(String[] args) {

        Scanner leitorvalor = new Scanner(System.in);
        Scanner leitorQtd = new Scanner(System.in);

        TesteDescontoProgressivo desc = new TesteDescontoProgressivo();

        System.out.println("Digite o valor unitário do produto:");
        Double valor = leitorvalor.nextDouble();

        System.out.println("Digite a quantidade:");
        Double quantidade = leitorQtd.nextDouble();

        desc.calcularDesconto(valor, quantidade);
        desc.exibirNotaFiscal(valor, quantidade);
        System.out.println(desc);
    }
}
