public class NivelamentoOperadores {

    public static void main(String[] args) {
        // No JS:
        // Soma: +
        // Subtração: -
        // Divisão: /
        // Multiplicação: *
        // Resto: %
        // **
        // --
        // +=
        // -=


        Double numero01 = 2.0;
        Double numero02 = 5.0;




        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Subtração: " + (numero01 - numero02));
        System.out.println("Divisão: " + (numero01 / numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);

        System.out.println("Potencia:" + resultadoPotencia);
        System.out.println("Potencia sem variável :" + Math.pow(numero01, numero02));
    }
}

