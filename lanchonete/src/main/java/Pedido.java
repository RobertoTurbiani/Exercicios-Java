public class Pedido {

    // atributos
    // Construtor
    // metodos
    // get set

    private String lanche;
    private String bebida;
    private Double valor;

    public Pedido(String lanche, String bebida, Double valor) {
        this.lanche = lanche;
        this.bebida = bebida;
        this.valor = valor;
    }

    public void exibirPedido(){
        System.out.println("""
                Pedido:
                lanche %s
                bebida %s
                valor %.2f
                """.formatted(lanche,bebida,valor));
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public Double getValor() {
        return valor;
    }

}
