package empresa;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();

        empregado01.nome = "Marcos";
        empregado01.cargo = "Banqueiro";
        empregado01.salario = 10400.00;

        empregado01.reajustarSalario(5.00);

        System.out.println(String.format("""
                Empregado 01
                Nome: %s
                Cargo: %s
                Salário: %.2f
                """, empregado01.nome, empregado01.cargo, empregado01.salario));


        Empregado empregado02 = new Empregado();

        empregado02.nome = "Raquel";
        empregado02.idade = 21;
        empregado02.cargo = "Dançarina";
        empregado02.salario = 4000.00;

        System.out.println(String.format("""
                Empregado 02
                Nome: %s
                Idade: %d anos
                Cargo: %s
                Salário: %.2f
                """, empregado02.nome,empregado02.idade, empregado02.cargo, empregado02.salario));
    }
}
