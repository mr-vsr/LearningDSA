package BitwiseOperationsAndMathsRequiredForDsa;
//This program returns the unique element present in an array

public class UniqueElementInArray {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,4,4,5};
        System.out.println(unique(arr));
    }

    public static int unique(int[] arr){
        int unique = 0;
        for(int num:arr){
            unique ^= num;

            // We are taking XOR of all the numbers and as we know that a^a gives us zero therefore it
            // cancel and return the unique element present in the array.This will only work if repeating elements
            // are repeated even number of times
        }
        return unique;
    }
}
