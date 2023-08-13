package DynammicProgramming;

public class FiboDP {
    public static int Fibo(int n , int[] dp){

        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n] =  Fibo(n-1,dp) + Fibo(n-2,dp);
    }
}

