package LeetCodeDailyProblems;

public class Day06 {
    public static void main(String[] args) {
        System.out.println(breakInteger(12));
    }
    public static int breakInteger(int num){
        if(num==2) return 1;
        if(num==3) return 2;
        int maxProduct = 1;
        if(num%3==0){
            maxProduct = (int)Math.pow(3,num/3);
        }
        else if(num%3==1){
            maxProduct = (int)Math.pow(3,(num/3)-1)*2*2;
        }
        else{
            maxProduct = 2*(int)Math.pow(3,num/3);
        }
        return maxProduct;
    }
}
