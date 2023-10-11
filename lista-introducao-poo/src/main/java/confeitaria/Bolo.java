package confeitaria;

public class Bolo {

    String sabor1 = "Chocolate";
    String sabor2 = "Morango";
    String sabor3 = "Abacaxi";

    Double preco = 0.0;

    Integer quantidade = 100;

    void comprarBolo(Integer qtd){

        if (qtd >= 100) {
            System.out.println(String.format("""
                    Seu pedido ultrapassou
                    nosso limite diário para esse bolo.
                    """));
        } else {
            quantidade += qtd ;
        }
    };

    void exibirRelatorio (Integer sabor, Integer qtd) {

        if (sabor.equals(1)) {
            Integer qtdChocolate = qtd;
            System.out.println(String.format("""
                        O bolo sabor  de %s, foi comprado %d vezes hoje, totalizando R$ %.2f           
                    """, sabor1, qtdChocolate, preco));

        } else if (sabor.equals(2)) {
            Integer qtdMorango = qtd;
            System.out.println(String.format("""
                        O bolo sabor  de %s, foi comprado %d vezes hoje, totalizando R$ %.2f           
                    """, sabor2, qtdMorango, preco));

        } else if (sabor.equals(3)) {
            Integer qtdabacaxi = qtd;
            System.out.println(String.format("""
                        O bolo sabor  de %s, foi comprado %d vezes hoje, totalizando R$ %.2f           
                    """, sabor3, qtdabacaxi, preco));

        }
    };


};


