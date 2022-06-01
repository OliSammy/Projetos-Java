package biblioteca;

public class Estante {
    Prateleira vetor[];
    int qtdeAtual = 0, qtdeTotal;

    public Estante(int qtde) {
        qtdeTotal = qtde;
        vetor = new Prateleira[qtde];
    }

    boolean adicionarPrateleira(String tema, int id, int qtde) {
        if (possoAdicionar()) {
            vetor[qtdeAtual] = new Prateleira(tema, id, qtde);
            qtdeAtual++;
            return true;
        }
        return false;
    }

    Prateleira procurarPrateleira(int id) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].idPrateleira == id) {
                return vetor[i];
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

    void mostrarPrateleiras() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i].mostrarDadosPrateleira();
        }
    }
}
