package ProgramsOnArrays;

import java.util.Scanner;
import java.util.Arrays;

public class reverseArray {

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element in the array");
            arr[i] = sc.nextInt();
        }
        sc.close();

        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

}
