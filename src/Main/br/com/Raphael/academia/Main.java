package main.br.com.Raphael.academia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int LimiteVagas = 50;

    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao Sistema da Academia da Fernanda!");

        List<Aluno> listaAlunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean controle = true;

        do {
            System.out.println("\nEscolha uma opção do Menu:");
            System.out.println("1 - Matricular novo aluno");
            System.out.println("2 - Listar todos os alunos");
            System.out.println("3 - Consultar total de matrículas");
            System.out.println("4 - Encerrar o programa");

            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    cadastrarAluno(listaAlunos, sc);
                    break;
                case 2:
                    listarAlunos(listaAlunos);
                    break;
                case 3:
                    consultarTotal();
                    break;
                case 4:
                    controle = false;
                    System.out.println("Encerrando o sistema da academia...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (controle);

        sc.close();
    }

    private static void cadastrarAluno(List<Aluno> listaAlunos, Scanner sc) {

        if (Aluno.totalAlunos >= LimiteVagas) {
            System.out.println("\nMATRÍCULAS ENCERRADAS! A academia atingiu o limite de " + LimiteVagas + " alunos.");
            return;
        }

        System.out.println("\nNome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine();

        if (idade < 14) {
            System.out.println("\nCadastro negado! A idade mínima para treinar é 14 anos.");
            return;
        }

        System.out.println("Plano (Mensal / Anual): ");
        String plano = sc.nextLine();

        Aluno novoAluno = new Aluno(nome, idade, plano);
        listaAlunos.add(novoAluno);

        System.out.println("" + nome + " foi matriculado(a) com sucesso!");
    }

    private static void listarAlunos(List<Aluno> listaAlunos) {
        System.out.println("\n=========== ALUNOS MATRICULADOS ===========");
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado ainda.");
        } else {
            for (Aluno a : listaAlunos) {
                System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade() + " | Plano: " + a.getPlano());
            }
        }
        System.out.println("===========================================");
    }

    private static void consultarTotal() {
        System.out.println("\n=========== DADOS DA ACADEMIA ===========");
        System.out.println("Total de Alunos: " + Aluno.totalAlunos);
        System.out.println("Vagas Restantes: " + (LimiteVagas - Aluno.totalAlunos));
        System.out.println("Capacidade Máxima: " + LimiteVagas);
        System.out.println("=========================================");
    }
}