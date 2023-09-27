package Recursion.PermutationAndCombination;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++){

            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            permutations(f+ch+l,up.substring(1));
        }
    }

    public static ArrayList<String> PermutReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<=p.length();i++){

            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            ans.addAll(PermutReturn(f+ch+l,up.substring(1)));
        }
        return ans;
    }


    static int permutationsCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            count = count + permutationsCount(f+ch+l,up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
