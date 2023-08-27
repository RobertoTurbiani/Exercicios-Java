package exercício04;

public class DescontoProgessivo {
    Double calcularDesconto (int valorProduto, int qtdProduto, Double valorComDesconto){
        Double desconto = 0.0;

        int valorSemDesconto = valorProduto * qtdProduto;

        if (qtdProduto == 1){
            desconto += 10;
        } else if (qtdProduto >= 2){
            desconto += 20;
        } else if (qtdProduto >= 3){
            desconto += 30;
        }

        Double porcentagemDoValor = valorSemDesconto * (desconto/100);
        valorComDesconto = valorSemDesconto - porcentagemDoValor;
        return valorComDesconto;
    }

    void exibirBemVindo(){
        System.out.println("Bem-vindo ao sistema de desconto progessivo!\n");
    }

    void exibirLinha(){
        System.out.println("--------------------------------------------");
    }


}
