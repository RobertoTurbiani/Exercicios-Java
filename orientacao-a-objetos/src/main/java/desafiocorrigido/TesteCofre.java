package desafiocorrigido;

public class TesteCofre {
    public static void main(String[] args) {
        Cofre cofre1 = new Cofre();

        // Testes para receber o retorno
        cofre1.meta = "Carro";
        System.out.println(String.format("Meta Cofre: %s", cofre1.meta));

        cofre1.depositar(20.0);
        System.out.println(String.format("Saldo: %.2f", cofre1.saldo));

        Double valorRetirado = cofre1.agitar();
        System.out.println("Valor retirado: " + valorRetirado);
        System.out.println(String.format("Saldo: %.2f", cofre1.saldo));

        Double total = cofre1.quebrar();
        System.out.println(String.format("Total no cofre: %.2f", total));
        System.out.println(String.format("Saldo: %.2f", cofre1.saldo));

        // Teste para exibir a mensagem
        cofre1.depositar(10.0);
        cofre1.agitar();
        cofre1.quebrar();

    }
}
