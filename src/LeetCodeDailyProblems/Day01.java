package LeetCodeDailyProblems;

import java.util.Arrays;

public class Day01 {

    //Using Brute force approach
        public static String reverseWords(String s) {

            String[] newS = s.split(" ");
            String str="";

            for(int i=0;i<newS.length;i++){

                str = "";
                for(int j = newS[i].length()-1;j>=0;j--){
                    str += newS[i].charAt(j);
                }
                newS[i] = str;
            }
            s = Arrays.toString(newS);
            return s;
        }

        //Using String builder function

        public String reverseWords2(String s) {
            String[] words = s.split(" ");
            StringBuilder reversed = new StringBuilder();
            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                reversed.append(reversedWord).append(" ");
            }
            return reversed.toString().trim();
        }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));

    }
}
