package TreinoExEmpresa;

public class RecursosHumanos {

    private Integer totalPromivodos = 0;

    private Integer totalSalariosReajustados = 0;


    public void reajusteSalario(Colaborador colaborador, Double reajuste ){

        if (reajuste > colaborador.getSalario()){
            promoverColaborador(colaborador);
            colaborador.setSalario(reajuste);
            totalPromivodos ++;
            totalSalariosReajustados++;

        } else{
            System.out.println("Operação inválida");
            colaborador.getSalario();
        }
    }

    public void promoverColaborador(Colaborador colaborador){
        colaborador.setCargo("DBA");
    }

    public void total(Integer totalPromivodos, Integer totalSalariosReajustados){
        System.out.println("""
                Total de salários reajustados e promovidos:
                total de promovidos: %d
                total de salários reajustados: %d
             
                """.formatted(totalPromivodos, totalSalariosReajustados));
    }

    public Integer getTotalPromivodos() {
        return totalPromivodos;
    }

    public void setTotalPromivodos(Integer totalPromivodos) {
        this.totalPromivodos = totalPromivodos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
        this.totalSalariosReajustados = totalSalariosReajustados;
    }
}
