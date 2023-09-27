package Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p,up.substring(1));
        subseq(p+ch,up.substring(1));
    }

    public static ArrayList<String> subSeq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p+ch,up.substring(1));
        ArrayList<String> right = subSeq(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String p = "";
        String up = "abc";

        System.out.println(subSeq(p,up));
        subseq(p,up);
    }
}
