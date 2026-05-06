package main.br.com.Raphael.ExercicioAula9;

public class ValidadorSenha {
    public static void main(String[] args) {
        String senhaCorreta = new String("1234");
        String tentativa = "1234";
        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado"); // este roda!
        }
    }
}

//Acesso negado, porque tentativa era um literal (Pool) e senhaCorreta era um objeto (new).
// O '==' falhava na comparação de endereços.
//
//Com '.equals()', o Java ignora a origem da String e foca no valor "1234", validando o acesso corretamente.
/*
 * Qual o risco de usar == com Strings em sistemas reais?
 * O maior risco é a imprevisibilidade e bugs lógicos silenciosos.
 * Dados vindos de bancos de dados, formulários web ou arquivos externos
 * quase sempre são criados como novos objetos (fora do Pool).
 * Se você usar ==, o sistema dirá que os dados são diferentes mesmo que o
 * texto seja idêntico, causando falhas em logins ou validações críticas.
 */