package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\tBem-vindo à Biblioteca UECE");
        int ativo = 1;
        while (ativo == 1) {
            Scanner ler = new Scanner(System.in);
            int op;
            System.out.println("\nComo deseja acessa o sistema: \n1.Administrador 2.Fechar programa");

            op = ler.nextInt();

            // Seleção do tipo de sistema
            int ativo2 = 1;
            switch (op) {
                case 1:
                    System.out.println("\tSistema de Administrador selecionado...\n");
                    System.out.println("Quantas prateleiras você deseja adicionar à estante?");
                    op = ler.nextInt();
                    Estante estantes = new Estante(op);
                    while (ativo2 == 1) {
                        String tema;
                        int id, qtde;
                        System.out.println("\t\t\tMenu de prateleiras\n");
                        System.out.println(
                                "1. Cadastrar prateleira\n2. Mostrar prateleiras\n3. Selecionar prateleira\n4. Sair menu prateleira\n");
                        op = ler.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Digite o tema da prateleira");
                                tema = ler.next();
                                System.out.println("Digite um id para essa prateleira");
                                id = ler.nextInt();
                                System.out.println("Digite a quantidade máxima de livros dessa prateleira");
                                qtde = ler.nextInt();
                                if (estantes.adicionarPrateleira(tema, id, qtde)) {
                                    System.out.println("Prateleira adicionada com sucesso...");
                                } else {
                                    System.out.println("Número máximo de prateleiras atingido...");
                                }
                                break;
                            case 2:
                                if (estantes.qtdeAtual > 0) {
                                    estantes.mostrarPrateleiras();
                                } else {
                                    System.out.println("Nenhuma prateleria cadastrada...\n");
                                }
                                break;
                            case 3:
                                if (estantes.qtdeAtual == 0) {
                                    System.out.println("Nenhuma prateleira cadastrada...\n");
                                    break;
                                }
                                int ativo3 = 1;
                                System.out.println("Digite o id da prateleria que deseja selecionar:");
                                id = ler.nextInt();
                                Prateleira prateleria1 = estantes.procurarPrateleira(id);
                                if (prateleria1 == null) {
                                    System.out.println("Prateleira não encontrada...\n");
                                    break;
                                }
                                System.out.println("Prateleira de " + prateleria1.temaPrateleira + " selecionada\n");
                                while (ativo3 == 1) {
                                    String nome, autor;
                                    System.out.println("\t\t\t\tMenu de Livros\n");
                                    System.out.println("1. Cadastrar livro");
                                    System.out.println("4. Sair do menu Livros");
                                    op = ler.nextInt();
                                    switch (op) {
                                        case 1:
                                            System.out.println("Digite o nome do livro:");
                                            nome = ler.next();
                                            System.out.println("Digite o nome do autor:");
                                            autor = ler.next();
                                            System.out.println("Digite a id do livro:");
                                            id = ler.nextInt();
                                            System.out.println("Digite a quantidade total desse livro:");
                                            qtde = ler.nextInt();
                                            if (prateleria1.adicionarLivro(nome, autor, id, qtde)) {
                                                System.out.println("livro cadastrado com sucesso...\n");
                                            } else {
                                                System.out.println(
                                                        "Quantidade máxima de livros dessa prateleira atingido...\n");
                                            }
                                            break;

                                        case 4:
                                            System.out.println("Saindo do menu Livros");
                                            ativo3 = 0;
                                            break;

                                        default:
                                            System.out.println("Opção inválida");
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do menu prateleiras");
                                ativo2 = 0;
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nObrigado e até a próxima");
                    ativo = 0;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            ler.close();
        }
    }
}
