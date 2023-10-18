public class WhatsApp {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Bob", "(11) 993432902");
        Contato contato02 = new Contato("José", "(11) 993774849");
        Contato contato03 = new Contato("Maria", "(11) 982133219");

        Grupo grupo01 = new Grupo("Trabalho");
        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        Grupo grupo02 = new Grupo("Amigos");
        grupo02.adicionar(contato03);
        grupo02.adicionar(contato01);

        System.out.println(grupo01);
        System.out.println(grupo02);

    }
}
