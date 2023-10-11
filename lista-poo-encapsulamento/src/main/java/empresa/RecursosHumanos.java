package empresa;

public class RecursosHumanos {
   private Integer totalpromovidos = 0;
   private Integer totalSalarioReajuste = 0;

  public void reajustarSalario(Colaborador colaborador, Double reajuste){

      if (reajuste >= colaborador.getSalario()){
            promoverColaborador(colaborador);
            colaborador.setSalario(reajuste);


            totalpromovidos += 1;
            totalSalarioReajuste += 1;
              System.out.println("""
                  Valor do salario %.2f
                  """.formatted(colaborador.getSalario()));



      } else {
          System.out.println("O salario não pode ser menor do que o atual");
      }
    }

    public void  total (Integer totalpromovidos, Integer totalSalarioReajuste){
        System.out.println("""
                  Total promovidos: %d
                  Total Salarios reajustados: %d
                  """.formatted(totalpromovidos, totalSalarioReajuste));
    }

    public void promoverColaborador(Colaborador colaborador ){

        colaborador.setCargo("dev");

    }

    public Integer getTotalpromovidos() {
        return totalpromovidos;
    }

    public void setTotalpromovidos(Integer totalpromovidos) {
        this.totalpromovidos = totalpromovidos;
    }

    public Integer getTotalSalarioReajuste() {
        return totalSalarioReajuste;
    }

    public void setTotalSalarioReajuste(Integer totalSalarioReajuste) {
        this.totalSalarioReajuste = totalSalarioReajuste;
    }
}


