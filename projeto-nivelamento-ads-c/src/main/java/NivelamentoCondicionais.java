public class NivelamentoCondicionais {
    public static void main(String[] args) {
        //É igual no Java:
        // > maior
        // < menor
        // >=
        // <=
        // &&
        // ||
        // == (não usaremos), usaremos o .equals()
        Integer numero01 = 10;
        Integer numero02 = 42;

        if(numero01 > numero02){
            System.out.println("É maior!");
        } else if(numero01.equals(numero02)){
            System.out.println("É igual!");
        } else{
            System.out.println("É menor!");
        }

        String nome01 = "Xampson";
        String nome02 = "Xampson"; //Veio do banco de dados, ou foi digitado

        //SEMPRE usar .equals em String!!!
        if(nome01.equals(nome02)){
            System.out.println("Nome igual!");
        } else{
            System.out.println("Nome diferente!");
        }

        Boolean bloqueado = true;

        if(bloqueado){
            System.out.println("Bloqueado!");
        }else {
            System.out.println("Desbloqueado!");
        }
    }
}
