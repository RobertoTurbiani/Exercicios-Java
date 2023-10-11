package empresa;

public class Empregado {
    String nome;
    String cargo;
    Double salario;

    Integer idade;

    void reajustarSalario(Double porcentagemReajuste){
        salario *= (porcentagemReajuste / 100) + 1;
    }
}
