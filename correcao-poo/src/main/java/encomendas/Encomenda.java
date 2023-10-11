package encomendas;

public class Encomenda {
  private   String tamanho;
  private String enderecoRemetente = "0la";
  private   String enderecoDestinatario;
  private   Double distancia;
  private   Double valorEncomenda;

    public  Encomenda(String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda){
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    Double calcularFrete(){
        Double addTamanho = 0.0;
        Double addDistancia = 0.0;
        if (tamanho.equals("P")){
          addTamanho = 0.1;
        } else if (tamanho.equals("M")) {
            addTamanho = 0.3;
        } else if(tamanho.equals("G")) {
            addTamanho = 0.5;
        }

        if (distancia < 50){
            addDistancia = 3.0;
        } else if ( distancia >= 51 && distancia <= 200) {
            addDistancia = 5.0;
        } else if(distancia > 201) {
            addTamanho = 7.0;
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
        return this.tamanho;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }


}
