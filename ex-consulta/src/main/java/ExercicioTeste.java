import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioTeste {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        // na interpolação %s é para String
        // na interpolação %d é para Interger
        // na interpolação %f é para Double
        // na interpolação %.1f o número após o ponto serve para mostrar quantas casas decimais tera o valor depois da virgula
        // As variaveis Boolean estão pegando o valor do Interger para mudar é so trocar a condição do if dela
        // para mais valores digitados basta colocar mais Scanners
        // nome projeto escrito com letra miniscula sepradas por -
        // nome de classe primeira letra de cada palavra maiúscula
        // Lista começa da posição 0 para pegar o primeiro valor usar get(0)
        // pegar último valor da lista é size -1




        // Validação de números impares

//        do {
//
//            Scanner leitor = new Scanner(System.in);
//
//            TesteValidacaoNumerica primo = new TesteValidacaoNumerica();
//
//            System.out.println("Digite um número positivo");
//            Integer valores = leitor.nextInt();
//
//            Integer divisores = 0;
//            for (int i = 1; i <= valores; i++) {
//                if(valores % i == 0){
//                    divisores++;
//                }
//            }
//            if(divisores == 2){
//                System.out.println(String.format("O número %d é primo!", valores));
//            }else {
//                System.out.println(String.format("O número %d não é primo!", valores));
//            }
//        }
//        while (true);

//        System.out.println("Digite um número");
//        Integer mensagemNumeroInteiro = leitor.nextInt();
//        System.out.println("Digite o segundo número");
//        Integer mensagemNumeroInteiro2 = leitor2.nextInt();

//        System.out.println("Escreva o primeiro texto");
//        String mensagemTexto = leitor.nextLine();
//        System.out.println(mensagemTexto + " mensagem digitada primeiro");
//        System.out.println("Escreva o segundo texto");
//        String mensagemTexto2 = leitor2.nextLine();
//        System.out.println(mensagemTexto2 + " mensagem digitada em segundo lugar");

//        System.out.println("Digite o primeiro valor decimal com . ou , depende da versão do java");
//        Double mensagemNumeroDecimal = leitor.nextDouble();
//        System.out.println(mensagemNumeroDecimal);
//
//        System.out.println("Digite o segundo valor decimal com . ou , depende da versão do java");
//        Double mensagemNumeroDecimal2 = leitor2.nextDouble();
//        System.out.println(mensagemNumeroDecimal2);
//
//        String msg = String.format("""
//                Eu recebo R$40.00 e tenho um gasto de %.2f
//                porem eu tenho um extra de %.2f
//
//
//                """, mensagemNumeroDecimal, mensagemNumeroDecimal2);
//
//        System.out.println(msg + " \n Esse sout está puxando a interpolação feita no texto acima" );
//

//        System.out.println("Digite o primeiro valor verificando sé é verdadeiro ou falso: true ou false");
//        Boolean verdadeiroOuFalso = true;
//        System.out.println("Digite o segundo valor verificando sé é verdadeiro ou falso true ou false");
//        Boolean verdadeiroOuFalso2 = false;

//        if (mensagemNumeroInteiro <= mensagemNumeroInteiro2) {
//            System.out.println("O valor digitado primeiro é menor do que o segundo");
//        } else {
//            System.out.println("O valor digitado primeiro é maior do que o segundo");
//
//        }
//
//        System.out.println("textos digitados");
//        System.out.println(mensagemTexto + " " + mensagemTexto2);



//        if ( mensagemNumeroInteiro.equals(10)){
//            verdadeiroOuFalso = false;
//
//            System.out.println(verdadeiroOuFalso + " se o número digitado for igual a 10 a condição do boolean muda pra false");
//        }
//
//        if (!mensagemNumeroInteiro.equals(10)){
//            verdadeiroOuFalso2 = true;
//
//            System.out.println(verdadeiroOuFalso2 + " se o número digitado for diferente de 10 a condição do segundo boolean muda pra true");
//        }

//        for (int i = 0; i <= 90; i++) {
//            if (i % 2 == 1) {
//                System.out.println("Pegando números pares");
//                System.out.println(i);
//            }
//
//            for (int j = 0; j <= 90 ; j++) {
//
//                if (j % 2 == 1) {
//                    System.out.println("Pegando números impares");
//                    System.out.println(j);
//                }
//
//            }
//
//        }

//        List<Integer> inteiros = new ArrayList<>();
//        Integer somaTotal = 0;
//
//        inteiros.add(43);
//        inteiros.add(16);
//        inteiros.add(21);
//        inteiros.add(2);
//
//        for (int i = 0; i < inteiros.size(); i++) {
//            somaTotal += inteiros.get(i);
//        }
//
//        System.out.println(inteiros);
//        System.out.println(somaTotal);

//        List<Integer> inteiros2 = new ArrayList<>();
//
//        inteiros2.add(43);
//        inteiros2.add(21);
//        inteiros2.add(16);
//        inteiros2.add(244);
//        inteiros2.add(221);
//        inteiros2.add(200);
//        inteiros2.add(1);
//        inteiros2.add(3);
//        inteiros2.add(41);
//
//        for (int i = 0; i < inteiros2.size(); i++) {
//            if(inteiros2.get(i) % 2 == 0){
//                inteiros2.remove(i);
//                i--;
//            }
//        }
////
//        System.out.println("Retirou os números pares 16 e 2");
//
//        System.out.println(inteiros2);
//
//        System.out.println(" pegou um valor da posição desejada " + inteiros2.get(1));
//        System.out.println(inteiros2.get(inteiros2.size() - 1) + "pegando oúltimo valor do vetor com o valor final 41");
    }
}
