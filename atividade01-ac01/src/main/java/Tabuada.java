import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {


        Scanner leitor =  new Scanner(System.in);

        System.out.println("1 - para Soma");
        System.out.println("2 - para Multiplicação");
        System.out.println("3 - para Divisão");
        System.out.println("4 - para Subtração");
        System.out.println("5 - para Potencia");
        System.out.println("6 - para Porcentagem");
        System.out.println("0 - para Sair");



        Double valorI = leitor.nextDouble();
        Double escolha = leitor.nextDouble();

        Double resultado = 0.0;

        if (valorI.equals(1.0)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha + i;

                String mensagem = String.format("""
                    %2f + %d = %2f
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(2.0)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha * i;

                String mensagem = String.format("""
                    %2f * %d = %2f
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(3.0)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha / i;

                String mensagem = String.format("""
                    %2f / %d = %2f
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(4.0)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha - i;

                String mensagem = String.format("""
                    %2f - %d = %2f
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(5.0)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = Math.pow(escolha, i) ;

                String mensagem = String.format("""
                    %2f - %d = %2f
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(6.0)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha % i;

                String mensagem = String.format("""
                    %2f - %d = %2f
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }


        if (valorI.equals(0)){
            System.out.println("Até logo");
        }

    }
}
