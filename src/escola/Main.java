package escola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ativo1 = 1;
        Scanner ler = new Scanner(System.in);
        String nome;
        int cod, qtdeMax, matricula;
        double nota1, nota2;

        System.out.println("Digite o nome da Disciplina: ");
        nome = ler.next();
        System.out.println("Digite o codigo e o número maximo de alunos dessa disciplina:");
        cod = ler.nextInt();
        qtdeMax = ler.nextInt();
        Disciplina cadeira = new Disciplina(nome, cod, qtdeMax);
        while (ativo1 == 1) {
            int op;
            System.out.println("1. Matricular aluno");
            System.out.println("2. Atribuir notas");
            System.out.println("3. Alterar notas");
            System.out.println("4. Exibir estátistica");
            System.out.println("5. Fechar programa");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome do aluno e sua matricula:");
                    nome = ler.next();
                    matricula = ler.nextInt();
                    if (cadeira.matricular(nome, matricula)) {
                        System.out.println("Aluno matriculado com sucesso...\n");
                    } else {
                        System.out.println("Matricula não realizada, quantidade máxima atingida...\n");
                    }
                    break;
                case 2:
                    System.out.println("Digite o número de matricula do aluno que deseja selecionar:");
                    matricula = ler.nextInt();
                    Aluno a = cadeira.selecionarAluno(matricula);
                    System.out.println("Aluno " + a.getNome() + " selecionado\n");
                    System.out.println("Digite as duas notas desse aluno: ");
                    nota1 = ler.nextDouble();
                    nota2 = ler.nextDouble();
                    if (cadeira.atribuir_alterarNotas(a, nota1, nota2)) {
                        System.out.println("Notas atribuidas com sucesso...\n");
                    } else {
                        System.out.println("Aluno digitado não está cadastrado nessa disciplina...\n");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número de matricula do aluno que deseja alterar as notas:");
                    matricula = ler.nextInt();
                    Aluno b = cadeira.selecionarAluno(matricula);
                    System.out.println("Aluno " + b.getNome() + " selecionado\n");
                    System.out.println("Digite as duas notas desse aluno: ");
                    nota1 = ler.nextDouble();
                    nota2 = ler.nextDouble();
                    if (cadeira.atribuir_alterarNotas(b, nota1, nota2)) {
                        System.out.println("Notas alteradas com sucesso...\n");
                    } else {
                        System.out.println("Aluno digitado não está cadastrado nessa disciplina...\n");
                    }
                    break;
                case 4:
                    cadeira.gerarEstatiscica();
                    break;
                case 5:
                    System.out.println("Até a próxima...\n");
                    ativo1 = 0;
                    break;
                default:
                    System.out.println("Opção inválida...\n");
                    break;
            }
        }
        ler.close();
    }
}
