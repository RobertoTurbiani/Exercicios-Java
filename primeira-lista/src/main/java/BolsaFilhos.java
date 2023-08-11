public class BolsaFilhos {
    public static void main(String[] args) {

        Integer qtdFilhos01 = 3;
        Integer qtdFilhos02 = 2;
        Integer qtdFilhos03 = 1;

        Double menorDeQuatroAnos = 25.12;
        Double menorDeDezesseisAnos = 15.88;
        Double menorDeDezoitoAnos = 12.44;

        Double resultado01 = menorDeQuatroAnos * qtdFilhos01;
        Double resultado02 = menorDeDezesseisAnos * qtdFilhos02;
        Double resultado03 = menorDeDezoitoAnos * qtdFilhos03;

        Integer filhos = qtdFilhos01 + qtdFilhos02 + qtdFilhos03;

        Double total =  resultado01 + resultado02 + resultado03;


        System.out.println("Você tem um total de  " + filhos + " filhos e vai receber " + total + " de bolsa" );

    }
}
