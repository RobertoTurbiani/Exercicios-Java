package Encomendas;

public class TesteEncomenda {
    public static void main(String[] args) {
        Encomenda encomenda1 = new Encomenda("P", "Rua Ramal dos Menezes, 132",
                "Rua Professor Rocha Vaz, 565", 12.0, 99.9);



        encomenda1.emitirEtiqueta();

        Encomenda encomenda2 = new Encomenda("M", "Rua tal, 000",
                "Rua Gerson, 777", 20.0, 80.0);



        encomenda2.emitirEtiqueta();

        Encomenda encomenda3 = new Encomenda("G", "Rua Alfredo, 666",
                "Rua Gerson, 777", 35.0, 100.0);



        encomenda3.emitirEtiqueta();

    }
}
