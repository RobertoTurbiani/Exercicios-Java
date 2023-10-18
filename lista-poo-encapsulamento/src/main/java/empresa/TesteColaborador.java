package Empresa;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colaborador01 = new Colaborador("Bruno", "Estagiário", 1800.00);
        Colaborador colaborador02 = new Colaborador("Alfredo", "CEO", 100000.00);

        RecursosHumanos rh01 = new RecursosHumanos(2.0, 4.0);
        RecursosHumanos rh02 = new RecursosHumanos(2.0, 4.0);

        colaborador01.exibirColaborador();
        colaborador02.exibirColaborador();

        rh01.promoverColaborador(colaborador01);

        rh01.reajustarSalario(colaborador01, (colaborador01.getSalario()) * 200.4 / 100);

        colaborador01.exibirColaborador();
        colaborador02.exibirColaborador();

        rh01.exibirPromocaoReajuste();
    }
}
