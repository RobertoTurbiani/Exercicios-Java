package Pokemon;

public class Pokémon {
    private String nome;
    private String tipo;
    private Integer forca;
    private Integer doces;

    public Pokémon(String nome, String tipo, Integer forca, Integer doces) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces;
    }

    public void exibirPokemon(){
        System.out.println(String.format("""
                Nome: %s
                Tipo: %s
                Força: %d
                Quantidade de doces: %d
                """, nome, tipo, forca, doces));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }
}
