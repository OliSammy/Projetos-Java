package loja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item a = new Item("Teclado", 1, 100.00);
        Item b = new Item("Mouse", 2, 50.00);
        Item c = new Item("Notebook", 3, 2000.00);
        Item d = new Item("Cadeira Gamer", 4, 500.00);
        Item e = new Item("Modem", 5, 80.00);

        Compra carrinho = new Compra();

        carrinho.inserirItem(a, 2);
        carrinho.inserirItem(b, 2);
        carrinho.inserirItem(c, 2);
        carrinho.inserirItem(d, 2);
        carrinho.inserirItem(e, 2);

        carrinho.calcularTotalCompra();
        System.out.println("Digite a forma de pagamento: ");
        Scanner ler = new Scanner(System.in);
        String op = ler.next();
        if (op.equalsIgnoreCase("Credito")) {
            carrinho.darDesconto(5);
            carrinho.calcularTotalFinal();
            System.out.println("Deseja pagar em quantas vezes?");
            int parcela = ler.nextInt();
            carrinho.gerarRelatorio(op, parcela);
        } else {
            carrinho.darDesconto(10);
            carrinho.calcularTotalFinal();
            carrinho.gerarRelatorio("Á vista", 0);
        }
        ler.close();
    }
}
