import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class TesteLivraria {
    public static void main(String[] args) {

    Conexao conexao = new Conexao();
    JdbcTemplate con = conexao.getConexaoDoBanco();
    Scanner in = new Scanner(System.in);
    Scanner inText = new Scanner(System.in);

    Livraria livroNovo = new Livraria();

        con.execute("DROP TABLE IF EXISTS livraria");

        con.execute("""
                CREATE TABLE livraria (
                id int primary key auto_increment,
                nome VARCHAR(50),
                preco int
                )""");

    Integer opcao;

    do{

        System.out.println("""
            +--------------------------+
            | Livraria SPTECH          |
            +--------------------------+
            | 1) Cadastrar Livro       |
            | 2) Exibir Livros         |
            | 3) Atualizar Livro       |
            | 4) Remover Livro         |
            | 5) Buscar por nome       |
            | 6) Sair                  |
            +--------------------------+
            """);

        opcao = in.nextInt();

        switch (opcao){
            case 1 -> {
                String addNome;
                Integer addPreco;

                System.out.println("Qual livro você deseja cadastrar?");
                addNome = inText.nextLine();

                System.out.println("Qual o preço do livro?");
                addPreco = in.nextInt();


                livroNovo.setNome(addNome);
                livroNovo.setPreco(addPreco);

                con.update("INSERT INTO livraria (nome, preco) values (?, ?)",
                        livroNovo.getNome(), livroNovo.getPreco());

            }
            case 2 -> {
                List<Livraria> exibirLivros = con.query("SELECT * FROM livraria",
                        new BeanPropertyRowMapper<>(Livraria.class));

                System.out.println(exibirLivros);
            }
            case 3 -> {
                String attNome;
                Integer attPreco;
                Integer idInformado;

                System.out.println("Insira o novo nome");
                attNome = inText.nextLine();
                System.out.println("Insira o novo preço");
                attPreco = in.nextInt();
                System.out.println("Insira o id do livro");
                idInformado = in.nextInt();

                livroNovo.setNome(attNome);
                livroNovo.setPreco(attPreco);
                livroNovo.setId(idInformado);

                con.update("update livraria set nome = ?," +
                        "preco = ? where id = ?",
                        livroNovo.getNome(), livroNovo.getPreco(), livroNovo.getId());
            }
            case 4 -> {
                Integer idInformado;
                System.out.println("Insira o id do livro para deletá-lo");
                idInformado = in.nextInt();

                livroNovo.setId(idInformado);

                con.update("delete from livraria where id = ?", livroNovo.getId());
            }
            case 5 -> {
                String nomeInformado;
                System.out.println("Insira o nome do filme");

                nomeInformado = inText.nextLine();

                livroNovo.setNome(nomeInformado);

                List<Livraria> exibirLivro = con.query("Select * from livraria where nome like ?",
                        new BeanPropertyRowMapper<>(Livraria.class),  "%%" + nomeInformado + "%%");

                System.out.println(exibirLivro);
            }
            case 6 -> {
                System.out.println("Cabô");
            }
            default -> {
                System.out.println("Opção inválida");
            }
        }

    }while(opcao != 6);

    }
}
