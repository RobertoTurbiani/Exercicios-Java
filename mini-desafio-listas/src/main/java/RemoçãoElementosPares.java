import java.util.ArrayList;
import java.util.List;

public class RemoçãoElementosPares {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();
        numeros.add(21);
        numeros.add(40);
        numeros.add(12);
        numeros.add(13);
        numeros.add(5);

        System.out.println(numeros);

        // Integer elementosPares = 0;
        for(int i = 0; i < numeros.size(); i++){
            Integer numeroAtual = numeros.get(i);

            if(numeroAtual % 2 == 0){
                numeros.remove(numeroAtual);
                i--;
            }

        }
        System.out.println(numeros);
    }
}
