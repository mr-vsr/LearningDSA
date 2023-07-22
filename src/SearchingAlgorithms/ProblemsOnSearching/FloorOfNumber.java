package SearchingAlgorithms.ProblemsOnSearching;

import java.util.Scanner;

public class FloorOfNumber {
    public int Floor(int[] arr, int target) {
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
        if (end < 0) {
            return -1;
        }
        return arr[end];

    }

}
