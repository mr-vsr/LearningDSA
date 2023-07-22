package SearchingAlgorithms;
import java.util.Scanner;

public class LinearSearch {
    public int Search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

class MainLinear {
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
        
        sc.close();//closing the scanner  object 
        
        LinearSearch ob = new LinearSearch(); //creating the object of the LinearSearch class as the Search method is not static so we need to invoke it via an object
        
        int posi = ob.Search(arr, target); //calling the Search method in LinearSearch class via an object

        System.out.println(posi);
    }
}