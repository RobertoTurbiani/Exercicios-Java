package ex1;

public class TesteAtividade {
    public static void main(String[] args) {
    Atividade atividade01 = new Atividade("Lp","Kleber",10);
    Atividade atividade02 = new Atividade("SO","KLauson",8);
    Atividade atividade03 = new Atividade("PI","Kleberson",115);

    atividade01.terminarAtividade(10);
    atividade02.terminarAtividade(9);
    atividade03.terminarAtividade(9);
    atividade01.relatorio();
    atividade02.relatorio();
    atividade03.relatorio();


        System.out.println(atividade01);
        System.out.println(atividade02);
        System.out.println(atividade03);
    }
}
