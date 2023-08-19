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



        Integer valorI = leitor.nextInt();
        Integer escolha = leitor.nextInt();

        Double resultado = 0.0;

        if (valorI.equals(1)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha + i;

                String mensagem = String.format("""
                    %d + %d = %d
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(2)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha * i;

                String mensagem = String.format("""
                    %d * %d = %d
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(3)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha / i;

                String mensagem = String.format("""
                    %d / %d = %d
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(4)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha - i;

                String mensagem = String.format("""
                    %d - %d = %d
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(5)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha * i;

                String mensagem = String.format("""
                    %d - %d = %d
                    """, escolha, i, resultado);


                System.out.println(mensagem);
            }
        }

        if (valorI.equals(6)) {

            for (int i = 1; i <=10 ; i++) {

                resultado = escolha % i;

                String mensagem = String.format("""
                    %d - %d = %d
                    """, escolha, i, porcent);


                System.out.println(mensagem);
            }
        }


        if (valorI.equals(0)){
            System.out.println("Até logo");
        }

    }
}
