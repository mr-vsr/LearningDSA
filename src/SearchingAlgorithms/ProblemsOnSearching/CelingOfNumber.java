package SearchingAlgorithms.ProblemsOnSearching;

import java.util.Scanner;

public class CelingOfNumber {

    // To find the target value in the array if not found then find the smallest
    // element in the array greater than then target value and return that.

    public int Ceil(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start > end) {
            return -1;
        }
        return arr[start];

    }

}