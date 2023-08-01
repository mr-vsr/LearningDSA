package Recursion;

public class CountNoOfZeroes {
    public static int count(int n){
        if(n%10==n){
            if(n==0) {
                return 1;
            }
            else{
                return 0;
            }
        }
            if(n%10==0){
                return 1 + count(n/10);
            }
            return count(n/10);
    }
}
