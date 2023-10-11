package treinoPokemon;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon01 = new Pokemon("Pikachu", "Elétrico",20,10);
        Pokemon pokemon02 = new Pokemon("Charmander", "Fogo",18,15);

        TreinadorPokemon treinadorPokemon = new TreinadorPokemon("Roberto", 5);

        treinadorPokemon.treinarPokemon(pokemon01);
        treinadorPokemon.treinarPokemon(pokemon01);
        treinadorPokemon.treinarPokemon(pokemon01);
        treinadorPokemon.treinarPokemon(pokemon01);
        treinadorPokemon.treinarPokemon(pokemon01);

        pokemon01.exibirPokemon(pokemon01);

        treinadorPokemon.evoluirPokemon(pokemon01,"Raichu");

        pokemon01.exibirPokemon(pokemon01);


        treinadorPokemon.treinarPokemon(pokemon02);
        treinadorPokemon.treinarPokemon(pokemon02);

        pokemon02.exibirPokemon(pokemon02);

        treinadorPokemon.evoluirPokemon(pokemon02,"Charmeleaon");

        treinadorPokemon.exibirTreinador(treinadorPokemon);
    }
}
