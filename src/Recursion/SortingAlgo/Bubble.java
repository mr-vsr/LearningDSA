package Recursion.SortingAlgo;

import java.util.Arrays;

public class Bubble {
    public static void bubble(int[] arr,int row, int col){
        if(row == 0){
            return;
        }
        if(row > col && col < arr.length-1){
            if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
                bubble(arr,row,col+1);
        }
        else{
            bubble(arr,row-1,0);
        }
    }
    public static void main(String[] args){
        int[] arr = {2,4,5,9,1,0};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
