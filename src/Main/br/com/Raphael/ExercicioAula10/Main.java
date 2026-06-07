package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Raphael", 33, "2026001");
        Professor professor = new Professor("Diego", 37, "POO");

        aluno.apresentar();
        professor.apresentar();
    }
}