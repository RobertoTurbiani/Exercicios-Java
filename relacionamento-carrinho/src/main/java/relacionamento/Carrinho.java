package relacionamento;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String cliente;
    private List <Produto> produtos;
    public Carrinho(String cliente) {
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
    }
    public Integer getQuantidade (){
        Integer quantidadeProdutos = produtos.size();

        return  quantidadeProdutos;
    };

    public void adicionar(Produto p){

        produtos.add(p);
    }

    public Boolean existPorNome (String nome){
        Boolean existeProduto = false;
        for (Produto p: produtos) {
            if (p.getNome().equals(nome)){
                existeProduto = true;
            }
        }
        return existeProduto;
    };

    public Integer getQuantidadePorCategoria (String nome){
        Integer quantidadePorCategoria = 0;

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCategoria().equals(nome)){
                quantidadePorCategoria ++;
            }
        }
        return quantidadePorCategoria;
    }

   public void limpar (){
        produtos.clear();
    };

   public void removerporNome(String nome){
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)){
                produtos.remove(i);
            }
        }
    };

    public Produto getPorNome(String nome){
        for (Produto p: produtos) {
            if (p.getNome().equals(nome)){

                return p;
            }
        }

        return null;
    }

    public Double getValorTotal(){
        Double valorTotal = 0.0;
        for (Produto p: produtos) {
            valorTotal += p.getPreco();
        }
        return  valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return """
               Cliente
               
               Nome do Cliente: %s
               Produtos %s
                """.formatted(cliente,produtos);
    }
}
