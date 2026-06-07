package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Diego", 3000.00);
        Gerente g1 = new Gerente("Raphael", 7000.00);
        System.out.println("Bônus do Funcionário " + f1.nome + ": R$ " + f1.calcularBonus());
        System.out.println("Bônus da Gerente " + g1.nome + ": R$ " + g1.calcularBonus());
    }
}