public class Supermercado {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Chocolate", "Doce", 4.99);
        Produto produto02 = new Produto("Refrigerante", "Bebida", 7.99);
        Produto produto03 = new Produto("Pão", "Comida", 1.99);

        Carrinho cliente01 = new Carrinho("Bruno");

        cliente01.adicionar(produto01);
        cliente01.adicionar(produto02);
        cliente01.adicionar(produto03);

        System.out.println(cliente01);
        cliente01.getQuantidade();
        cliente01.getValorTotal();


        System.out.println("O produto com o nome 'Chocolate' existe?");
        String existeProdutoPorNome = cliente01.existePorNome("Chocolate") ? "Sim" : "Não";
        System.out.println(existeProdutoPorNome);

        cliente01.getQuantidadePorCategoria("Bebida");

        cliente01.removerPorNome("Chocolate");
        System.out.println(cliente01);

        cliente01.getPorNome("Refrigerante");

        cliente01.limpar();
        System.out.println(cliente01);
    }
}
