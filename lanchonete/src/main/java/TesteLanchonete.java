import java.util.Scanner;

public class TesteLanchonete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pedido pedido1 = new Pedido("Quarteirão", "Coca", 20.0);
        Pedido pedido2 = new Pedido("Dogão do Zé", "Proibida", 10.0);
        Lanchonete lanchonete = new Lanchonete("Zéc Donalds");

        Double total = 0.0;
        Integer inputUser;
        do {
            System.out.println("""
                    Qual combo devo preparar?
                    1 - %s, %s
                    2 - %s, %s
                    """.formatted(pedido1.getLanche(), pedido1.getBebida(),
                    pedido2.getLanche(), pedido2.getBebida()));
            inputUser = in.nextInt();


            switch (inputUser){
                case 1:
                    lanchonete.prepararPedido(pedido1);
                    break;
                case 2:
                    lanchonete.prepararPedido(pedido2);
                    break;
                default:
                    System.out.println("Pedido não existe");
            }

        } while (inputUser != 0);

        lanchonete.exibirRelatorioi();
    }
}
