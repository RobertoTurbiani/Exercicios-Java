package bilhete;

public class BilheteUnico {
    //Atributos = Características
    String nomeTitular;
    Double saldo;

    //Métodos = Comportamentos

    void carregar(Double valor){
        System.out.println(String.format(
                """
                Saldo antes de carregar: %.2f""", saldo));
        //Mudando saldo:
        saldo += valor;

        System.out.println(String.format(
                """
                Saldo após carregar: %.2f""", saldo));
    }
}
