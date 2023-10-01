package RecursionAndBacktracking.MazeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze {

    //Returns the count of the paths present from the start till last

    public static int pathCount(int rows, int columns) {
        if (rows == 1 || columns == 1) {
            return 1;
        }
        int left = pathCount(rows - 1, columns);
        int right = pathCount(rows, columns - 1);
        return left + right;
    }

    // Prints the path taken from first till last 

    public static void path(String p, int rows, int columns) {
        if (rows == 1 && columns == 1) {
            System.out.println(p);
        }

        if (rows > 1) {
            path(p + "D", rows - 1, columns);
        }
        if (columns > 1) {
            path(p + "R", rows, columns - 1);
        }
    }

    // Returns the path taken from first till last 

    public static List<String> pathRet(String p, int rows, int columns) {
        if (rows == 1 && columns == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        if (rows > 1) {
            ans.addAll(pathRet(p + 'D', rows - 1, columns));
        }
        if (columns > 1) {
            ans.addAll(pathRet(p + 'R', rows, columns - 1));
        }

        return ans;
    }

    //Printing the paths where we can move in three directions right,down and diagonally

    public static void pathWithDiag(String p, int rows, int columns) {
        if (rows == 1 && columns == 1) {
            System.out.println(p);
        }
        if (rows > 1 && columns > 1) {
            pathWithDiag(p + 'd', rows - 1, columns - 1);
        }
        if (rows > 1) {
            pathWithDiag(p + 'D', rows - 1, columns);
        }
        if (columns > 1) {
            pathWithDiag(p + 'R', rows, columns - 1);
        }
    }

    //returning the paths where we can move in three directions right,down and diagonally
       
    public static List<String> pathWithDiagRet(String p,int rows, int columns){
        if(rows==1 && columns==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        if(rows>1 && columns>1){
            ans.addAll(pathWithDiagRet(p+'d',rows-1,columns-1));
        }
        if(rows>1){
            ans.addAll(pathWithDiagRet(p+'D',rows-1,columns));
        }
        if(columns>1){
            ans.addAll(pathWithDiagRet(p+'R',rows,columns-1));
        }
        return ans;
    }

    //Printing the path with obstruction between and the movement are restricted in two directions only

    public static void pathWithRestriction(String p,boolean[][] maze,int rows,int columns){
        if(rows == maze.length-1 && columns==maze[0].length-1){
            System.out.println(p);
        }
        if(!maze[rows][columns]){
            return ;
        }
        if(rows < maze.length-1){
            pathWithRestriction(p+'D',maze,rows+1,columns);
        }
        if(columns<maze[0].length-1){
            pathWithRestriction(p+'R',maze,rows,columns+1);
        }
    }

    //The movement is allowed in all for directions and we are printing the all the paths possible
    public static void pathWithRestrictionAllPaths(String p,boolean[][] maze,int rows,int columns){

        if(rows == maze.length-1 && columns==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[rows][columns]){
            return;
        }

        //adding false to all the visited blocks following a specific path

        maze[rows][columns] = false;

        if(rows < maze.length-1){
            pathWithRestrictionAllPaths(p+'D',maze,rows+1,columns);
        }
        if(columns < maze[0].length-1){
            pathWithRestrictionAllPaths(p+'R',maze,rows,columns+1);
        }
        if(rows > 0){
            pathWithRestrictionAllPaths(p+'U',maze,rows-1,columns);
        }
        if(columns > 0){
            pathWithRestrictionAllPaths(p+'L',maze,rows,columns-1);
        }

        //re-setting all the changes to explore another path

        maze[rows][columns] = true;
    }

    public static void pathWithRestrictionAllPathsVisual(String p,boolean[][] maze,int rows,int columns,int[][] board,int step){

        if(rows == maze.length-1 && columns==maze[0].length-1){
            board[rows][columns] = step;
            for(int[] arr:board){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[rows][columns]){
            return;
        }

        //adding false to all the visited blocks following a specific path
        board[rows][columns] = step;
        maze[rows][columns] = false;

        if(rows < maze.length-1){
            pathWithRestrictionAllPathsVisual(p+'D',maze,rows+1,columns,board,step+1);
        }
        if(columns < maze[0].length-1){
            pathWithRestrictionAllPathsVisual(p+'R',maze,rows,columns+1,board,step+1);
        }
        if(rows > 0){
            pathWithRestrictionAllPathsVisual(p+'U',maze,rows-1,columns,board,step+1);
        }
        if(columns > 0){
            pathWithRestrictionAllPathsVisual(p+'L',maze,rows,columns-1,board,step+1);
        }

        //re-setting all the changes to explore another path
        maze[rows][columns] = true;
        //re-setting the board to zero to show another path
        board[rows][columns] = 0;
    }


    public static void main(String[] args) {
//        System.out.println(pathWithDiagRet("",3,3));
        boolean[][] maze= {
                {true,true,true},
                {true,true,true},
                {true,false,true}
        };
        int[][] board = new int[maze.length][maze[0].length];
        pathWithRestrictionAllPathsVisual("",maze,0,0,board,1);
    }
}
