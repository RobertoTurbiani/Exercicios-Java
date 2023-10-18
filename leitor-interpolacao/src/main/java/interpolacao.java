import java.util.Scanner;

public class interpolacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        Integer idade;
        Double altura;
        Boolean terIphone = false;

        String tenhoIphone = "sim";
        if (!terIphone){
            tenhoIphone = "não";
        }

        System.out.println("Digite seu nome: ");
        nome = in.nextLine();

        System.out.println("Digite sua idade");
        idade = in.nextInt();

        System.out.println("Digite sua altura");
        altura = in.nextDouble();

        System.out.println("Você tem iphone\nS/N");
        String resposta = in.nextLine();

        String formatacao = resposta.equals("S")? "Sim" : "Não";

        if (resposta.equals("S")){
            formatacao = "Sim";
        } else {
            formatacao = "não";
        }

        String mensagem = String.format("Meu nome é %s \n tenho anos de vida %d \n tenho %.2f de altura",  nome, idade,altura);

        String mensagem2 = String.format("""
                Meu nome é %s 
                tenho anos de vida %d 
                tenho %.2f de altura
                tenho %%49 de bateria de celular
                tenho iphone %b
                """, nome, idade, altura, formatacao);

        System.out.println(mensagem2);

        // %s == string
        // %d == numero
        // %.2f == float
    }
}