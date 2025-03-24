public class queen {

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

    public static void nQueen(char board[][], int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1);  // Function call for next row
                board[row][j] = '.';  // Fix: Backtrack correctly by resetting to '.'
            }
        }
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

     

    public static void main(String[] args) {
        int n = 5; // No solution for n=2; consider using n=4 for valid solutions
        char board[][] = new char[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        nQueen(board, 0);
    }
}
