package RecursionAndBacktracking.Pattern;
import java.util.Scanner;
public class P1 {

    static void print(int rows,int columns){
        if(rows==0){
            System.out.print("*");
            return;
        }
        if(rows < columns){
            System.out.println();
            rows--;
            columns = 0;
            print(rows,columns);
        }
        else{
            System.out.print("*");
            columns++;
            print(rows,columns);
        }
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();

         print(rows,0);

    }
}
