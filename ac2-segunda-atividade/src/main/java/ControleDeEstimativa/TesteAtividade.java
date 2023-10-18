package ControleDeEstimativa;

import ControleDeEstimativa.Atividade;

public class TesteAtividade {
    public static void main(String[] args) {
        Atividade atividade01 = new Atividade("Atividade01", "Bruno", 10);
        Atividade atividade02 = new Atividade("Atividade02", "Taty", 12);
        Atividade atividade03 = new Atividade("Atividade03", "Murilo", 7);

        atividade01.terminarAtividade(10);
        atividade02.terminarAtividade(7);
        atividade03.terminarAtividade(12);

        atividade01.exibirRelatorio();
        atividade02.exibirRelatorio();
        atividade03.exibirRelatorio();

        System.out.println(atividade01);
        System.out.println(atividade02);
        System.out.println(atividade03);

    }
}
