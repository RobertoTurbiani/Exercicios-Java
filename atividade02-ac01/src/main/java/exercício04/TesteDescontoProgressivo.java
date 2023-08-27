package exercício04;

import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner leitorNotaFiscal = new Scanner(System.in);
        DescontoProgessivo notaFiscal = new DescontoProgessivo();

        Double desconto = 0.0;

        notaFiscal.exibirBemVindo();
        System.out.println("Digite o valor unitário do produto:");
        Integer valorDigitado = leitorNotaFiscal.nextInt();

        System.out.println("Digite a quantidade:");
        Integer qtdDigitado = leitorNotaFiscal.nextInt();

        Double valorComDesconto = notaFiscal.calcularDesconto(valorDigitado,qtdDigitado,desconto);

        // Mensagens Finais
        notaFiscal.exibirLinha();

        String msgNota = String.format("Valor do produto: R$%d\n" +
                "Quantidade: R$%d", valorDigitado,qtdDigitado);
        System.out.println(msgNota);

        notaFiscal.exibirLinha();

        String msgNotaComDesconto = String.format("Valor com desconto: R$%.2f",valorComDesconto);
        System.out.println(msgNotaComDesconto);
    }
}
