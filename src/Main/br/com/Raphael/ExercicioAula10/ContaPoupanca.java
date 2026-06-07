package main.br.com.Raphael.ExercicioAula10;

class ContaPoupanca extends Conta {

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("[Poupança] Saque de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
        } else {
            System.out.println("[Poupança] Saque negado! Saldo insuficiente.");
        }
    }
}