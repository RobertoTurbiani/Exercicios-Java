import java.util.Scanner;

public class RobertoTurbiani {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorPontos = new Scanner(System.in);
        Scanner leitorQtdCafe = new Scanner(System.in);
        Scanner leitorRecarga = new Scanner(System.in);
        Scanner leitorMeses = new Scanner(System.in);

        String menu = ("""
              *-------------------------------*
              | Bem Vindo a Café Tech!        |
              *-------------------------------*  
              
              *-------------------------------*
              | Digite a opção desejada:      |
              | 1) Registrar pontos           |
              | 2) Trocar pontos por café     |
              | 3) Simular recarga programada | 
              | 4) Sair                       |
              *-------------------------------*
                """);

        System.out.println(menu);
        Integer numeroDigitado;
        Integer pontuacaoTotal = 0;

        do {

            numeroDigitado = leitor.nextInt();


            if (numeroDigitado.equals(1)) {

                System.out.println("Quantos pontos deseja cadastrar:");
                Integer pontos = leitorPontos.nextInt();


                if (pontos > 0) {
                    System.out.println("Recarga efetuada! quantidade atual de pontos: " + (pontuacaoTotal += pontos));
                    System.out.println(menu);
                } else {
                    System.out.println("Quantidade de pontos inválidos, digite apenas números maiores que 0");
                    System.out.println(menu);
                }
            }

            if (numeroDigitado.equals(2)) {
                System.out.println("Informe a quantidade de cafés desejada:");
                Integer qtdCafe = leitorQtdCafe.nextInt();
                if (qtdCafe > 0) {
                    Integer copos = qtdCafe * 10;
                    Integer qtdPontos = (pontuacaoTotal - copos);
                    if (pontuacaoTotal >= copos) {
                        System.out.println(qtdCafe);
                        System.out.println("Preparando café! Saldo atual de pontos: " + qtdPontos);
                        System.out.println(menu);
                        pontuacaoTotal -= copos;
                    } else {
                        System.out.println("*--------------Atenção-----------*");
                        System.out.println("Pontos insuficientes para comprar " + qtdCafe + " cafés");
                        System.out.println("Pontos necessários: " + qtdPontos);
                        System.out.println("Saldo atual de pontos:" + pontuacaoTotal);

                        System.out.println(menu);
                    }
                } else {
                    System.out.println("Selecione uma quantidade de copos de café positiva");

                    System.out.println(menu);
                }
            }

            if (numeroDigitado.equals(3)) {
                System.out.println("Informe a quantidade  mensal de pontos:");
                Integer recarga = leitorRecarga.nextInt();
                System.out.println("Por quantos meses deseja realizar essa recarga");
                Integer meses = leitorMeses.nextInt();
                System.out.println("Saldo atual de pontos");
                for (int i = 1; i <= meses; i++) {

                    System.out.println("*-----------------*");
                    System.out.println("saldo no " + i + " Mês = " + (pontuacaoTotal += recarga));
                }

                Integer copo = (pontuacaoTotal * 10) / 100;
                System.out.println("Com esse saldo você consegue tomar " + copo + " cafés");

                System.out.println(menu);
                pontuacaoTotal -= (recarga * meses);
            }

        }
      while (numeroDigitado != 4);


    }
}
