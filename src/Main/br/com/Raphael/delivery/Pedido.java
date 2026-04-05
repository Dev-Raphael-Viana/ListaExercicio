package main.br.com.Raphael.delivery;

public class Pedido {


    private static int totalPedidos = 0;
    private static double valorTotalVendido = 0.0;

    private String nomeCliente;
    private Marmita marmitaEscolhida;

    public Pedido(String nomeCliente, Marmita marmitaEscolhida) {
        this.nomeCliente = nomeCliente;
        this.marmitaEscolhida = marmitaEscolhida;
        totalPedidos++;
        valorTotalVendido = valorTotalVendido + marmitaEscolhida.getPreco();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Marmita getMarmitaEscolhida() {
        return marmitaEscolhida;
    }

    public static int getTotalPedidos() {
        return totalPedidos;
    }

    public static double getValorTotalVendido() {
        return valorTotalVendido;
    }

    public String toString() {
        return "Cliente: " + nomeCliente + " | " + marmitaEscolhida.toString();
    }
}
