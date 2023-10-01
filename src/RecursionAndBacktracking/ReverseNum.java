package RecursionAndBacktracking;

public class ReverseNum {
    public static int rev1(int num,int revNum){
        if(num==0){
            return revNum;
        }
        revNum = revNum*10 + num%10;
        return rev1(num/10,revNum);
    }
    public static int rev2(int num){
//        int digits = (int)Math.log10(num)+1;
        return helper(num,(int)Math.log10(num)+1);
    }
    public static int helper(int num , int digits){
        if(num%10==num){
            return num;
        }
        return num%10* (int)Math.pow(10,digits-1) + helper(num/10,digits-1);
    }

    public static int rev3(int num){
        int digits = (int)Math.log10(num)+1;
        if(digits == 1){
            return num;
        }
        int rem = num%10;
        return rem * (int)Math.pow(10,digits-1)+rev3(num/10);
    }
}
