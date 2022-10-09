package Michelle.Aufgabe_Sudoku;

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
     * @param args Unused.
     */
    public static void main(String[] args) {
        printArray(sudoku[1]);
        testSolution();
    }

    public static void testSolution() {

    }

    public static void printArray(int [] werte)  {

        String row="";
        int i=0;

        do{

            row = row + werte[i];

            i++;


        } while (werte.length<i);

    }

}