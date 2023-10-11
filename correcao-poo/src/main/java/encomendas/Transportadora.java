package encomendas;

import bolos.Bolo;

public class Transportadora {
    public static void main(String[] args) {

        Encomenda encomenda1 = new Encomenda("p","Imirim","Paulista",40.0,189.9);

        encomenda1.setEnderecoRemetente("Augusta");
        encomenda1.calcularFrete();

        encomenda1.emitirEtiqueta();

        System.out.println(encomenda1.getTamanho());

    }
}
