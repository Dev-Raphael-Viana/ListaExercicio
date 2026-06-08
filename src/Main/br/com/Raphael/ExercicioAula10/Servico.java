package main.br.com.Raphael.ExercicioAula10;

class Servico implements Tributavel {
    String descricao;
    double valorHora;
    int horasTrabalhadas;

    public Servico(String descricao, double valorHora, int horasTrabalhadas) {
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorTotal() {
        return this.valorHora * this.horasTrabalhadas;
    }

    @Override
    public double calcularImposto() {
        return this.getValorTotal() * 0.06;
    }
}