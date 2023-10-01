package RecursionAndBacktracking;

public class Print1ToN {
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }

}
