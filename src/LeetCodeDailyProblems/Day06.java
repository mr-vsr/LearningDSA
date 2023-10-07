package LeetCodeDailyProblems;

public class Day06 {
        public int numOfArrays(int n, int m, int k) {
            int MOD = 1000000007;

            long[][][] dp = new long[n][m][k + 1];

            for (int j = 0; j < m; j++) {
                dp[0][j][1] = 1;
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int l = 1; l <= k; l++) {
                        dp[i][j][l] = dp[i - 1][j][l] * (j + 1) % MOD;

                        for (int prev = 0; prev < j; prev++) {
                            dp[i][j][l] = (dp[i][j][l] + dp[i - 1][prev][l - 1]) % MOD;
                        }
                    }
                }
            }

            long result = 0;
            for (int j = 0; j < m; j++) {
                result = (result + dp[n - 1][j][k]) % MOD;
            }

            return (int) result;
        }
    }
