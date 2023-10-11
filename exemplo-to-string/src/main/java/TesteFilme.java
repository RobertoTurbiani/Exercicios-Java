public class TesteFilme {
    public static void main(String[] args) {
        Filme filme01 = new Filme(1,"Shrek",2009);
        Filme filme02 = new Filme(2,"Shrek 2",2011);



        filme01.assitir();
        System.out.println(filme01);

        filme01.assitir();
        System.out.println(filme01.toString());


    }
}
