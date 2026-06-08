package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Imprimivel notaFiscal = new Nota(350.90);
        Imprimivel relatorioMensal = new Relatorio("Uso de CPU está em 45%. Tudo estável.");

        notaFiscal.imprimir();
        System.out.println();
        relatorioMensal.imprimir();
    }
}