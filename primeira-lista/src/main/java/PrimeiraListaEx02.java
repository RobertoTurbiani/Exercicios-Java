public class PrimeiraListaEx02 {
    public static void main(String[] args) {

    Integer aquecimento = 5;
    Integer aerobicos = 20;
    Integer musculacao = 30;

    Integer tempo = aquecimento + aerobicos + musculacao;
    Integer calorias = (aquecimento * 12) + (aerobicos * 20) + (musculacao * 25);

        System.out.println("Olá, Jorge. Você fez um total de " +  tempo + " minutos de exercícios e" +
                " perdeu cerca de\n" +
                calorias + " calorias");

    }
}
