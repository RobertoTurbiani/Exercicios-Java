package encomendas;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia = 0.0;
    Double valorEncomenda = 0.0;


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
    }

