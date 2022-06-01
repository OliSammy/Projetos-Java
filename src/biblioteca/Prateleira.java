package biblioteca;

public class Prateleira {
    int idPrateleira, qtdeTotal, qtdeAtual = 0;
    Livro livros[];
    String temaPrateleira;

    public Prateleira(String tema, int id, int qtde) {
        temaPrateleira = tema;
        idPrateleira = id;
        qtdeTotal = qtde;
        livros = new Livro[qtdeTotal];
    }

    boolean adicionarLivro(String nome, String autor, int id, int qtde) {
        if (possoAdicionar()) {
            livros[qtdeAtual] = new Livro(nome, autor, id, qtde);
            qtdeAtual++;
            return true;
        }
        return false;
    }

    Livro procuraLivro(int id) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].idLivro == id) {
                return livros[i];
            }
        }
        return null;
    }

    boolean possoAdicionar() {
        if (qtdeAtual < qtdeTotal) {
            return true;
        }
        return false;
    }

    void mostrarDadosPrateleira() {
        System.out.println("Tema da Prateleira: " + temaPrateleira);
        System.out.println("ID da prateleira: " + idPrateleira);
        System.out.println("Total de livros atualmente: " + qtdeAtual);
        System.out.println();
    }

}
