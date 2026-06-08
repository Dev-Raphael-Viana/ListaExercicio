package main.br.com.Raphael.ExercicioAula10;

class Coruja extends Animal {
    public Coruja(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Pruuu!");
    }
}
