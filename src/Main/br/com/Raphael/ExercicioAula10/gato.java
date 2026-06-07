package main.br.com.Raphael.ExercicioAula10;

class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + "Miau!");
    }
}
