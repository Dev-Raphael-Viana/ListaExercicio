package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Integer x = null;
        int y = x;

        System.out.println(y);
    }
}

//NullPointerException. O Java tenta fazer unboxing (converter Integer para int), mas o valor e null.
//Primitivo não aceita null.