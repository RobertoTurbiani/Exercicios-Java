public class Exercicio02 {
    public static void main(String[] args) {
        Integer minutosAquecimento = 5;
        Integer minutosAerobico = 20;
        Integer minutosMusculacao = 40;

        Integer caloriasAquecimento = 12;
        Integer caloriasAerobico = 20;
        Integer caloriasMusculacao = 25;

        Integer resultadoMinuto = minutosAquecimento + minutosAerobico + minutosMusculacao;
        Integer resultadoCalorias = (caloriasAquecimento * minutosAquecimento) + (caloriasAerobico * minutosAerobico) + (caloriasMusculacao * caloriasMusculacao);

        System.out.println("Olá, Jorge. Você fez um total de " + resultadoMinuto + " minutos de exercícios e perdeu cerca de " + resultadoCalorias + " calorias");
    }
}
