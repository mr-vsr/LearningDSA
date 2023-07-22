package SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearch {
   
    //Binary Search algorithm for sorted array in ascending order
    public int Search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int length = arr.length;
        int start = 0, end = length - 1, mid = 0;
        while (start <= end) {
            mid = (start + (end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    //Binary Search algorithm for sorted array in any order 
    public int OrderAgnosticBinarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int end = arr.length - 1, start = 0, mid = 0;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
    
    //Binary Search algorithm recursively
    public int RecBinSearch(int[] arr, int target,int start,int end) {
        if(start>end){
            return -1;
        }
        else {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                RecBinSearch(arr, target, start, mid - 1);
            } else {
                RecBinSearch(arr, target, mid + 1, end);
            }
        }
        return -1;
    }
}

class MainBinSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elments of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();

        sc.close();// closing the scanner object

        BinarySearch ob = new BinarySearch(); // creating the object of the BinarySearch class as the Search method is
                                              // not static so we need to invoke it via an object

        int posi = ob.RecBinSearch(arr, target,0,size-1); // calling the Search method in BinarySearch class via an object

        System.out.println(posi);
    }
}