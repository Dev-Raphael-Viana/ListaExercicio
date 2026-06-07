package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        int nota = 8;
        Integer notaObj = nota;

        System.out.println(nota);
        System.out.println(notaObj);
        System.out.println(notaObj.getClass().getSimpleName());
    }
}

//8
//8
//integer