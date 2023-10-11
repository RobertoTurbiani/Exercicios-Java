public class Filme {
    private Integer id;
    private String nome;
    private Integer anoLancamento;
    private Boolean assistido;



    public Filme(Integer id, String nome, Integer anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.assistido = false;
    }

    public void assitir(){
        assistido = !assistido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;

    }

    public Boolean getAssistido() {
        return assistido;
    }

    public void setAssistido(Boolean assistido) {
        this.assistido = assistido;
    }

    @Override
    public String toString() {
        String jaAssistido = (assistido) ? "Já assisti": "Não vi ainda";
        return """
                id %d
                nome %s
                ano lançamento %d
                Já assistido? %s
                """.formatted(id,nome,anoLancamento,jaAssistido);
    }
}
