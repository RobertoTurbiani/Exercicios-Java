public class Utilitaria {
    //Um método tem as seguintes partes:
    //Retorno: void (esse não possui retorno)
    //Nome: exibirLinha
    //Argumentos: esse não tem nenhum, sempre dentro dos ()
    //Corpo: fazer um print, sempre dentro das {}
    void exibirLinha(){
        System.out.println("*------*------*------*");
    }

    void exibirNome(String nome){
        System.out.println("Olá " + nome);
    }

    //Método sobrecarregado
    void exibirNome(String nome, String sobrenome){
        System.out.println(
                String.format(
                        "Olá %s %s",
                        nome, sobrenome));
    }

    //Podemos chamar um método dentro de outro método
    // sem criar objetos, se estivier na própria classe
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
    }


}
