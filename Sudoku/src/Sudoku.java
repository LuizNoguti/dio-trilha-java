public class Sudoku {
    private Celula[][] tabuleiro;

    public Sudoku() {
        tabuleiro = new Celula[9][9];
        // Inicializa com células vazias (valor 0 e fixo = false)
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tabuleiro[i][j] = new Celula(i, j, 0, false);
            }
        }
    }

    public void setCelula(int linha, int coluna, int valor, boolean fixo) {
        tabuleiro[linha][coluna] = new Celula(linha, coluna, valor, fixo);
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("+-------+-------+-------+");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }
}
