package main.br.com.Raphael.ExercicioAula10;

class Triatleta implements Nadador, Corredor {
    String nome;

    public Triatleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando em mar aberto...");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo na pista de atletismo...");
    }
}