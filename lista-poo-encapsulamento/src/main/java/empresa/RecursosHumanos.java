package Empresa;

public class RecursosHumanos {
    private Double totalDePromovidos;
    private Double totalDeSalariosReajustados;

    public RecursosHumanos(Double totalDePromovidos, Double totalDeSalariosReajustados) {
        this.totalDePromovidos = totalDePromovidos;
        this.totalDeSalariosReajustados = totalDeSalariosReajustados;
    }

    public void reajustarSalario(Colaborador colaborador, Double valorReajuste){
        if(colaborador.getSalario() < valorReajuste) {
            colaborador.setSalario(valorReajuste);
            promoverColaborador(colaborador);

            System.out.println(String.format("""
                    O reajuste salarial do funcionário foi de: %.2f
                    """, valorReajuste));

        } else{
            System.out.println("Operação inválida");
        }
    }

    public void promoverColaborador(Colaborador colaborador){
        Double novoSalario = 10000.00;
        String novoCargo = "Gestor";

        colaborador.setSalario(novoSalario);
        colaborador.setCargo(novoCargo);

        if(colaborador.getSalario() > novoSalario){
            System.out.println("Operação inválida");
        } else{
            System.out.println(String.format("""
                Parabéns %s você foi promovido
                Cargo novo: %s
                Salário novo: %.2f
                """, colaborador.getNome(), colaborador.getCargo(), colaborador.getSalario()));
        }
    }

    public void exibirPromocaoReajuste(){
        System.out.println(String.format("""
                Total de Promovidos: %.0f
                Total de Salários reajustados: %.0f
                """, totalDePromovidos, totalDeSalariosReajustados));
    }
}
