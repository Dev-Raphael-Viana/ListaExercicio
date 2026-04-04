package Main.br.com.Raphael.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro("Fiat", "Uno", 1600);
        Carro meuCarro2 = new Carro("Honda", "HRV", 2025);
        Carro meuCarro3 = new Carro("BMW", "320i", 2026);
        Carro meuCarro4 = new Carro();
        Carro meuCarro5 = new Carro("Toyota", "Corolla", 2023);

        ArrayList<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(meuCarro1);
        listaCarros.add(meuCarro2);
        listaCarros.add(meuCarro3);
        listaCarros.add(meuCarro4);
        listaCarros.add(meuCarro5);

        System.out.println("--- Imprimindo a lista com for-each ---");
        for (Carro carroDaVez : listaCarros) {
            carroDaVez.exibir();
        }
        System.out.println("\n--- Total de Carros na Fábrica ---");
        Carro.imprimirTotal();

        System.out.println("\n--- Exercício 10: Escopo de Variável ---");

        //RESPOSTA DO EXERCÍCIO 10
        // a) Da erro de compilação.
        // b) Corrigindo o código: declaramos a variável FORA do if!

        int x;
        if (true) {
            x = 10; // Aqui dentro, apenas atribui o valor
        }
        System.out.println(x);

        /* c):
         * C1 - O que é escopo? Escopo é a região do código onde uma variável "vive" e pode ser acessada.
         * No Java, o escopo é definido pelas chaves { }.
         * C2 - Por que a variável 'x' não existia fora do if? Porque no código original,
         * a variável foi criada (declarada com 'int') DENTRO do bloco do if. Assim que
         * o bloco if terminou (na chave de fechamento '}'), a variável 'x' "morreu"
         * (foi destruída da memória). Para ela existir fora, ela precisa nascer fora!
         */

        System.out.println("\n--- Exercício 11: Referência vs Valor ---");
        int a = 10;
        int b = a;
        b = 99;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
         * RESPOSTA DO EXERCÍCIO 11:
         * a) Qual o valor após a execução? O console vai imprimir: a = 10 e b = 99.
         * b) Alterar 'b' mudou 'a'? Por quê? Não, não mudou,isso acontece porque 'int' é um tipo PRIMITIVO.
         * Na memória do Java, variáveis primitivas guardam o valor diretamente (como gavetas separadas).
         * Quando fiz 'b = a', o Java tirou um "xerox" do valor de 'a' (10) e guardou na
         * gaveta do 'b'. A partir desse momento, eles não têm mais nenhuma ligação.
         * Mudar a gaveta do 'b' para 99 não afeta a gaveta do 'a'.
         */
    }
}
