package RecursionAndBacktracking.SortingAlgo;

import java.util.Arrays;

public class Selection {
    public static void selection(int[] arr,int row, int col, int max){
        if(row == 1){
            return;
        }

        if(row > col){
            if(arr[max] < arr[col]){
                selection(arr,row,col+1,col);
            }else{
                selection(arr,row,col+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max]  = arr[row-1];
            arr[row-1] = temp;
            selection(arr,row-1,0,0);
        }
    }

    public static void main(String[] args){
        int[] arr = {4,1,8,2,0,3};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

}
