package main.br.com.Raphael.ExercicioAula10;

public class Aluno extends Pessoa {
   private String Matricula;

   public Aluno(String nome, int idade, String Matricula) {
       super(nome, idade);
       this.Matricula = Matricula;

   }
}
