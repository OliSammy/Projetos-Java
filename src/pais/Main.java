package pais;

public class Main {
    public static void main(String[] args) {
        Pais a, b, c, d, e;
        a = new Pais("Brasil", "Brasilia", 10);
        b = new Pais("Argentina", "Buenos Aires", 5);
        c = new Pais("Italia", "Roma", 3);
        d = new Pais("Alemanha", "Berlim", 4);
        e = new Pais("Portugal", "Lisboa", 5);

        e.cadastrarFronteira(d);
        e.cadastrarFronteira(a);
        e.cadastrarFronteira(b);
        e.cadastrarFronteira(c);

        System.out.println("Verificando se o Pais passado é ele mesmo.");
        if (e.cadastrarFronteira(e)) {
            System.out.println("Cadastrado.");
        } else {
            System.out.println("Não cadastrado.");
        }
        System.out.println("\nVerificando se Portugal faz Fronteira com a Alemanha:\n");
        System.out.println(e.fazFronteira(d));
        System.out.println(e.exibirFronteiras());
    }
}
