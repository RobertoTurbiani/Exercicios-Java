package desafio;

import desafiocorrigido.Cofre;

import java.util.Scanner;

public class TesteCofre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer opcao;
        do{
            System.out.println("""
                    1 - nova meta
                    2 - depositar
                    3 - agitar
                    4 - quebrar
                    5 - exibir cofres
                    0 - sair
                    """);
            opcao = in.nextInt();


            switch (opcao){
                case 1:
                    Cofre novoCofre = new Cofre();
                    System.out.println("Qual a meta do cofre?");
                    System.out.println(novoCofre);
            }


        }while(opcao != 0);
    }
}
