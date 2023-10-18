package Confeitaria;

import java.util.Scanner;

//public class AppDificil {
//    public static void main(String[] args) {
//        Scanner leitor = new Scanner (System.in);
//
//        Integer chocolate = 0;
//        Integer laranja = 0;
//        Integer limao = 0;
//
//        String menu = String.format("""
//                -----------------------------
//                | Escolha um bolo           |
//                -----------------------------
//                | 1 - Chocolate, R$30.00    |
//                | 2 - Laranja, R$39.99      |
//                | 3 - Limão, R$46.50        |
//                -----------------------------
//                """);
//
//        boolean continuar = true;
//
//        do{
//            System.out.println(menu);
//
//            Integer escolha;
//            escolha = leitor.nextInt();
//
//            switch (escolha){
//                case 1 -> {
//                    Bolo bolo1 = new Bolo();
//                    bolo1.sabor = "Chocolate";
//                    bolo1.valor = 30.00;
//
//                    System.out.println("Quantos bolos você quer comprar?");
//                    bolo1.quantidadeVendida = leitor.nextInt();
//
//                    bolo1.comprarBolo(chocolate);
//
//                    bolo1.exibirRelatorio();
//                }
//                case 2 -> {
//                    Bolo bolo2 = new Bolo();
//                    bolo2.sabor = "Laranja";
//                    bolo2.valor = 39.99;
//
//                    System.out.println("Quantos bolos você quer comprar?");
//                    bolo2.quantidadeVendida = leitor.nextInt();
//
//                    bolo2.comprarBolo(laranja);
//
//                    bolo2.exibirRelatorio();
//                }
//                case 3 -> {
//                    Bolo bolo3 = new Bolo();
//                    bolo3.sabor = "Limão";
//                    bolo3.valor = 46.50;
//
//                    System.out.println("Quantos bolos você quer comprar?");
//                    bolo3.quantidadeVendida = leitor.nextInt();
//
//                    bolo3.comprarBolo(limao);
//
//                    bolo3.exibirRelatorio();
//                }
////                default -> System.out.println("Obrigado pela compra! Até logo");
//            }
//        } while(continuar);
//
//    }
//}

