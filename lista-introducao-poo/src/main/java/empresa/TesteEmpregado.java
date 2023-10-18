package Empresa;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado("Bruno", "analista", 4500.00);

        empregado01.reajustarSalario(15.00);

        System.out.println(String.format("""
                Empregado 01
                Nome: %s
                Cargo: %s
                Salário: %.2f
                """, empregado01.getNome(), empregado01.getCargo(),empregado01.getSalario()));


        Empregado empregado02 = new Empregado("Everton", "Desenvolvedor", 1000.00, 20);


        System.out.println(String.format("""
                Empregado 02
                Nome: %s
                Cargo: %s
                Salário: %.2f
                Idade: %d
                """,empregado02.getNome(), empregado02.getCargo(), empregado02.getSalario(), empregado02.getIdade()));
    }
}
