public class sudoku{
    public static boolean sudokuSolver(int sudoku[][], int row ,int col ){
        // base case
        // recursion 
        int nextRow = row , nextCol =col+1;
        if(col+1 ==9){
            nextRow = row+1;
            nextCol = 0;
        }
        for(int digit =1; digit<=9; digit++){
            if(isSafe(sudoku , row,col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){ //soln exists
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
    }
    
}