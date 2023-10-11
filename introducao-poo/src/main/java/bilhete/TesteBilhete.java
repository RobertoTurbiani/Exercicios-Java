package bilhete;

public class TesteBilhete {
    public static void main(String[] args) {
        // Instânciar = criar um objeto

        BilheteUnico bilhete01 = new BilheteUnico();
        BilheteUnico bilhete02 = new BilheteUnico();

        bilhete01.nomeTitular = "Willian";
        bilhete01.saldo = 0.0;

        bilhete02.nomeTitular = "Xampsom";
        bilhete02.saldo = 0.0;

        //Invocando o método carregar

        bilhete01.carregar(42.0);
        bilhete02.carregar(10.0);
    }
}
