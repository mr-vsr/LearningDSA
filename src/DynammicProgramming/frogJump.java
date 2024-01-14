//Problem statement
//        There is a frog on the '1st' step of an 'N' stairs long staircase.
//        The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the '(i+1)th' stair.
//        If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by
//        absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ).
//        If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to '(i+2)th' stair.
//        Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.
//
//For Example
//        If the given ‘HEIGHT’ array is [10,20,30,10], t
//        he answer 20 as the frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost) and
//        then a jump from 2nd stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.


package DynammicProgramming;
import java.util.* ;


public class frogJump {
    //Top down approach (Memoization)
        public static int frogJump(int n, int heights[]) {
            int[] dp = new int[n+1];
            Arrays.fill(dp,-1);
            return helper(n-1,heights,dp);

        }
        private static int helper(int n,int[] heights, int[] dp){
            if(n == 0) return 0;

            if(dp[n] != -1){
                return dp[n];
            }
            int left = helper(n-1,heights,dp) + Math.abs(heights[n] - heights[n-1]);
            int right = Integer.MAX_VALUE;
            if(n > 1){
                right = helper(n-2,heights,dp) + Math.abs(heights[n] - heights[n-2]);
            }
            return dp[n] = Math.min(left,right);
        }

        //bottom-up approach (Tabulation)
    public static int frogJump2(int n, int heights[]) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            int firstWay = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
            int secondWay = Integer.MAX_VALUE;
            if(i>1){
                secondWay = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            }
            dp[i] = Math.min(firstWay,secondWay);
        }
        return dp[n-1];
    }
    //Space optimized
    public static int frogJump3(int n, int heights[]) {
        int prev = 0;
        int prev2 = 0;

        for(int i=1;i<n;i++){

            int fs = prev + Math.abs(heights[i] - heights[i-1]);

            int ss = Integer.MAX_VALUE;

            if(i>1){
                ss = prev2 + Math.abs(heights[i] - heights[i-2]);
            }

            int curr = Math.min(fs,ss);
            prev2 = prev;
            prev = curr;

        }
        return prev;
    }
}
