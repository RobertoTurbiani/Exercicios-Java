package ex1;

public class Atividade {
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados = 0;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = diasUsados;
    }

    public void terminarAtividade(Integer diasUsados){
        this.diasUsados = diasUsados;
    }

    public void relatorio(){
        Integer diasUtilizadosMais = diasUsados - diasEstimados;
        Integer diasUtilizadosMenos = diasEstimados - diasUsados;

        if (diasEstimados.equals(diasUsados)){
            System.out.println("""
                    Você estimou %d dias, e a tarefa foi feita em %d dias, atendendo a estimativa
                    com precisão
                    """.formatted(diasEstimados,diasUsados));

        } else if (diasUsados > diasEstimados) {
            System.out.println("""
                    Você estimou %d dias, mas a tarefa foi
                    feita em %d dias (%d dias a mais que o estimado). Melhore a estimativa.
                    """.formatted(diasEstimados,diasUsados,diasUtilizadosMais));
        } else {
            System.out.println("""
                    Você estimou %d dias, e a tarefa foi feita em %d dias (%d dias a menos que o estimado).
                    Parabéns!
                    """.formatted(diasEstimados,diasUsados,diasUtilizadosMenos));
        }
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    @Override
    public String toString() {
        return """
                Atividade
                
                Nome: %s
                Responsavel: %s
                Dias estimados: %d
                dias usados: %d
                """.formatted(nomeAtividade,responsavel,diasEstimados,diasUsados);
    }
}
