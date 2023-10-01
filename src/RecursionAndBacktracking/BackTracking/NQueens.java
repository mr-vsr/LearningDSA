package RecursionAndBacktracking.BackTracking;

public class NQueens {
    static int queens(boolean[][] board, int rows) {

        if(rows== board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for(int col = 0;col< board.length;col++){

            //checking if it is safe to place the queen on that position
            if(isSafe(board,rows,col)){
                board[rows][col] = true;   //if it is safe we are placing a queen there
                count += queens(board,rows+1); //checking if this gives a feasible solution or not
                board[rows][col] = false; // backtracking to the previous positions to check for other possible solutions
            }
        }
        return count;  // returning the possible number of solutions
    }

    //Printing the board with the positions of the queen on the board shown by Q
    private static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean col : row) {
                if (col) {
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board,int rows,int columns) {
        //Checking vertical up in the column
        for(int i=0; i< rows;i++){
            if(board[i][columns]){
                return false;
            }
        }
        //Checking for the left diagonal
        int maxLeft = Math.min(rows,columns);
        for(int i=1;i<=maxLeft;i++){
            if(board[rows-i][columns-i]){
                return false;
            }
        }

        //Checking for the right diagonal
        int maxRight = Math.min(rows, board.length-columns-1);
        for(int i=1;i<=maxRight;i++){
            if(board[rows-i][columns+i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        System.out.println(queens(board,0));
    }
}

