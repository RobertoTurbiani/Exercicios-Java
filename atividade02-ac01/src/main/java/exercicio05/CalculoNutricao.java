package exercicio05;

public class CalculoNutricao {
    Double calculaIMC(Double peso, Double altura){
        Double IMC = peso / (altura * altura);
        return IMC;
    }
}
