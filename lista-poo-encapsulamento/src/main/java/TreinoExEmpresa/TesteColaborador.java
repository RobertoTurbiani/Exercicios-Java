package TreinoExEmpresa;

public class TesteColaborador {
    public static void main(String[] args) {

        Colaborador colaborador01 = new Colaborador("Roberto","Estagiario",2050.0);
        Colaborador colaborador02 = new Colaborador("Julia","Dev",4050.0);

        RecursosHumanos rh = new RecursosHumanos();

        colaborador01.exibirColaborador(colaborador01);
        colaborador02.exibirColaborador(colaborador02);

        rh.promoverColaborador(colaborador01);
        rh.promoverColaborador(colaborador02);

        rh.reajusteSalario(colaborador01,colaborador01.getSalario() *1.5);
        rh.reajusteSalario(colaborador02,colaborador02.getSalario() *0.9);

        colaborador01.exibirColaborador(colaborador01);
        colaborador02.exibirColaborador(colaborador02);

        rh.total(rh.getTotalPromivodos(), rh.getTotalSalariosReajustados());

    }
}
