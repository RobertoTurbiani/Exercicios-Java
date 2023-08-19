import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClasseFruta {
    public static void main(String[] args) {

        Scanner adicionar = new Scanner(System.in);

        String fruta = adicionar.nextLine();

        List <String> listaFrutas = new ArrayList();
        listaFrutas.add("Uva");
        listaFrutas.add("Banana");
        listaFrutas.add("Maça");

        int i = 0;
        while ( i <)

        for (int i = 0; i < listaFrutas.size() ; i++) {

            if (fruta.equals(listaFrutas.get(i))) {
                String mensagem = String.format("""
                Essa foi a fruta digitada %s
                """, fruta);

                System.out.println(mensagem);
            }
        }

    }
}
