package loja;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Item> carrinho;
    private double valorAtual, desconto;

    public Compra() {
        carrinho = new ArrayList<Item>();
    }

    public void inserirItem(Item a, int qtde) {
        a.setQtde(qtde);
        carrinho.add(a);
    }

    public void calcularTotalCompra() {
        for (int i = 0; i < carrinho.size(); i++) {
            this.valorAtual += carrinho.get(i).calcularTotal();
        }
    }

    public void darDesconto(double porcentagem) {
        porcentagem = porcentagem * 0.01;
        desconto = this.valorAtual * porcentagem;
    }

    public double calcularTotalFinal() {
        return valorAtual - desconto;
    }

    public void gerarRelatorio(String modoPagamento, int parcela) {
        System.out.println("\t\t\t\tCupom Fiscal\n");
        System.out.println("\t\tItem\t\tQuantidade\n");
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println(carrinho.get(i).getNome() + "\t\t" + carrinho.get(i).getQtde());
        }
        System.out.println("Valor antes do desconto: " + this.valorAtual);
        System.out.println("Valor do desconto: " + this.desconto);
        System.out.println("Valor final da compra: " + calcularTotalFinal());
        System.out.println("Metodo de pagamento escolhido: " + modoPagamento);
        if (parcela != 0) {
            System.out.println("Parcelado em " + parcela + " vezes de R$" + calcularTotalFinal() / parcela);
        }
    }
}
