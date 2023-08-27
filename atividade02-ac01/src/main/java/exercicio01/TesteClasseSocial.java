package exercicio01;

import exercicio01.ClasseSocial;

import java.util.Scanner;

public class TesteClasseSocial {
    public static void main(String[] args) {

        Scanner leitorRenda = new Scanner(System.in);
        ClasseSocial classe = new ClasseSocial();

        System.out.println("Digite sua renda:");
        Double renda = leitorRenda.nextDouble();

        Double qtdRenda = classe.qtdSalarios(renda);
        String classiRenda = classe.classificarClasseSocial(qtdRenda);

        String msgFinal = String.format("Você recebe aproximadamente %.1f salários mínimos." +
                "Você pertence a classe social: %s", qtdRenda,classiRenda);

        System.out.println(msgFinal);
    }
}
