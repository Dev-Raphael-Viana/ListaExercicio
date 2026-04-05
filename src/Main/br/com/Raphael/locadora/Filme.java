package main.br.com.Raphael.locadora;

public class Filme {

    private static final int AnoMinimo = 1895;
    private static final int AnoMaximo = 2026;

    private static int totalFilmesAcervo = 0;

    private String titulo;
    private String genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        setAnoLancamento(anoLancamento);
        totalFilmesAcervo++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento < AnoMinimo || anoLancamento > AnoMaximo) {
            System.out.println("⚠️ Erro: O ano deve estar entre " + AnoMinimo + " e " + AnoMaximo + ". Ano não atualizado.");
        } else {
            this.anoLancamento = anoLancamento;
        }
    }
    public String classificarÉpoca() {
        if (this.anoLancamento < 2000) {
            return "Clássico";
        } else {
            return "Recente";
        }
    }
    public static int getTotalFilmesAcervo() {
        return totalFilmesAcervo;
    }
    public String toString() {
        return "Título: " + titulo + " | Gênero: " + genero + " | Ano: " + anoLancamento + " (" + classificarÉpoca() + ")";
    }
}
