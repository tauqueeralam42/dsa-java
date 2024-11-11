public class Sudoku {

    public static boolean solveSudoku(int[][] sudoku, int i, int j){
        if(i == sudoku.length){
            printSudoku(sudoku);
            return true;
        }
        if(j == sudoku.length){
            return solveSudoku(sudoku, i+1, 0);
        }
        if(sudoku[i][j] != 0){
            return solveSudoku(sudoku, i, j+1);
        }
        for(int num = 1; num <= 9; num++){
            if(isSafe(sudoku, i, j, num)){
                sudoku[i][j] = num;
                if(solveSudoku(sudoku, i, j+1)){
                    return true;
                }
                sudoku[i][j] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] sudoku, int row, int col, int num){

        //vetical check
        for(int  i = 0; i < sudoku.length; i++){
            if(sudoku[i][col] == num){
                return false;
            }
        }

        //horizontal check
        for(int j = 0; j < sudoku.length; j++){
            if(sudoku[row][j] == num){
                return false;
            }
        }

        //3x3 grid check
        int startRow = row - row%3;
        int startCol = col - col%3;
        for(int i = startRow; i < startRow+3; i++){
            for(int j = startCol; j < startCol+3; j++){
                if(sudoku[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int[][] sudoku){
        for(int i = 0; i < sudoku.length; i++){
            for(int j = 0; j < sudoku.length; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        solveSudoku(sudoku,0,0);
    }
}
