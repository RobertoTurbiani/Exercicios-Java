package encomendas;

public class transportadora {
    public static void main(String[] args) {

        Encomenda encomenda1 = new Encomenda();

        encomenda1.tamanho = "P";
        encomenda1.enderecoRemetente = "Avenida Paulista, 595";
        encomenda1.enderecoDestinatario = "Imirim, 972";
        encomenda1.distancia = 62.0;
        encomenda1.valorEncomenda = 187.39;

        encomenda1.emitirEtiqueta();

        Encomenda encomenda2 = new Encomenda();

        encomenda2.tamanho = "M";
        encomenda2.enderecoRemetente = "Rua Azul, 190";
        encomenda2.enderecoDestinatario = "Av Aquario, 25";
        encomenda2.distancia = 37.0;
        encomenda2.valorEncomenda = 187.99;

        encomenda2.emitirEtiqueta();

        Encomenda encomenda3 = new Encomenda();

        encomenda3.tamanho = "G";
        encomenda3.enderecoRemetente = "Rua pista, 65";
        encomenda3.enderecoDestinatario = "Av Senna, 95";
        encomenda3.distancia = 257.0;
        encomenda3.valorEncomenda = 89.50;

        encomenda3.emitirEtiqueta();
    }
}
