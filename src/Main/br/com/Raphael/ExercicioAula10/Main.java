package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando Conta Corrente ---");
        Conta cc = new ContaCorrente();
        cc.depositar(100.00);
        cc.sacar(300.00);
        cc.sacar(400.00);

        System.out.println("\n--- Testando Conta Poupança ---");
        Conta poupanca = new ContaPoupanca();
        poupanca.depositar(100.00);
        poupanca.sacar(150.00);
        poupanca.sacar(50.00);
    }
}