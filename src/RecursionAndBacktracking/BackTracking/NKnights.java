package RecursionAndBacktracking.BackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board,0,0,4);

    }

    public static void knight(boolean[][] board,int rows,int columns,int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }

        if(rows == board.length-1 && columns == board.length){
            return;
        }

        if(columns == board.length){
            knight(board,rows+1,0,knights);
            return;
        }

        if(isSafe(board,rows,columns)){
            board[rows][columns] = true;
            knight(board,rows,columns+1,knights-1);
            board[rows][columns] = false;
        }

        knight(board,rows,columns+1,knights);
    }

    private static boolean isSafe(boolean[][] board,int rows,int columns){

        if(isValid(board,rows-2,columns-1)){
            if(board[rows-2][columns-1]){
                return false;
            }
        }
        if(isValid(board,rows-2,columns+1)){
            if(board[rows-2][columns+1]){
                return false;
            }
        }
        if(isValid(board,rows-1,columns-2)){
            if(board[rows-1][columns-2]){
                return false;
            }
        }
        if(isValid(board,rows-1,columns+2)){
            if(board[rows-1][columns+2]){
                return false;
            }
        }
        return true;
    }
    private static boolean isValid(boolean[][] board,int rows,int columns){
        if(rows >=0 && rows< board.length && columns >=0 && columns< board.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean col : row) {
                if (col) {
                    System.out.print("K ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
