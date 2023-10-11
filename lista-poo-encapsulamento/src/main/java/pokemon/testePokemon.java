package pokemon;

public class testePokemon {
    public static void main(String[] args) {


        Pokemon pokemon01 =new Pokemon("Pikachu", "elétrico" ,100.0, 5);
        Pokemon pokemon02 =new Pokemon("Charmander", "fogo" ,130.0, 15);

        TreinadorPokemon treinar01 = new TreinadorPokemon("Roberto", 1);
        TreinadorPokemon treinar02 = new TreinadorPokemon("Roberto", 1);




        treinar01.treinarPokemon(pokemon01);
        treinar01.treinarPokemon(pokemon01);
        treinar01.treinarPokemon(pokemon01);
        treinar01.treinarPokemon(pokemon01);
        treinar01.treinarPokemon(pokemon01);

        pokemon01.exibirPokemon();

        treinar01.evoluirPokemon(pokemon01, "Raichu");


        treinar02.treinarPokemon(pokemon02);
        treinar02.treinarPokemon(pokemon02);

        pokemon02.exibirPokemon();

        treinar02.evoluirPokemon(pokemon02, "Charmeleon");

        treinar01.treinador();
        treinar02.treinador();

    }
}
