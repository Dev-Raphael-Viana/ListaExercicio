package main.br.com.Raphael.ExercicioAula10;

public class Pessoa {
   private String nome;
   private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void apresentar(){
        System.out.println("Meu nome é: " + nome + " tenho " + idade + " Anos" );
    }
    public String getNome() {
        return nome;
    }
}
