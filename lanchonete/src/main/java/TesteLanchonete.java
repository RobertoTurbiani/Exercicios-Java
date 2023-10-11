import java.util.Scanner;

public class TesteLanchonete {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Pedido pedido01 = new Pedido("Quarteirão", "Coca", 20.0);
        Pedido pedido02 = new Pedido("Dog do Zé", "Proibida", 10.0);
        Lanchonete lanchonete = new Lanchonete("Zéc Donalds");
        Double total = 0.0;
        Integer inputUser;
        do {
            System.out.println("""
                    Qual pedido preparar?
                    
                    1 - %s, %s
                    2 - %s, %s
                    
                    """.formatted(pedido01.getLanche(), pedido01.getBebida(),
                    pedido02.getLanche(), pedido02.getBebida()));
            inputUser = in.nextInt();

            switch (inputUser){
                case 1:
                    lanchonete.prepararPedido(pedido01);
                    break;
                case 2:
                    lanchonete.prepararPedido(pedido02);
                    break;
                default:
                    System.out.println("Pedido não existe");
            }

        } while (inputUser != 0);

        lanchonete.exibirRelatorio();
    }
}
