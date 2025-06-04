public class Celula {
    private int linha;
    private int coluna;
    private int valor;
    private boolean fixo; // se a célula é fixa (não pode ser alterada)

    public Celula(int linha, int coluna, int valor, boolean fixo) {
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
        this.fixo = fixo;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public int getValor() {
        return valor;
    }

    public boolean isFixo() {
        return fixo;
    }

    public void setValor(int valor) {
        if (!fixo) {
            this.valor = valor;
        }
    }

    @Override
    public String toString() {
        return valor == 0 ? "." : String.valueOf(valor);
    }
}
