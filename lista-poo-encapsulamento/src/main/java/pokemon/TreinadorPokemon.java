package pokemon;

public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    public  TreinadorPokemon(String nome, Integer nivel){

    this.nome = nome;
    this.nivel = nivel;

    }

    public void treinarPokemon(Pokemon pokemon){

        pokemon.getNome();
        pokemon.setForca(pokemon.getForca() * 1.1);
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel += 2;

        System.out.println("""
             O Pokémon %s teve seu poder aumentado 10%%, o que resultou em %.0f de força.
             Seus doces também foram aumentados, agora ele possui %d doces.
             O nível do treinador %s foi aumentado, agora está no nível: %d
                """.formatted(pokemon.getNome(), pokemon.getForca(), pokemon.getDoces(), nome, nivel));
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){

        if (pokemon.getDoces() >= 50){
            String nomeAnterior = pokemon.getNome();
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;
            System.out.println("""
                    Pokémon %s evoluiu para %s
                    """.formatted(nomeAnterior, pokemon.getNome()));
        } else {
            System.out.println("Não foi possível realizar operação");
        }

    }


    public void  treinador(){
        System.out.println("""
                Nome do treinador: %s
                Nivel do treinador: %d
                """.formatted(nome,nivel));
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
