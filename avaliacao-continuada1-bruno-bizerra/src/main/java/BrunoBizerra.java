import java.util.Scanner;

public class BrunoBizerra {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double saldoPontos = 0.0;
        boolean continuar = true;

        String mensagemBemVindo = String.format("""
                *---------------------------------*
                | Bem vindo a Café Tech!          |
                *---------------------------------*
                """);

        System.out.println(mensagemBemVindo);

    do {
        String mensagemOpcoes = String.format("""
                *---------------------------------*
                | Digite a opção desejada:        |
                | 1) Registrar pontos             |
                | 2) Trocar pontos por café       |
                | 3) Simular recarga programada   |
                | 4) Sair                         | 
                *---------------------------------*
                """);

        System.out.println(mensagemOpcoes);

        Integer escolha = leitor.nextInt();
        if (escolha == 1) {
            System.out.println("Quantos pontos deseja cadastrar:");
            Double registrar = leitor.nextDouble();
            if (registrar > 0) {
                saldoPontos += registrar;
                String mensagemRegistrar = String.format("""
                        Recarga efetuada! Quantidade atual de pontos: %.0f
                        """, saldoPontos);
                System.out.println(mensagemRegistrar);
            } else {
                System.out.println("Valor inválido");
            }

        } else if (escolha == 2) {
            System.out.println("Informe a quantidade de cafés desejada:");
            Double trocar = leitor.nextDouble();
            Double valorCafe = 10.0;
            Double valorTotal = trocar * valorCafe;
            if (trocar > 0) {
                if (valorTotal <= saldoPontos) {
                    saldoPontos -= valorTotal;
                    String mensagemTrocar = String.format("""
                            Preparando café! Saldo atual de pontos: %.0f
                            """, saldoPontos);
                    System.out.println(mensagemTrocar);
                } else {
                    Double qtdNecessariaTroca = trocar * 10.0;
                    String mensagemAlertaTroca = String.format("""
                            *-----------------Atenção------------------*
                            Pontos insuficientes para comprar %.0f cafés
                            Pontos necessários: %.0f
                            Saldo atual de pontos: %.0f
                            """, trocar, qtdNecessariaTroca, saldoPontos);
                    System.out.println(mensagemAlertaTroca);
                }
            } else {
                System.out.println("Valor inválido");
            }

        } else if (escolha == 3) {
            System.out.println("Informe a quantidade mensal de pontos:");
            Double qtdPontosSimulados = leitor.nextDouble();
            System.out.println("Por quantos meses deseja realizar essa recarga?");
            Double qtdMesesSimulados = leitor.nextDouble();

            String mensagemSimulacaoSaldo = String.format("""
                    *---------------------------------*
                    Saldo atual de pontos: %.0f          
                    *---------------------------------*
                    """, saldoPontos);
            System.out.println(mensagemSimulacaoSaldo);
            Double saldoSimulado = saldoPontos;
            for (int i = 1; i <= qtdMesesSimulados; i++) {
                saldoSimulado += qtdPontosSimulados;
                String mensagemSimulacaoSaldoMeses = String.format("""
                        Saldo no %d° Mês: %.0f
                        *---------------------------------*
                        """, i, saldoSimulado);
                System.out.println(mensagemSimulacaoSaldoMeses);

            }
            Double qtdCafesSimulados = saldoSimulado / 10;
            String mensagemFinalSimulacao = String.format("""
                    Com esse saldo você consegue tomar %.0f cafés
                    """, qtdCafesSimulados);
            System.out.println(mensagemFinalSimulacao);


        } else {
            System.out.println("Até mais");
            continuar = false;
        }

    } while(continuar);

    }
}
