package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer diaSemana = leitor.nextInt();

        LocalDate hoje = LocalDate.now();

        DateTimeFormatter formatadorDeData = DateTimeFormatter
                .ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(leitor.nextLine(), formatadorDeData);

        if(date.isEqual(hoje)) {
            System.out.println("O dia " + date + " é hoje e é " + date.getDayOfWeek());
        } else if(date.isAfter(hoje)){
            System.out.println("O dia " + date + " será " + date.getDayOfWeek());
        } else if(date.isBefore(hoje)){
            System.out.println("O dia " + date + " foi " + date.getDayOfWeek());
        }


        switch (diaSemana) {
            case 1 -> System.out.println("Segunda-Feira");
            case 2 -> System.out.println("Terça-Feira");
            case 3 -> System.out.println("Quarta-Feira");
            case 4 -> System.out.println("Quinta-Feira");
            case 5 -> System.out.println("Sexta-Feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
        }
    }
}