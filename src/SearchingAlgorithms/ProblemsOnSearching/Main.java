package SearchingAlgorithms.ProblemsOnSearching;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elments of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched or its Floor value to be displayed");
        int target = sc.nextInt();

        sc.close();// closing the scanner object

        PosiInInfiniteArray ob = new PosiInInfiniteArray();

        int ans = ob.SearchingInRange(arr, target);

        System.out.println(ans);
    }
}
