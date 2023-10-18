import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList(); //INICIA UMA LISTA DO 0
    }

    public Carrinho(String cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }//ADICIONA TUDO QUE TA NUMA LISTA PRODUTO EM OUTRO CARRINHO

    public Integer getQuantidade() {
        Integer qtdProdutos = produtos.size();
        System.out.println("""
                Quantidade de produtos: %d
                """.formatted(qtdProdutos));
        return qtdProdutos;
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public Boolean existePorNome(String nome) {
        Boolean existeNome = false;

        for (Produto p : produtos) {
            if (p.getNome().equals(nome)) {
                existeNome = true;
            }
        }

        return existeNome;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer contador = 0;

        for(Produto produtoDaVez : produtos){
            if(produtoDaVez.getCategoria().equals(nome)){
                contador++;
            }
        }
        return contador;

    }

    public void limpar() {
        for (int i = 0; i <= produtos.size(); i++) {
            produtos.removeAll(produtos);
        }
    }

    public void removerPorNome(String nome) {

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoDaVez = produtos.get(i);
            if (produtoDaVez.getNome().equals(nome)) {
                produtos.remove(i);
                i--;
            }
        }
    }

    public Produto getPorNome(String nome) {
        Produto produto = null;
        for (Produto produtoDaVez : produtos) {
            if (produtoDaVez.getNome().equals(nome)) {
                produto = produtoDaVez;
                //PARA MANIPULAR A LISTA NÃO USAR ESSE FOR, USA O NORMAL
            }
        }
        return produto;
    }

    public Double getValorTotal(){
        Double valorTotal = 0.0;

        for(Produto p : produtos){
            valorTotal += p.getPreco();
        }
        System.out.println("""
                    %.1f
                    """.formatted(valorTotal));
        return valorTotal;
    }

    @Override
    public String toString() {
        return """
                Nome do cliente: %s
                Lista de Produtos: %s
                """.formatted(cliente, produtos);
    }
}
