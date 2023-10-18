import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClasseFruta {
    public static void main(String[] args) {

        List <String> nomesFrutas = new ArrayList();
        nomesFrutas.add("Banana");
        nomesFrutas.add("Maça");
        nomesFrutas.add("Manga");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome de uma fruta para saber se ela existe na lista: ");

        String nome = leitor.nextLine();

        int listaFruta = 0;
        for (int i = 0; i < nomesFrutas.size(); i++) {
            if (nome.equalsIgnoreCase(nomesFrutas.get(i))){
                listaFruta++;
            }
        }

        String mensagem = String.format("""
                a fruta %S já existe na lista
                """, nome);

        String mensagem2 = String.format("""
               A fruta %s ainda não existe na lista
                """, nome);

        if (listaFruta >= 0) {
            System.out.println(mensagem);
        }
        else {
            System.out.println(mensagem2);
        }
    }
}