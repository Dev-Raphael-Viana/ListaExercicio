package main.br.com.Raphael.ExercicioAula9;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 15.90);

        System.out.println(p1);
        System.out.println(p2);
    }
}

//a) O nome da classe seguido pelo caractere @ e o código hash do objeto.
//main.br.com.Raphael.ExercicioAula9.Produto@8efb846
//main.br.com.Raphael.ExercicioAula9.Produto@8efb846

//b) Não é legivel, essa informação não diz nada sobre o estado do objeto, o nome ou o preço.
// Ela serve apenas para identificar a instância na memória.