package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Triatleta atleta = new Triatleta("Alison");
        Peixe peixe = new Peixe("Palhaço");

        System.out.println("--- Testando o Triatleta ---");
        atleta.nadar();
        atleta.correr();

        System.out.println("\n--- Testando o Peixe ---");
        peixe.nadar();
    }
}