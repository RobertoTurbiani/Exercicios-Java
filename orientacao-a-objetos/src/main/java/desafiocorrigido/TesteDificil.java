package desafiocorrigido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteDificil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inText = new Scanner(System.in);
        List<Cofre> cofres = new ArrayList<>();
        Integer opcao;
        do {
            System.out.println("""
                    1 - nova meta
                    2 - depositar
                    3 - agitar
                    4 - quebrar
                    5 - exibir cofres
                    0 - sair""");
            opcao = in.nextInt();


            switch (opcao) {
                case 1 -> {
                    Cofre novoCofre = new Cofre();
                    System.out.println("Qual a meta do cofre?");
                    novoCofre.meta = inText.nextLine();
                    cofres.add(novoCofre);
                }
                case 2 -> {
                    System.out.println("Qual cofre vamos depositar");
                    String buscaCofre = inText.nextLine();
                    for (int i = 0; i < cofres.size(); i++) {
                        Cofre cofreDaVez = cofres.get(i);
                        if (cofreDaVez.meta.equals(buscaCofre)) {
                            System.out.println("Quanto quer depositar?");
                            Double valor = in.nextDouble();

                            cofreDaVez.depositar(valor);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Qual cofre vamos agitar");
                    String buscaCofre = inText.nextLine();
                    for (int i = 0; i < cofres.size(); i++) {
                        Cofre cofreDaVez = cofres.get(i);
                        if (cofreDaVez.meta.equals(buscaCofre)) {
                            Double valorRetirado = cofreDaVez.agitar();
                            System.out.println(String.format("Consegui retirar %.2f", valorRetirado));
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Qual cofre vamos quebrar");
                    String buscaCofre = inText.nextLine();
                    for (int i = 0; i < cofres.size(); i++) {
                        Cofre cofreDaVez = cofres.get(i);
                        if (cofreDaVez.meta.equals(buscaCofre)) {
                            Double totalNoCofre = cofreDaVez.quebrar();
                            System.out.println(String.format("Consegui juntar R$%.2f", totalNoCofre));
                        }
                    }
                }
                case 5 -> System.out.println(cofres);
            }
        }while(opcao != 0);
    }
}
