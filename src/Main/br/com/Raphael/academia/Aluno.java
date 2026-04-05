package main.br.com.Raphael.academia;

public class Aluno {
    private String nome;
    private int idade;
    private String plano;


    public static int totalAlunos = 0;

    public Aluno(String nome, int idade, String plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
        totalAlunos++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}
