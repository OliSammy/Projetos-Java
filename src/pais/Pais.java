package pais;

import java.util.ArrayList;

public class Pais {
    private String nome, capital;
    private int dimensao;

    private ArrayList<String> fronteira;

    public Pais(String nome, String capital, int dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.fronteira = new ArrayList<String>();
    }

    public boolean cadastrarFronteira(Pais outro) {
        if (equals(outro)) {
            if (!fazFronteira(outro)) {
                fronteira.add(outro.getNome());
                return true;
            }
        }
        return false;
    }

    public String exibirFronteiras() {
        String nomes = "";
        for (int i = 0; i < fronteira.size(); i++) {
            nomes += fronteira.get(i);
            if (i == fronteira.size() - 1) {
                nomes += ".";
            } else {
                nomes += ", ";
            }
        }

        return nomes;
    }

    public boolean fazFronteira(Pais outro) {
        for (int i = 0; i < fronteira.size(); i++) {
            if (fronteira.get(i) == outro.getNome()) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Pais outro) {
        if (this.nome != outro.getNome() && this.capital != outro.getCapital()) {
            return true;
        }
        return false;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public int getDimensao() {
        return this.dimensao;
    }
}