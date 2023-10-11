package livraria;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();

        JdbcTemplate con = conexao.getConexaoDoBanco();

        Scanner in = new Scanner(System.in);
        Scanner inText = new Scanner(System.in);
        Livraria livroNovo = new Livraria();


        con.execute("DROP TABLE IF EXISTS livraria");

        con.execute("""
                    CREATE TABLE livraria(
                    id int primary key auto_increment,
                    nome VARCHAR(50),
                    preco int
                    )""");

        Integer opcao;

        do {
            System.out.println("""
                +-----------------------+
                | Livraria SPTECH       |
                +-----------------------+
                | 1-) Cadastrar Livro   |
                | 2-) Exibir livros     |
                | 3-) Atulizar livro    |
                | 4-) Remover livro     |
                | 5-) Buscar por nome   |
                | 6-) Sair              |
                +-----------------------+
                """);
            opcao = in.nextInt();

            switch (opcao){
                case 1 -> {

                    String adicionarNome;
                    Integer adicionarPreco;

                    System.out.println("Adicione o nome!!");
                    adicionarNome = inText.nextLine();

                    System.out.println("Adicione o preço!!");
                    adicionarPreco = in.nextInt();

                    livroNovo.setNome(adicionarNome);
                    livroNovo.setPreco(adicionarPreco);

                    con.update("INSERT INTO livraria (nome, preco) values (?, ?)",
                            livroNovo.getNome(), livroNovo.getPreco());
                }

                case 2 ->{

                    List<Livraria> exibirLivros = con.query("SELECT * FROM livraria",
                            new  BeanPropertyRowMapper<>(Livraria.class));

                    System.out.println(exibirLivros);
                }

                case 3 ->{

                    String atualizarNome;
                    Integer atualizarPreco;
                    Integer id;

                    System.out.println("Insira o novo nome");
                    atualizarNome = inText.nextLine();
                    System.out.println("Atualize o preço");
                    atualizarPreco = in.nextInt();
                    System.out.println("Atualize o id do Livro");
                    id = in.nextInt();

                    livroNovo.setNome(atualizarNome);
                    livroNovo.setPreco(atualizarPreco);
                    livroNovo.setId(id);
                    con.update("update livraria set nome = ?," + "preco = ? where id = ?",
                            livroNovo.getNome(),livroNovo.getPreco(), livroNovo.getId());

                }

                case 4 -> {
                    Integer idDeletado;
                    System.out.println("Digite o id do livro que deseja deletar");
                    idDeletado = in.nextInt();
                    livroNovo.setId(idDeletado);

                    con.update("DELETE FROM livraria WHERE id = ?",livroNovo.getId());

                }

                case 5 -> {

                    String nomePesquisado;
                    System.out.println("Digite o nome do que procura");
                    nomePesquisado = inText.nextLine();
                    livroNovo.setNome(nomePesquisado);

                    List<Livraria> exibirLivros = con.query("SELECT * FROM livraria where nome like ?",
                            new  BeanPropertyRowMapper<>(Livraria.class), "%%" + nomePesquisado + "%%");

                    System.out.println(exibirLivros);
                }

                case 6 -> {
                    System.out.println("Até mais");
                }

                default -> {
                    System.out.println("Opção inválida");
                }
            }

        } while (opcao != 6);
    }
}
