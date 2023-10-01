package RecursionAndBacktracking;

public class ProductOfDigits {
    public static int prodDigits(int num){
        if(num%10==num){
            return num;
        }
        return num%10 * prodDigits(num/10);
    }
}
