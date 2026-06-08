package main.br.com.Raphael.ExercicioAula10;

class Nota implements Imprimivel {
    double valor;

    public Nota(double valor) {
        this.valor = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("=== NOTA FISCAL ===");
        System.out.println("Valor: R$ " + this.valor);
    }
}