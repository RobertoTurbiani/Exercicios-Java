package confeitaria;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Bolo loja = new Bolo();

        Integer escolha;
        Integer estoqueChoc = 0;
        Integer estoqueMor = 0;
        Integer estoqueAbac = 0;

        String mensagemBolo = String.format("""
                Escolha quantos bolos você quer comprar
                """);

        String mensagem = String.format("""
                    -------------------------
                    | 1) Chocolate          |
                    | 2) Morango            |
                    | 3) Abacaxi            |
                    | 4) Sair               |
                    ------------------------
                    """);

        System.out.println(mensagem);



        do {


            System.out.println("Escolha o bolo");
            escolha = leitor.nextInt();


            if (escolha.equals(1)) {


                System.out.println(mensagemBolo);
                Integer quantidade = leitor.nextInt();
                estoqueChoc += quantidade;

                if (estoqueChoc > 100){
                    loja.preco = 35.00 * estoqueChoc;
                    loja.comprarBolo(estoqueChoc);
                    break;
                } else {
                    loja.preco = 35.00 * estoqueChoc;
                    loja.comprarBolo(estoqueChoc);

                   loja.exibirRelatorio(escolha, estoqueChoc);

                    System.out.println(mensagem);
                }

            } else if (escolha.equals(2)) {


                System.out.println(mensagemBolo);
                Integer quantidade = leitor.nextInt();
                estoqueMor += quantidade;

                if (quantidade > 100){
                    loja.preco = 35.00 * estoqueMor;
                    loja.comprarBolo(estoqueMor);
                    break;
                } else {
                    loja.preco = 45.00 * estoqueMor;
                    loja.comprarBolo(estoqueMor);

                    loja.exibirRelatorio(escolha, estoqueMor);

                    System.out.println(mensagem);
                }

            }

            else  if (escolha.equals(3)) {

                System.out.println(mensagemBolo);
                Integer quantidade = leitor.nextInt();
                estoqueAbac += quantidade;

                if (quantidade> 100){
                    loja.preco = 35.00 * estoqueAbac;
                    loja.comprarBolo(estoqueAbac);
                    break;
                } else {
                loja.preco = 40.00 * estoqueAbac;
                loja.comprarBolo(estoqueAbac);

                loja.exibirRelatorio(escolha, estoqueAbac);

                System.out.println(mensagem);
                }

            }


        }

        while (escolha != 4);
    }
}
