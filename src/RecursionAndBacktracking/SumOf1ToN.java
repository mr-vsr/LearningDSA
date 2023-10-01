package RecursionAndBacktracking;

public class SumOf1ToN {
    public static int sum(int n){
        if(n==1){
            return n;
        }
        return n+sum(n-1);
    }
}
