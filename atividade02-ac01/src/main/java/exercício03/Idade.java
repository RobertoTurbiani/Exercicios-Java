package exercício03;

public class Idade {
    void classificaIdade(Integer idade){

        if (idade >= 0 && idade <= 2){
            System.out.println("Sua faixa etária é: Bebê");
        }
        else if (idade >= 3 && idade <= 11){
            System.out.println("Sua faixa etária é: Criança");
        }
        else if (idade >= 12 && idade <= 19){
            System.out.println("Sua faixa etária é: Adolescente");
        }
        else if (idade >= 20 && idade <= 30){
            System.out.println("Sua faixa etária é: Jovem");
        }
        else if (idade >= 31 && idade <= 60){
            System.out.println("Sua faixa etária é: Adulto");
        }
        else {
            System.out.println("Sua faixa etária é: Idoso");
        }
    }
}