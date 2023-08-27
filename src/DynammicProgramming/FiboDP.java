package DynammicProgramming;

public class FiboDP {
    public static int Fibo(int n , int[] dp){

        if(n<=1){
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n] =  Fibo(n-1,dp) + Fibo(n-2,dp);
    }
    public static int Fibo2(int n){
        int[] dp= new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        if(n<=1){
            return n;
        }
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

