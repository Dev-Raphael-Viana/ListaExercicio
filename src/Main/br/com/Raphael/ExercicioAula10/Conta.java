package main.br.com.Raphael.ExercicioAula10;

abstract class Conta {
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
        }
    }
    public abstract void sacar(double valor);
}