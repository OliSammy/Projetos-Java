package biblioteca;

public class Livro {
    String nomeLivro, nomeAutor;
    int idLivro, qtdeLivro;

    public Livro(String nome, String autor, int id, int qtde) {
        nomeLivro = nome;
        nomeAutor = autor;
        idLivro = id;
        qtdeLivro = qtde;
    }

    void mostrarDados() {
        System.out.println("Nome do livro :" + nomeLivro);
        System.out.println("Número de identificação: " + idLivro);
        System.out.println("Quantidade de livros disponiveis: " + qtdeLivro);
    }

    boolean emprestar(int qtde) {
        if (disponivel(qtde)) {
            qtdeLivro -= qtde;
            return true;
        }
        return false;
    }

    int devolver(int qtde) {
        return qtdeLivro += qtde;
    }

    boolean disponivel(int qtde) {
        if (qtde <= qtdeLivro) {
            return true;
        }
        return false;
    }
}
