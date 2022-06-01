package escola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cod, qtdeMax, qtdeAtual = 0;
    private ArrayList<Aluno> matriculados;

    public Disciplina(String nome, int cod, int qtdeMax) {
        this.nome = nome;
        this.cod = cod;
        this.qtdeMax = qtdeMax;
        matriculados = new ArrayList<Aluno>();
    }

    public boolean matricular(String nome, int matricula) {
        if (possoAcicionar()) {
            matriculados.add(new Aluno(nome, matricula));
            return true;
        }
        return false;
    }

    public boolean atribuir_alterarNotas(Aluno aluno, double nota1, double nota2) {
        if (aluno != null) {
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);
            return true;
        }
        return false;
    }

    public Aluno selecionarAluno(int matricula) {
        for (int i = 0; i < matriculados.size(); i++) {
            if (matriculados.get(i).getMatricula() == matricula) {
                return matriculados.get(i);
            }
        }
        return null;
    }

    public void gerarEstatiscica() {
        Aluno maiorMedia = maiorMedia();
        System.out.println("\n\t\tEstatistica geral");
        System.out
                .println("\nAluno com a maior média : " + maiorMedia.getNome() + " Média: "
                        + maiorMedia.calcularMedia());
        System.out.println(calcularQtdePassaram() + " alunos passaram por média.");
        System.out.println(matriculados.size() - calcularQtdePassaram() + " não passaram por média.");
        System.out.println("Média geral da Turma: " + calcularMediaGeral() + "\n");

    }

    public Aluno maiorMedia() {
        double maiorMedia = matriculados.get(0).calcularMedia();
        int j = 0;
        for (int i = 0; i < matriculados.size(); i++) {
            if (maiorMedia < matriculados.get(i).calcularMedia()) {
                maiorMedia = matriculados.get(i).calcularMedia();
                j = i;
            }
        }
        return matriculados.get(j);
    }

    public int calcularQtdePassaram() {
        int calcularQtdePassaram = 0;
        for (int i = 0; i < matriculados.size(); i++) {
            if (matriculados.get(i).calcularMedia() >= 7.0) {
                calcularQtdePassaram++;
            }
        }
        return calcularQtdePassaram;
    }

    public double calcularMediaGeral() {
        double mediaGeral = 0;
        for (int i = 0; i < matriculados.size(); i++) {
            mediaGeral += matriculados.get(i).calcularMedia();
        }
        return mediaGeral / matriculados.size();
    }

    public boolean possoAcicionar() {
        if (qtdeAtual < qtdeMax) {
            qtdeAtual++;
            return true;
        }
        return false;
    }

    public void ordenarAlfabetica() {

    }

    public ArrayList<Aluno> getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(ArrayList<Aluno> matriculados) {
        this.matriculados = matriculados;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return this.cod;
    }
}
