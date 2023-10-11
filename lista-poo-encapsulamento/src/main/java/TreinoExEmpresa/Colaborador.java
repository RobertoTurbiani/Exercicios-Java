package TreinoExEmpresa;

public class Colaborador {
   private String nome;
   private String cargo;
   private Double salario;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirColaborador(Colaborador colaborador){
        System.out.println("""
                Dados do colaborador:
                Nome %s
                Cargo %s
                Salário %.2f
                """.formatted(colaborador.getNome(),colaborador.getCargo(), colaborador.getSalario()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
