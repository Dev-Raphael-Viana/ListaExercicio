package main.br.com.Raphael.ExercicioAula10;

class ContaCorrente extends Conta {
    double limite = 500.00;

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            this.saldo -= valor;
            System.out.println("[CC] Saque de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
        } else {
            System.out.println("[CC] Saque negado! Valor excede o limite disponível.");
        }
    }
}