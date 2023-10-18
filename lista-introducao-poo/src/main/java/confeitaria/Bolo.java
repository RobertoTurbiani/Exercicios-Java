package Confeitaria;

public class Bolo {
    //Modificador de acesso:
    // private - somente a própria classe acessa
    // public - todo projeto acessa
    // default - somente o próprio pacote

    //Encapsulamento
    private String sabor;
    private Double valor;
    private Integer quantidadeVendida;

    public Bolo(String sabor, Double valor){
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = 0;
    }

    //alt + insert
    public Bolo(String sabor, Double valor, Integer quantidadeVendida) {
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = quantidadeVendida;
    }

    //Um construtor pode ser sobrecarregado
    public Bolo(String sabor){
        this.sabor = sabor;
        this.valor = 25.0;
        this.quantidadeVendida = 0;
    }

    void comprarBolo(Integer quantidadeDesejada){
        Integer verificacao =  quantidadeVendida + quantidadeDesejada;
            if(verificacao > 100){
                System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
            } else{
                System.out.println("Comprou!");
                quantidadeVendida += quantidadeDesejada;
            }
    }

    void exibirRelatorio(){
        Double valorTotal = quantidadeVendida * valor;
        System.out.println(String.format("""
                O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f
                """, sabor, quantidadeVendida, valorTotal));
    }

    //Get & Set
    //Get: pegar uma informação
    //Set: alterar um valor
    public void setSabor(String sabor){
        this.sabor = sabor;
        //this sempre se refere ao atributo da classe
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
