package main.br.com.Raphael.ExercicioAula10;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal preco = new BigDecimal("49.90");
        BigDecimal qtd = new BigDecimal("3");
        BigDecimal desconto = new BigDecimal("0.95");
        BigDecimal total = preco.multiply(qtd).multiply(desconto);
        System.out.println("Total: R$ " + total);
    }
}

// R$ 142.215