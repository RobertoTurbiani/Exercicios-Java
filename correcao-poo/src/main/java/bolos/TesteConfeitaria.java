package bolos;

public class TesteConfeitaria {
    public static void main(String[] args) {
        Bolo bolo01 = new Bolo("Chocolate", 20.0);
        Bolo bolo02 = new Bolo("Morango", 45.0);
        Bolo bolo03 = new Bolo("Melão");

        bolo01.comprarBolo(50);
        bolo01.comprarBolo(60);

        bolo02.comprarBolo(30);
        bolo02.comprarBolo(30);
        bolo02.comprarBolo(30);

        bolo01.exibirRelatorio();
        bolo02.exibirRelatorio();

        String saborBolol1 = bolo01.getSabor();
        System.out.println("Sabor do bolo 01:" + saborBolol1);
    }
}
