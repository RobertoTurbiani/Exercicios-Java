public class CalculadoraTroco {
    public static void main(String[] args) {

        Double unidade = 10.00;
        Integer quantidade = 15;
        Double valorPago = 200.00;

        Double qtdProdutos = valorPago - (quantidade * unidade)  ;

        System.out.println("Seu troco será de R$ " + qtdProdutos);
    }
}
