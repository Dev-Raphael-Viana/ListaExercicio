package main.br.com.Raphael.ExercicioAula10;

class Relatorio implements Imprimivel {
    String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("--- RELATÓRIO DO SISTEMA ---");
        System.out.println("Log: " + this.conteudo);
    }
}