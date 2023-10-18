package Empresa;

public class Empregado {
    private String nome;
    private String cargo;
    private Double salario;

    Integer idade;

    public Empregado(String nome, String cargo, Double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empregado(String nome, String cargo, Double salario, Integer idade){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
    }

    void reajustarSalario(Double porcentagemReajuste){
        salario *= (porcentagemReajuste / 100) + 1;
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
