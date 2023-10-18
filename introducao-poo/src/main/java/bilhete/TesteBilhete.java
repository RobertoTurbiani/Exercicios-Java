package bilhete;

public class TesteBilhete {
    public static void main(String[] args) {
        //Instanciar = criar um objeto
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "William";
        bilhete01.saldo = 0.0;

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Xampson";
        bilhete02.saldo = 0.0;

        //Invocando o método carregar
        bilhete01.carregar(42.0);
        bilhete02.carregar(10.0);
    }
}
