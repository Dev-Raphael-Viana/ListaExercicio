package Main.br.com.Raphael.lanchonete;

public class Pedidos {
    static int NUMERO_PEDIDOS = 0;
    private Lanche lanche;

    public Pedidos() {
        NUMERO_PEDIDOS++;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }
}
