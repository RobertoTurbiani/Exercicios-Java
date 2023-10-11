
public class CalcularMedia {

    void calcularMedia(Double nota01, Double nota02) {
        Double media = (nota01 * 0.4) + (nota02 * 0.6) ;

        String resultado = String.format("""
                %.1f
                """, media);

        System.out.println(resultado);
    }

}
