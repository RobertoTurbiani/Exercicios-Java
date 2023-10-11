package bolos;


// Modificador de Acesso:
// private - somente a própria classe acessa
// public - todo projeto acessa
// default - somente o próprio pacote acessa
public class Bolo {

    //      Caracteristicas do objeto     //

    private String sabor;

    private Double valor;

    private Integer quantidadeVendida;

    //                  Fim                //

    //               Construtor           //


    public Bolo(String sabor, Double valor){
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = 0;
    }

    public Bolo(String sabor){
        this.sabor = sabor;
        this.valor = 25.0;
        this.quantidadeVendida = 0;
    }

    //    Costrutor pode ser sobrecarregado
    //    Nesse caso se o cliente não informa o valor padrão será 25 reais
    public Bolo(String sabor, Double valor, Integer quantidadeVendida) {
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = quantidadeVendida;
    }


    void comprarBolo (Integer quantidadeDesejada) {
        if ((quantidadeDesejada + quantidadeDesejada) > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diario");
        } else{
            System.out.println("Comprou");
            quantidadeVendida += quantidadeDesejada;
        }
    }

    void exibirRelatorio (){
        System.out.println(String.format("""
                O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f
                
                """, sabor, quantidadeVendida, (valor * quantidadeVendida)));
    }

    //    Get & Set
    //    Get pegar uma informação
    //    Set alterar uma informação

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getSabor(){
        return this.sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}