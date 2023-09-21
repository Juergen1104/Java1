package Michelle_1.Aufgabe_Sudoku;

public class Sudoku {
    /**
     * The 2-dimensional Sudoku-array.
     */
    static int[][] sudoku = {
            { 9, 8, 4, 2, 7, 6, 3, 1, 5 }, { 2, 5, 7, 1, 3, 8, 4, 9, 6 }, { 6, 1, 3, 9, 4, 5, 2, 7, 8 },
            { 4, 2, 9, 3, 6, 7, 8, 5, 1 }, { 5, 6, 1, 8, 2, 9, 7, 4, 3 }, { 3, 7, 8, 5, 1, 4, 6, 2, 9 },
            { 8, 3, 2, 7, 5, 1, 9, 6, 4 }, { 7, 4, 5, 6, 9, 3, 1, 8, 2 }, { 1, 9, 6, 4, 8, 2, 5, 3, 7 } };

    /**
     * The main method, invoking printArray() and testSolution().
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        printArray(sudoku);
        testSolution();
    }

    public static void testSolution() {

        boolean rowsOK=testRows(sudoku);
        boolean colsOK=testCols(sudoku);
        boolean squaresOK=testSquares(sudoku);

        if (rowsOK&&colsOK&&squaresOK){
            System.out.println("alles richtig");
        }else {
            System.out.println("Fehlerhaft");
        }
    }

    public static boolean testRows(int[][] sudoku) {

        boolean fehlerfrei = true;

        int[][] copySudoku = new int[sudoku.length][sudoku[0].length];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                copySudoku[i][j] = sudoku[i][j];
            }
            if (!check1To9(copySudoku[i])) {
                System.out.println("Fehler in Zeile " + i + 1);
                fehlerfrei = false;
            }
        }
        return fehlerfrei;
    }

    public static boolean testCols(int[][] sudoku) {
        boolean fehlerfrei = true;
        int[][] copySudoku = new int[sudoku.length][sudoku[0].length];
        int[] testrow = new int[sudoku.length];

        for (int j = 0; j < sudoku.length; j++) {
            for (int i = 0; i < sudoku[j].length; i++) {
                copySudoku[i][j] = sudoku[i][j];
                testrow[i] = sudoku[i][j];
            }
            if (!check1To9(testrow)) {
                fehlerfrei = false;
            }
        }
        return fehlerfrei;
    }

    public static boolean testSquares(int[][] sudoku) {
        boolean fehlerfrei = true;
        int[] testSquare = new int[9];
        int m = 0;

        for (int i = 0; i < 7; i = i + 3) {
            for (int j = 0; j < 7; j = j + 3) {

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++){
                        testSquare[m] = sudoku[i + k][j + l];
                        m++;
                    }
                }
                if (!check1To9(testSquare)) {
                    fehlerfrei = false;}
                m = 0;
            }
        }
        return fehlerfrei;
    }

    public static boolean check1To9(int[] zahlen) {
        int k = 0;
        for (int i = zahlen.length - 1; i > 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (zahlen[j] >= zahlen[i]) {
                    k = zahlen[i];
                    zahlen[i] = zahlen[j];
                    zahlen[j] = k;
                }
            }
        }
        for (int i = 0; i < zahlen.length - 2; i++) {
            if (zahlen[i] == zahlen[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[][] sudokuAll) {

        int i = 0;
        int abstand = 1;

        do {
            printrow(sudokuAll[i]);
            if (abstand == 3) {
                System.out.println(" ");
                abstand = 0;
            }
            i++;
            abstand++;
        } while (i < sudokuAll.length);
    }

    public static void printrow(int[] werte) {

        String row = "";
        int i = 0;
        int abstand = 1;

        do {
            row = row + werte[i] + " ";
            if (abstand == 3) {
                row = row + " ";
                abstand = 0;
            }
            i++;
            abstand++;
        } while (i < werte.length);
        System.out.println(row);
    }
}