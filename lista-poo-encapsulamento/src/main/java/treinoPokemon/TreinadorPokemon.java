package treinoPokemon;

public class TreinadorPokemon {
    private String nome;

    private Integer nivel = 0;

    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void treinarPokemon(Pokemon pokemon){
        pokemon.setForca(pokemon.getForca() + pokemon.getForca() *10 / 100);
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel +=2;
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        if (pokemon.getDoces() >= 50){
            String nomePassado = pokemon.getNome();
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;

            System.out.println("""
                    Pokémon %s evoluiu para -> %s
                    """.formatted(nomePassado,nomeEvolucao));
        } else {
            System.out.println("""
                    Não foi possível realizar operação
                    """.formatted());
        }
    }

    public void exibirTreinador(TreinadorPokemon treinadorPokemon){
        System.out.println("""
                Dados do Treinador
                Nome: %s
                Nivel: %d
                """.formatted(treinadorPokemon.getNome(), treinadorPokemon.getNivel()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }





}
