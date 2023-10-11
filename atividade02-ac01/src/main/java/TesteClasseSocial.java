import java.util.Scanner;

public class TesteClasseSocial {

    Scanner leitor = new Scanner(System.in);
    Double teste = 10.0;
    Double salario = leitor.nextDouble();
    Double qtdSalario = salario / 1045;

    String mensagemE = String.format("""
                Você recebe aproximadamente   %.1f   salários-mínimos.
                Você pertence a classe social: E.
                """, qtdSalario);

    String mensagemD = String.format("""
                Você recebe aproximadamente   %.1f   salários-mínimos.
                Você pertence a classe social: D.
                """, qtdSalario);

    String mensagemC = String.format("""
                Você recebe aproximadamente   %.1f   salários-mínimos.
                Você pertence a classe social: C.
                """, qtdSalario);

    String mensagemB = String.format("""
                Você recebe aproximadamente   %.1f   salários-mínimos.
                Você pertence a classe social: B.
                """, qtdSalario);

    String mensagemA = String.format("""
                Você recebe aproximadamente   %.1f   salários-mínimos.
                Você pertence a classe social: A.
                """, qtdSalario);
    void resposta() {



        if (qtdSalario <= 2){
            System.out.println(mensagemE );
        } else if (qtdSalario <= 4) {
            System.out.println(mensagemD);
        } else if (qtdSalario <= 10) {
            System.out.println(mensagemC);
        } else if (qtdSalario <= 20) {
            System.out.println(mensagemB);
        } else{
            System.out.println(mensagemA);
        }
    }

}

