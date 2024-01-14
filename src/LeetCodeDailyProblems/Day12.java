package LeetCodeDailyProblems;
import java.util.*;

public class Day12 {
    public static void main(String[] args) {
        Day12 ob = new Day12();
        System.out.println(ob.lengthOfLongestSubstring("dvdf"));

    }

    //Brute force approach
//    public int lengthOfLongestSubstring(String s) {
//        Stack<Character> st = new Stack<>();
//        int maxLength = 0,count = 0;int firstIndex=0;
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if (st.contains(c)) {
//                count = 0;
//                while (!st.isEmpty()) {
//                    count++;
//                    if(st.peek() == c){
//                        firstIndex = i - count;
//                    }
//                    st.pop();
//                }
//                if(i - firstIndex > 1){
//                    i = firstIndex;
//                }
//                else{
//                    i--;
//                }
//            } else {
//                st.push(c);
//            }
//            maxLength = Math.max(maxLength, st.size());
//        }
//        return maxLength;
//    }

    //Using sliding window approach
    public int lengthOfLongestSubstring(String s) {
        s.toLowerCase();
        int[] lastIndex = new int[26];int maxLength = 0;
        for(int i=0,j=0; j< s.length();j++){
            char c = s.charAt(j);
            int index = c - 'a';
            i = Math.max(lastIndex[index],i);
            maxLength = Math.max(maxLength, j-i+1);
            lastIndex[index] = j+1;
        }
        return maxLength;
    }
}

