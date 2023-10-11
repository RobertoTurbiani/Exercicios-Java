public class TesteDescontoProgressivo {
    Double total;

    void calcularDesconto (Double valor,Double quantidade) {

       total = valor * quantidade;

        System.out.println(total);

        return;
    }


    void exibirNotaFiscal(Double valor, Double quantidade){

        String mensagem10 = String.format("""
                Bem vindo ao sistema de desconto progressivo!
                
                           
                Valor do produto: %.2f
                Quantidade: %.0f
                
                Valor com desconto: R$ %.2f
                """, valor,quantidade, total * 0.9);
        String mensagem20 = String.format("""
                Bem vindo ao sistema de desconto progressivo!
                
                - - - - - - - - - - - - - - - - - - - - - - -            
                Valor do produto: %.2f
                Quantidade: %.0f  
                - - - - - - - - - - - - - - - - - - - - - - -            

                Valor com desconto: R$ %.2f
                """, valor,quantidade, total * 0.8);

        String mensagem30 = String.format("""
                Bem vindo ao sistema de desconto progressivo!
                                 
                Valor do produto: %.2f
                Quantidade: %.0f
                
                Valor com desconto: R$ %.2f
                """, valor,quantidade, total * 0.7);

        if (quantidade.equals(1.0)){
            System.out.println((mensagem10));
        } else if (quantidade.equals(2.0)) {
            System.out.println(mensagem20);
        } else {
            System.out.println(mensagem30);
        }

    };

}