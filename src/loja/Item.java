package loja;

public class Item {
    private String nome;
    private int idItem;
    private double valorItem;
    private int qtde;

    protected Item(String nome, int idItem, double valorItem) {
        this.nome = nome;
        this.idItem = idItem;
        this.valorItem = valorItem;
    }

    public double calcularTotal() {
        return this.valorItem * this.qtde;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setId(int idItem) {
        this.idItem = idItem;
    }

    public int getId() {
        return this.idItem;
    }

    public void setValor(double valorItem) {
        this.valorItem = valorItem;
    }

    public double getValor() {
        return valorItem;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public int getQtde() {
        return qtde;
    }
}
