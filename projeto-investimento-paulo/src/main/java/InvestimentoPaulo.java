import java.util.Scanner;

public class InvestimentoPaulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double saldo = 0.0;

        boolean continuar = true;

        do {
            String resultado = String.format("""
                    ---------------------------------
                    |    SPTech    Investimentos    |
                    ---------------------------------
                    | Olá, o que deseja fazer:      |
                    ---------------------------------
                    | 1 - Depositar                 |
                    | 2 - Sacar                     |
                    | 3 - Simular rendimentos       |
                    | 0 - Sair                      |
                    ---------------------------------
                    """);

            System.out.println(resultado);

            Integer escolha = leitor.nextInt();
            if (escolha == 1) {
                System.out.println("Digíte o valor do depósito: ");
                Double depositar = leitor.nextDouble();
                saldo += depositar;
                if (depositar > 0) {
                    String mensagemDeposito = String.format("Depósito realizado - Saldo atual: R$%.2f", saldo);
                    System.out.println(mensagemDeposito);
                } else {
                    System.out.println("Valor inválido");
                }

            } else if (escolha == 2) {
                System.out.println("Digíte o valor de saque: ");
                Double sacar = leitor.nextDouble();
                if (sacar > 0) {
                    if (saldo >= sacar) {
                        saldo -= sacar;
                        String mensagemSacar = String.format("Saque realizado - Saldo atual: R$%.2f", saldo);
                        System.out.println(mensagemSacar);
                    } else {
                        System.out.println("Valor inválido");
                    }
                }
            } else if (escolha == 3) {
                if (saldo > 0) {
                    System.out.println("Digite um valor para fazer a simulação: ");
                    Double projecao = saldo;
                    String mensagemSaldo = String.format("""
                            
                            | Saldo atual: R$%.2f  |
                            ----------------------------
                            """, saldo);
                    System.out.println(mensagemSaldo);
                    for (int i = 1; i <= 12; i++) {
                        projecao = projecao * 1.1;
                        String mensagemProjecao = String.format("""
                                ----------------------------
                                | Mês %d | Saldo: R$%.2f |
                                ----------------------------
                                """, i, projecao);
                        System.out.println(mensagemProjecao);
                    }
                } else{
                    System.out.println("Saldo Zerado, opção inválida.");
                }
            } else {
                System.out.println("Número inválido");
                continuar = false;
            }
        } while(continuar);
    }
}
