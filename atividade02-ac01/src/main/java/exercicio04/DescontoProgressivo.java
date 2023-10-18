package exercicio04;

import org.w3c.dom.ls.LSOutput;

public class DescontoProgressivo {
    Double calcularDesconto(Double valorProduto, Double quantidadeProduto, Double valorComDesconto){
        Double desconto = 0.0;

        Double valorSemDesconto = valorProduto * quantidadeProduto;

        if(quantidadeProduto == 1){
            desconto += 10;
        } else if (quantidadeProduto == 2) {
            desconto += 20;
        } else if(quantidadeProduto >= 3) {
            desconto += 30;
        }

        valorComDesconto = valorSemDesconto - (valorSemDesconto * (desconto/100));
        return valorComDesconto;
    }
    void exibirBemVindo(){
        System.out.println("Bem-vindo ao sistema de desconto progessivo!\n");
    }

    void exibirLinha(){
        System.out.println("--------------------------------------------");
    }
}
