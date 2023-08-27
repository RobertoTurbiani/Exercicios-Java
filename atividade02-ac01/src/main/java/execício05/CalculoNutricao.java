package execício05;

public class CalculoNutricao {

    void nomeDoUsuario(String nome){

        String msgNomeUsuario = String.format("Olá seu nome é: %s \n",nome);
        System.out.println(msgNomeUsuario);
    }

    Double calculaIMC(Double peso, Double altura){

        Double resultadoIMC = peso/(altura*altura);

        String msgFinal = String.format("Seu IMC é: %.1f \n",resultadoIMC);
        System.out.println(msgFinal);

        return resultadoIMC;
    }
}
