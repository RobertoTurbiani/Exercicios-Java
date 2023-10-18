import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }

    // List<String> = new ArrayList();

    public void adicionar(Contato c){
        contatos.add(c);
    }

    public void exibeContatos(){
        for(Contato c : contatos){
            System.out.println(c);
        }
    }

    @Override
    public String toString() {
        return String.format("""
                Nome do Grupo: %s
                Contatos do Grupo: %s
                """, nome, contatos);
    }
}
