package DynammicProgramming;
import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void findSubsetSum(int[] set, int targetSum) {
        int n = set.length;
        boolean[][] dp = new boolean[n + 1][targetSum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= targetSum; j++) {
                if (j >= set[i - 1]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - set[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        if (!dp[n][targetSum]) {
            System.out.println("No solution found.");
            return;
        }

        System.out.println("Solutions:");

        List<Integer> subset = new ArrayList<>();
        findSubset(dp, set, n, targetSum, subset);

    }

    public static void findSubset(boolean[][] dp, int[] set, int i, int j, List<Integer> subset) {
        if (i == 0 && j == 0) {
            System.out.println(subset);
            return;
        }

        if (i > 0 && dp[i - 1][j]) {
            List<Integer> newSubset = new ArrayList<>(subset);
            findSubset(dp, set, i - 1, j, newSubset);
        }

        if (i > 0 && j >= set[i - 1] && dp[i - 1][j - set[i - 1]]) {
            subset.add(set[i - 1]);
            findSubset(dp, set, i - 1, j - set[i - 1], subset);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] set = {1, 2, 5, 6, 8};
        int targetSum = 9;

        findSubsetSum(set, targetSum);
    }
}
