package bilhete;

public class BilheteUnico {
    // Atributos = Caracteristics

    String nomeTitular;

    Double saldo;

    void carregar(Double valor){

        System.out.println(String.format("""
               Saldo antes de carregar: %.2f
                """, saldo));

        // Mudando o saldo:

        saldo += valor;

        System.out.println(String.format("""
               Saldo após de carregar: %.2f
                """, saldo));

    }

    // Métodos = Comportamentos
}
