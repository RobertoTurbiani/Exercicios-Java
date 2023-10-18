package Encomendas;

public class Encomenda {
    private String tamanho;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private Double distancia;
    private Double valorEncomenda;

    public Encomenda(String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda){
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    Double calcularFrete(){
        Double addTamanho = 0.0;
        Double addDistancia = 0.0;
        if(tamanho.equals("P")){
            addTamanho = 0.01;
        } else if(tamanho.equals("M")){
            addTamanho = 0.03;
        } else if(tamanho.equals("G")){
            addTamanho = 0.05;
        }

        if(distancia <= 50){
            addDistancia = 3.0;
        }else if(distancia >= 51 && distancia <= 200){
            addDistancia = 5.00;
        }else if(distancia > 201){
            addDistancia = 7.00;
        }

        Double frete = (valorEncomenda * addTamanho) + addDistancia;

        return frete;
    }

    void emitirEtiqueta(){
        Double frete = calcularFrete();
        Double valorTotal = valorEncomenda + frete;
        System.out.println(String.format("""
                ***** ETIQUETA PARA ENVIO *****
                Endereço do remetente: %s
                Endereço do destinatário: %s
                Tamanho: %s
                --------------------------------------------------
                Valor encomenda: R$ %.2f
                Valor frete: R$ %.2f
                --------------------------------------------------
                Valor total: R$ %.2f
                                
                """, enderecoRemetente, enderecoDestinatario, tamanho, valorEncomenda, frete, valorTotal));
    }
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(Double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }


}
