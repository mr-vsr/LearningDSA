package ProgramsOnArrays;

import java.util.Scanner;

public class MaxElement {
    public static int Max(int[] arr) {
        if (arr.length == 0)
            return -1;
        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements in the array");
            arr[i] = sc.nextInt();
        }

        System.out.println(Max(arr));
        sc.close();

    }
}
