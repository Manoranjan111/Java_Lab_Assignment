
public class sudokuSolver {

    public static boolean isSafe(int[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number)
                return false;
            if (board[i][col] == number)
                return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == number) {
                return false; 
            }
        }
        return true;
    }

    public static boolean solver(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    for (int val = 1; val <= board.length; val++) {
                        if (isSafe(board, i, j, val)) {
                            board[i][j] = val;
                            boolean solutionPossible = solver(board);
                            if (solutionPossible)
                                return true;
                            else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }

    public static void print(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        print(board);
        System.out.println();
        System.out.println();
        solver(board);
        print(board);

    }
}