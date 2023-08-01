package Recursion;

public class Fibonacci {
    public static int fibo(int n){
        if(n == 1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
