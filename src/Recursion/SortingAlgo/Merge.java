package Recursion.SortingAlgo;

import java.util.Arrays;

public class Merge {
    public static void merge(int[] leftArr,int[] rightArr, int[] arr){
        int lSize = arr.length/2;
        int rSize = arr.length - lSize;

        int i=0,l=0,r=0;
        while(l<lSize && r<rSize){
            if(leftArr[l] < rightArr[r]){
                arr[i++] = leftArr[l++];
            }
            else{
                arr[i++] = rightArr[r++];
            }
        }
        while(l<lSize){
            arr[i++] = leftArr[l++];
        }
        while(r<rSize){
            arr[i++] = rightArr[r++];
        }
    }
    public static void mergeSort(int[] arr){
        int size = arr.length;
        if(size <= 1){
            return;
        }
        int middle = size/2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[size-middle];
        for(int i=0,j=0;i<size;i++){
            if(i<middle){
                leftArr[i] = arr[i];
            }
            else{
                rightArr[j++] = arr[i];
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr,rightArr,arr);
    }

    public static void main(String[] args){
        int [] arr = {0,5,1,8,3};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
