public class queen_1_sol {

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical up check
        for (int i = row - 1; i >= 0; i--) {  // Fix: i >= 0 instead of i > 0
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal left check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right check 
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true; // Fix: Added return true to indicate safe placement
    }

    public static boolean nQueen(char board[][], int row) {
        // Base case
        if (row == board.length) {
            count++;  // Fix: Increment count for each valid solution
            return true;
        }
        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueen(board, row + 1)){
                    return true;
                }
                board[row][j] = '.';  // Fix: Backtrack correctly by resetting to '.'
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----chess Board----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");  // Added space for better visibility
            }
            System.out.println();
        }
        System.out.println();
    }

    static int count = 0;  // Fix: Added count variable to keep track of number of solutions

    public static void main(String[] args) {
        int n = 5; // No solution for n=2; consider using n=4 for valid solutions
        char board[][] = new char[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        if(nQueen(board, 0)){
            System.out.println("Solution found");
            printBoard(board);
        }else{
            System.out.println("No solution found");
        }
        //System.out.println("Number of solutions: " + count);  // Fix: Print number of solutions
    }
}

