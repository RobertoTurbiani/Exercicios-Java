package Pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        Pokémon pokemon01 = new Pokémon("Pikachu", "Elétrico", 40, 15);
        Pokémon pokemon02 = new Pokémon("Charmander", "Fogo", 70, 5);

        TreinadorPokemon treinadorPokemon01 = new TreinadorPokemon("Bruno");
        TreinadorPokemon treinadorPokemon02 = new TreinadorPokemon("Danilo");

        treinadorPokemon01.treinarPokemon(pokemon01);
        treinadorPokemon01.treinarPokemon(pokemon01);
        treinadorPokemon01.treinarPokemon(pokemon01);
        treinadorPokemon01.treinarPokemon(pokemon01);
        treinadorPokemon01.treinarPokemon(pokemon01);

        pokemon01.exibirPokemon();

        treinadorPokemon01.evoluirPokemon(pokemon01, "Raichu");

        pokemon01.exibirPokemon();

        treinadorPokemon02.treinarPokemon(pokemon02);
        treinadorPokemon02.treinarPokemon(pokemon02);

        pokemon02.exibirPokemon();

        treinadorPokemon02.evoluirPokemon(pokemon02, "Charmeleon");

        treinadorPokemon01.statusTreinador();
        treinadorPokemon02.statusTreinador();

    }
}
