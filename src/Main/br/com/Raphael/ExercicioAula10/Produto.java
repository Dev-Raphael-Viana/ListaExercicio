package main.br.com.Raphael.ExercicioAula10;

class Produto implements Tributavel {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return this.preco * 0.12;
    }
}