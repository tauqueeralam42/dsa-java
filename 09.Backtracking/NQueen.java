public class NQueen {

    public static void nQueen(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueen(board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {

        // vetical check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left diagonal check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right diagonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    public static void createBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
    }

    public static void main(String[] arg) {
        int n = 4;
        char board[][] = new char[n][n];
        createBoard(board);
        nQueen(board, 0);
    }
}
