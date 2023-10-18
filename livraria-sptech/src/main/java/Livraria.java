public class Livraria {
    private  Integer id;
    private String nome;
    private Integer preco;

    public Livraria(){}

    public Livraria(Integer id, String nome, Integer preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Livraria{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
