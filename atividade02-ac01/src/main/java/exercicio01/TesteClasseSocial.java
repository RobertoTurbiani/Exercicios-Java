package exercicio01;

import java.util.Scanner;

    public class TesteClasseSocial {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            ClasseSocial classe = new ClasseSocial();

            System.out.println("Digite sua renda: ");
            Double renda = leitor.nextDouble();

            Double qtdRenda = classe.qtdSalarios(renda);
            String classeRenda = classe.classificarClasseSocial(qtdRenda);

            String mensagemFinal = String.format("Você recebe aproximadamente %.1f salários mínimos." +
                    "Você pertence a classe social: %s", qtdRenda,classeRenda);

            System.out.println(mensagemFinal);
        }
    }
