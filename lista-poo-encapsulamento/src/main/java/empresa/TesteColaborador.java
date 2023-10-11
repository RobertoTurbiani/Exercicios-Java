package empresa;

public class TesteColaborador {
    public static void main(String[] args) {

        Colaborador colaborador01 = new Colaborador("Julia", "Estagiario", 2250.0);
        Colaborador colaborador02 = new Colaborador("Ricardo", "Estagiario", 2050.0);

        RecursosHumanos rh = new RecursosHumanos();

        colaborador01.exibirColaborador();
        colaborador02.exibirColaborador();

        rh.promoverColaborador(colaborador01);
        rh.promoverColaborador(colaborador02);

        rh.reajustarSalario(colaborador01, colaborador01.getSalario() * 1.4);
        rh.reajustarSalario(colaborador02,colaborador02.getSalario() * 1.1);

        colaborador01.exibirColaborador();
        colaborador02.exibirColaborador();

        rh.total(rh.getTotalpromovidos(), rh.getTotalpromovidos());

    }
}
