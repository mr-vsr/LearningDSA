package Recursion;

public class sample {

    public static void countPalindronic(String str,int N) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j++) {
                String s = str.substring(i, j);
                StringBuffer a = new StringBuffer(s);
                a.reverse();
                if (s.equals(a.toString())) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) {
        countPalindronic("abbaeae",2);
    }
}
