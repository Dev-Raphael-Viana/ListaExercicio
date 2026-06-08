package main.br.com.Raphael.ExercicioAula10;

class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public void emitirSom() {
        System.out.println(nome + " faz: ...");
    }
}
