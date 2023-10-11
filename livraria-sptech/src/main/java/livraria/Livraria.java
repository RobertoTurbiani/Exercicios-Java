package livraria;

public class Livraria {
    private Integer id;
    private String nome;
    private Integer preco;

    public Livraria() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return """
                Dados do Livro
                
                id %d
                Nome: %s
                Preço: %d
                """.formatted(id,nome,preco);
    }
}
