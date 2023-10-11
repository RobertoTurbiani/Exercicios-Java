package termometro;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 35.0;
        termometro.temperaturaMax = 90.0;
        termometro.temperaturaMin = -20.0;


        termometro.aumentaTemperatura(36.0);
        System.out.println(termometro.temperaturaAtual);
        termometro.exibeFahreinheit();

        termometro.diminuiTemperatura(25.0);
        System.out.println(termometro.temperaturaAtual);
        termometro.exibeFahreinheit();

        termometro.diminuiTemperatura(52.0);
        System.out.println(termometro.temperaturaAtual);
        termometro.exibeFahreinheit();

        termometro.aumentaTemperatura(550.0);
        System.out.println(termometro.temperaturaAtual);
        termometro.exibeFahreinheit();

    }
}
