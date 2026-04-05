package main.br.com.Raphael.locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.br.com.Raphael.locadora.Filme.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Filme> catalogo = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Locadora do Marcos ---");
            System.out.println("1. Cadastrar novo filme");
            System.out.println("2. Listar todos os filmes");
            System.out.println("3. Ver total de filmes no acervo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n-- Cadastrando Filme --");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int ano = scanner.nextInt();

                    Filme novoFilme = new Filme(titulo, genero, ano);
                    catalogo.add(novoFilme);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n=== FILMES DISPONÍVEIS ===");
                    if (catalogo.isEmpty()) {
                        System.out.println("O acervo está vazio no momento.");
                    } else {
                        for (Filme filme : catalogo) {
                            System.out.println(filme.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nResumo do Acervo:");
                    System.out.println("Total de filmes cadastrados: " + getTotalFilmesAcervo());
                    break;

                case 4:
                    System.out.println("\nSaindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
