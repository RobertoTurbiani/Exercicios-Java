public class NIvelamentoOperadores {
    public static void main(String[] args) {
        //No JS:
        //Soma: +
        //Subtração: -
        //Divisão: /
        //Multipicação: *
        //Resto: %
        //++
        //--
        //+=
        //-+
        //Tudo igual no Java, menos... ** (potência)
        //Não tem no Java ===

        Double numero01 = 2.0;
        Double numero02 = 5.0;

        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Subtração: " + (numero01 - numero02));
        System.out.println("Divisão: " + (numero01 / numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Resultado pow: " + resultadoPotencia);

        //Criar a variável é opcional:
        System.out.println("Resultado sem variável: " + Math.pow(numero01, numero02));
    }
}
