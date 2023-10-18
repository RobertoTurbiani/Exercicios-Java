package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        DateTimeFormatter formatadorDeData = DateTimeFormatter
                .ofPattern("dd/MM/yyyy");

        System.out.println(data.format(formatadorDeData));

        DateTimeFormatter formatadorDeDataHora = DateTimeFormatter
                .ofPattern("dd/MM/yyyy hh:mm:ss:ms");
        System.out.println(dataHora.format(formatadorDeDataHora));

        System.out.println(dataHora.plusDays(10).format(formatadorDeDataHora));

        System.out.println("Digite sua data de aniversario: ");
        LocalDate aniversario = LocalDate.parse(in.nextLine(), formatadorDeData);
        System.out.println(aniversario);

        System.out.println(aniversario.getDayOfWeek().getValue());

        System.out.println(aniversario.isBefore(LocalDate.now()));
        System.out.println(aniversario.getMonth());

        LocalDate data2 = LocalDate.of(2023, 8, 30);
        System.out.println(data2);
    }
}
