package Empresa;

public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirColaborador(){
        System.out.println(String.format("""
                nome: %s
                cargo: %s
                salario: %.2f
                """, nome, cargo, salario));
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
