package relacionamento;

public class SuperMercado {
    public static void main(String[] args) {
        Produto produto01 = new Produto("7 Belo","Comestivel",1.00);
        Produto produto03 = new Produto("Planalto","Comestivel",4.00);
        Produto produto02 = new Produto("Café com Leite","Comestivel",10000.00);

        Carrinho carrinho01 = new Carrinho("Murilo");
        Carrinho carrinho02 = new Carrinho("Bruno");

        carrinho01.adicionar(produto01);
        carrinho01.adicionar(produto03);
        carrinho02.adicionar(produto02);

        System.out.println(carrinho01);
        System.out.println(carrinho02);

        System.out.println(carrinho01.getQuantidade());
        System.out.println(carrinho01.existPorNome("7 Belo"));
        System.out.println(carrinho01.getQuantidadePorCategoria("Comestivel"));
        System.out.println(carrinho02.getPorNome("Café com Leite"));
        System.out.println(carrinho01.getValorTotal());
        carrinho01.removerporNome("7 Belo");
        System.out.println(carrinho01);
        carrinho01.limpar();

    }
}
