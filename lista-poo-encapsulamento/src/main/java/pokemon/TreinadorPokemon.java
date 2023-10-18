package Pokemon;

public class TreinadorPokemon {
    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 0;
    }

    public void treinarPokemon(Pokémon pokemon){
        pokemon.getNome();
        pokemon.setForca(pokemon.getForca() + pokemon.getForca() * 10 / 100);
        pokemon.setDoces(pokemon.getDoces()+10);
        nivel += 2;

        System.out.println(String.format("""
                O Pokémon %s teve seu poder aumentado 10%%, o que resultou em %d de força.
                Seus doces também foram aumentados, agora ele possui %d doces.
                O nível do treinador %s foi aumentado, agora está no nível: %d
                """, pokemon.getNome(), pokemon.getForca(), pokemon.getDoces(), nome, nivel));
    }

    public void evoluirPokemon(Pokémon pokemon, String nomeEvolucao){
        if(pokemon.getDoces() >= 50){
            String nomeAnterior = pokemon.getNome();
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;

            System.out.println(String.format("""
                    Pokémon %s evoluiu para -> %s
                    Com isso sua quantidade de doces se reduz a %d
                    E nível de experiencia do treinador aumenta para %d
                    """, nomeAnterior, pokemon.getNome(), pokemon.getDoces(), nivel));
        } else{
            System.out.println("Não foi possível realizar a Evolução");
        }
    }

    public void statusTreinador(){
        System.out.println(String.format("""
                Status do Treinador
                Nome: %s
                Nível: %d
                """, nome, nivel));
    }
}
