package main.br.com.Raphael.estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    public static final int VagasMaxima = 20;

    private List<Veiculo> veiculosEstacionados;

    public Estacionamento() {
        this.veiculosEstacionados = new ArrayList<>();
    }

    public void registrarEntrada(Veiculo veiculo) {
        if (veiculosEstacionados.size() >= VagasMaxima) {
            System.out.println("ESTACIONAMENTO LOTADO! Não há vagas para o " + veiculo.getModelo());
        } else {
            veiculosEstacionados.add(veiculo);
            System.out.println("Entrada registrada: " + veiculo.getModelo() + " (Placa: " + veiculo.getPlaca() + ")");
        }
    }

    public void registrarSaida(String placaProcurada) {
        Veiculo RemoverVeiculo = null;

        for (Veiculo v : veiculosEstacionados) {
            if (v.getPlaca().equalsIgnoreCase(placaProcurada)) { // equalsIgnoreCase significa literalmente "igual, ignorando maiúsculas/minúsculas
                RemoverVeiculo = v;
                break;
            }
        }

        if (RemoverVeiculo != null) {
            veiculosEstacionados.remove(RemoverVeiculo);
            System.out.println("Saída registrada: " + RemoverVeiculo.getModelo() + " liberou a vaga.");
        } else {
            System.out.println("Erro: Veículo com placa " + placaProcurada + " não encontrado no estacionamento.");
        }
    }

    public void exibirStatus() {
        int ocupadas = veiculosEstacionados.size();
        int livres = VagasMaxima - ocupadas;

        System.out.println("\n--- STATUS DO ESTACIONAMENTO ---");
        System.out.println("Vagas Ocupadas: " + ocupadas);
        System.out.println("Vagas Livres: " + livres);
        System.out.println("Capacidade Total: " + VagasMaxima);

        if (ocupadas > 0) {
            System.out.println("\nCarros no pátio:");
            for (Veiculo v : veiculosEstacionados) {
                System.out.println("- " + v.getModelo() + " [" + v.getPlaca() + "]");
            }
        }
        System.out.println("----------------------------------\n");
    }
}