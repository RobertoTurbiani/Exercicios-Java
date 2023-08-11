public class Potencia {
    public static void main(String[] args) {
        Integer base = 2;
        Integer expoente = 5;
        Integer resultado = 1;

             while (!expoente.equals(0) ) {
                resultado = resultado * base;

                expoente--;
             }
        System.out.println(resultado);

    }
}
