import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        // Não usaremos uma simples variavel
        // e sim um OBJETO, criamos objetos usando new

        // Métodos que mais usaremos:
        // add - adiciona objeto na lista
        // get - busca o elemento de acordo com indice
        // size - tamanho da lista
        // remove  - remover objeto da lista
        List listaEstranha = new ArrayList();

        listaEstranha.add("Xampson");
        listaEstranha.add(42);
        listaEstranha.add(true);
        listaEstranha.add(42.5);

        // Devemos criar listas de tipos específicos:
        List<String> nomes = new ArrayList();
        nomes.add("Xampson");
        nomes.add("William");
        nomes.add("Giuliana");
        nomes.add("Bob");
        nomes.add("Maria");
        nomes.add("José");

        System.out.println(nomes);

        String segundoNome = nomes.get(1);
        System.out.println("o segundo nome é: " + segundoNome);
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(i + " - " + nomes.get(i));
        }

        // Removendo um elemento
        // o ideal é remover pelo indice
        nomes.remove(0);

        String nomeRemover = "Bob";
        for(int i = 0; i < nomes.size(); i++){
            String nomeDaVez = nomes.get(i);
            if(nomeDaVez.equals(nomeRemover)){
                nomes.remove(i);
            }
        }

        System.out.println("Nomes após remover: " + nomes);

        // Adiciona e "empurra" os outros elementos
        nomes.add(0, "Teste");
        // nomes.clear(); // limpa toda a lista
        // nomes.removeAll(nomesQueQueroRemover);

        if(nomes.isEmpty()){
            System.out.println("Sem nomes ");
        }
    }
}
