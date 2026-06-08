package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void imprimirDocumento(Imprimivel doc) {
        doc.imprimir();
    }

    public static void main(String[] args) {
        Nota nota = new Nota(150.00);
        Relatorio relatorio = new Relatorio("Backup concluído com sucesso.");

        System.out.println("Chamando o método estático para a Nota:");
        imprimirDocumento(nota);

        System.out.println("\nChamando o método estático para o Relatório:");
        imprimirDocumento(relatorio);
    }
}