public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Passe os argumentos no formato: linha,coluna;valor;fixo ...");
            return;
        }

        Sudoku sudoku = new Sudoku();

        // Argumento exemplo (passado via linha de comando)
        // args[0] = "0,0;4,false 1,0;7,false 2,0;9,true ..."

        // Quebrar em células separadas por espaço
        String[] celulasStr = args[0].split(" ");

        for (String celulaStr : celulasStr) {
            // cada célula: "0,0;4,false"
            String[] partes = celulaStr.split(";");
            if (partes.length != 3) continue;

            String[] pos = partes[0].split(",");
            int linha = Integer.parseInt(pos[1]);   // Repare que o formato do argumento é "coluna,linha", ajustado para linha,coluna
            int coluna = Integer.parseInt(pos[0]);
            int valor = Integer.parseInt(partes[1]);
            boolean fixo = Boolean.parseBoolean(partes[2]);

            sudoku.setCelula(linha, coluna, valor, fixo);
        }

        sudoku.imprimirTabuleiro();
    }
}
