package pattern;
import java.util.Scanner;


public class P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j);
            }
//           for(int j=1;j<=i;j++){
//               System.out.print(i+j-1);
//           }
            System.out.println();
        }
    }
}


//        1234554321
//        1234**1234
//        123****123
//        12******12
//        1********1
