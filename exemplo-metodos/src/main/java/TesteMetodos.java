import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteMetodos {
    public static void main(String[] args) {
        String nome01 = "Xampson";
        String nome02 = "William";

        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();

        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);

        Scanner leitor01 = new Scanner(System.in);
        Scanner leitor02 = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Double numeroDigitado01 = leitor01.nextDouble();
        System.out.println("Digite outro número: ");
        Double numeroDigitado02 = leitor02.nextDouble();

        //Chamando sobrecarga
        util.exibirNome("teste");
        util.exibirNome("teste", "da Silva");
        System.out.println("Usando calculadora");

        //Não podemos esquecer de usar o retorno!

        Double resultaodaSoma = calc.somar(numeroDigitado01, numeroDigitado02);
        Double resultaodaSubtrair = calc.subtrair(numeroDigitado01, numeroDigitado02);
        Double resultaodaMultiplicar = calc.multiplicar(numeroDigitado01, numeroDigitado02);
        Double resultaodaDividir = calc.dividir(numeroDigitado01, numeroDigitado02);

        System.out.println("Soma: " + resultaodaSoma);
        System.out.println("Subtrair: " + resultaodaSubtrair);
        System.out.println("Multiplicar: " + resultaodaMultiplicar);
        System.out.println("Dividir: " + resultaodaDividir);

        //System.out.println("Soma + 10: " + (resultaodaSoma + 10));

        //Double resultado = calc.somar(2.0, 10.0);

    }
}
