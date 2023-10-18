public class TesteFilme {
    public static void main(String[] args) {
        Filme filme01 = new Filme(1, "Shrek", 2009);
        Filme filme02 = new Filme(2, "Shrek 2", 2011);

        System.out.println(filme01);
        System.out.println(filme02);

        filme01.assistir();

        System.out.println(filme01);
        System.out.println(filme02);
    }
}
