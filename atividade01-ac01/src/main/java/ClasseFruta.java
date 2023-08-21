import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClasseFruta {
    public static void main(String[] args) {

        List <String> listaFrutas = new ArrayList();
        listaFrutas.add("Uva");
        listaFrutas.add("Banana");
        listaFrutas.add("Maça");

        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o nome de uma fruta");

        String texto =leitor.nextLine();

         int frutList = 0;
        for (int i = 0; i < listaFrutas.size(); i++) {
            if (texto.equalsIgnoreCase(listaFrutas.get(i))){
                frutList++;
            };
        }

        String msg = String.format("""
                a fruta %S já existe na lista
                """, texto);

        String msg2 = String.format("""
               A fruta %s ainda não existe na lista
                """, texto);

        if (frutList >= 0) {
            System.out.println(msg);
        }
        else {
            System.out.println(msg2);
        }
    }
}
