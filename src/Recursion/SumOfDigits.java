package Recursion;

public class SumOfDigits {
    public static int sumDigits(int num){
        if(num%10==num){
            return num;
        }
        return num%10+sumDigits(num/10);
    }
}
