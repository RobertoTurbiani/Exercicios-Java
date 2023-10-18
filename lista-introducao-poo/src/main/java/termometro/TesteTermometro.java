package Termometro;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro(30.0, 100.0, -30.0);



        termometro.aumentaTemperatura(20.0);
        System.out.println(termometro.getTemperaturaAtual());
        termometro.exibeFahreinheit();

        termometro.diminuiTemperatura(15.0);
        System.out.println(termometro.getTemperaturaAtual());
        termometro.exibeFahreinheit();

        termometro.diminuiTemperatura(45.0);
        System.out.println(termometro.getTemperaturaAtual());
        termometro.exibeFahreinheit();

        termometro.aumentaTemperatura(350.0);
        System.out.println(termometro.getTemperaturaAtual());
        termometro.exibeFahreinheit();

    }
}
