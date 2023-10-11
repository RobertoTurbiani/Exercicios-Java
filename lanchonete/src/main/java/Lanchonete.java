public class Lanchonete {

    private  String nome;
    private  Double totalVendido;

    public Lanchonete(String nome) {
        this.nome = nome;
        this.totalVendido = 0.0;
    }

    public void  prepararPedido(Pedido pedido){
        System.out.println("Preparando pedido...");

        pedido.exibirPedido();

        totalVendido += pedido.getValor();
    }

    public void exibirRelatorio(){
        System.out.println("""
                Lanchonete: %s
                
                total de pedidos vendidos: %.2f
                """.formatted(nome,totalVendido));
    }

    public String getNome() {
        return nome;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }
}
