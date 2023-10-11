package treinoPokemon;

public class Pokemon {
   private String nome;
   private String tipo;
   private Integer forca;
   private Integer doces;

    public Pokemon(String nome, String tipo, Integer forca, Integer doces) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces;
    }

    public void exibirPokemon(Pokemon pokemon){
        System.out.println("""
                Dados do Pokémon
                Nome: %s
                Tipo: %s
                Força: %d
                Doces: %d
                """.formatted(pokemon.getNome(),pokemon.getTipo(),pokemon.getForca(),pokemon.getDoces()));
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
