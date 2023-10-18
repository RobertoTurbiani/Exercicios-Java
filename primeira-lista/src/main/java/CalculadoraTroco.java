public class CalculadoraTroco {
    public static void main(String[] args) {
        Double valorProduto = 14.5;
        Integer quantidadeVendida = 3;
        Double valorPago = 60.0;

        Double resultadoTroco = valorPago - (valorProduto * quantidadeVendida);

        System.out.println("Seu troco será de R$ " + resultadoTroco);
    }
}
