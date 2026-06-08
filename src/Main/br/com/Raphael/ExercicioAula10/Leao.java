package main.br.com.Raphael.ExercicioAula10;

class Leao extends Animal {
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Roarrr!");
    }
}