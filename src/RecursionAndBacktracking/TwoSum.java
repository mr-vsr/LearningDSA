package RecursionAndBacktracking;
import java.util.*;

public class TwoSum {
        static void solve(int[] arr, int index, int target, ArrayList<Integer> li) {

            if (target < 0) {
                return;
            }

            if (target == 0) {
                ArrayList<Integer> list = new ArrayList<>(li);
                System.out.println(list);
                return;
            }

            for (int i = index; i < arr.length; i++) {
                li.add(arr[i]);
                solve(arr, i, target - arr[i], li);
                li.remove(li.size() - 1);
            }
        }

        public static void main(String[] args) {
            int[] arr = new int[4];
            arr[0] = 2;
            arr[1] = 3;
            arr[2] = 6;
            arr[3] = 7;
            ArrayList<Integer> list = new ArrayList<>();
            solve(arr, 0, 7, list); // Adjust the target sum as needed
        }
}



