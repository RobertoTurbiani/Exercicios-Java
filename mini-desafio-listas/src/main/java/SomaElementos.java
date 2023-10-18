import java.util.ArrayList;
import java.util.List;

public class SomaElementos {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList();
        listaInteiros.add(20);
        listaInteiros.add(12);
        listaInteiros.add(36);

        System.out.println(listaInteiros);

        Integer soma = 0;
        for(int i = 0; i < listaInteiros.size(); i++){
            soma += listaInteiros.get(i);
        }
        System.out.println("A soma é: " + soma);

    }
}
