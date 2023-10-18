package Confeitaria;

public class App {
    public static void main(String[] args) {
        Bolo bolo1 = new Bolo("Chocolate", 20.0);
        bolo1.setSabor("Chocolate");
        bolo1.setValor(20.0);
        bolo1.setQuantidadeVendida(0);

        Bolo bolo2 = new Bolo("Morango", 30.0);


        Bolo bolo3 = new Bolo("Laranja");


        bolo1.comprarBolo(10);
        bolo3.comprarBolo(21);
        bolo2.comprarBolo(200);
        bolo3.comprarBolo(53);
        bolo1.comprarBolo(38);
        bolo2.comprarBolo(45);


        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();

        String saborBolo1 = bolo1.getSabor();
        System.out.println("Sabor do bolo 1:" + saborBolo1);
    }
}
