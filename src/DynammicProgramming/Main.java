package DynammicProgramming;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       int[] dp = {0,1,-1,-1,-1,-1};
        System.out.println(FiboDP.Fibo(5,dp));
        System.out.println(Arrays.toString(dp));
    }
}
