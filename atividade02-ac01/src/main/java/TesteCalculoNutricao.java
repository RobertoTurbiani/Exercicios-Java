public class TesteCalculoNutricao {

    void calculaIMC(Double altura, Double peso){

        Double imc = peso /(altura * altura) ;

        String resultado = String.format("""
                O seu IMC é %.1f
                """, imc);

        System.out.println(resultado);



    }
}
