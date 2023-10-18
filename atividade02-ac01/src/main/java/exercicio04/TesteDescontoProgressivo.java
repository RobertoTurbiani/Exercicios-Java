package exercicio04;

import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner leitorProduto = new Scanner(System.in);
        DescontoProgressivo notaFiscal = new DescontoProgressivo();

        notaFiscal.exibirBemVindo();

        System.out.println("Digite o valor unitário do produto: ");
        Double valorProduto = leitorProduto.nextDouble();
        System.out.println("Digite a quantidade: ");
        Double quantidadeProduto = leitorProduto.nextDouble();

        Double desconto = 0.0;
        Double valorComDesconto = notaFiscal.calcularDesconto(valorProduto, quantidadeProduto, desconto);

        notaFiscal.exibirLinha();
        notaFiscal.calcularDesconto(valorProduto, quantidadeProduto, valorComDesconto);

        String mensagemNota = String.format("""
                Valor do Produto: %.2f\n
                Quantidade: %.2f\n
                """, valorProduto, quantidadeProduto);

        System.out.println(mensagemNota);
        notaFiscal.exibirLinha();

        String mensagemNotaComDesconto = String.format("""
                Valor com desconto: R$%.2f
                """,valorComDesconto);
        System.out.println(mensagemNotaComDesconto);
    }
}
