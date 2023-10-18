package exercicio03;

public class Idade {
    void classificaIdade(Integer idade){
        if(idade >= 0 && idade <= 2){
            System.out.println("Sua faixa etária diz: Bebê");
        } else if (idade >= 3 && idade <= 11) {
            System.out.println("Sua faixa etária diz: Criança");
        } else if (idade >= 12 && idade <= 19) {
            System.out.println("Sua faixa etária diz: Adolescente");
        } else if (idade >= 20 && idade <= 30) {
            System.out.println("Sua faixa etária diz: Jovem");
        } else if (idade >= 31 && idade <= 60) {
            System.out.println("Sua faixa etária diz: Adulto");
        } else {
            System.out.println("Sua faixa etária diz: Idoso");
        }
    }

}
