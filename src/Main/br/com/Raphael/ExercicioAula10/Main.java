package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
       Integer a = 127;
       Integer b = 127;
       System.out.println(a == b);

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}

/*
 * O Java possui o "Integer Cache". Para economizar memória, ele reaproveita
 * os mesmos objetos Integer para números de -128 até 127.
 * * Com 127: 'a' e 'b' apontam para o MESMO objeto no cache (por isso == dá true).
 * * Com 200: Está fora do limite do cache. O Java cria dois objetos DIFERENTES
 * na memória por isso == dá false, mas .equals() dá true pelo conteúdo.
 */