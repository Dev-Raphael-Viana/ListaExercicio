package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook Gamer", 5000.00);
        Servico consultoria = new Servico("Consultoria em Java", 150.00, 10); // R$ 1500.00 total

        System.out.println("Imposto do Produto (" + notebook.nome + "): R$ " + notebook.calcularImposto());
        System.out.println("Imposto do Serviço (" + consultoria.descricao + "): R$ " + consultoria.calcularImposto());

        System.out.println("\n--- Tratando ambos de forma polimórfica ---");

        Tributavel[] itensTributaveis = { notebook, consultoria };
        double totalImpostos = 0;

        for (Tributavel item : itensTributaveis) {
            totalImpostos += item.calcularImposto();
        }
        System.out.println("Total de impostos a pagar ao governo: R$ " + totalImpostos);
    }
}