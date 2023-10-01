package RecursionAndBacktracking;

//Subsequences with iterative approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterativeApproach {
    static List<List<Integer>> subset(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }


// function that return subsequences for repeating numbers in array


    static List<List<Integer>> subsetDuplicate(int[] arr){

        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0,end = 0;

        for(int i=0;i<arr.length;i++){

            start = 0;

            if(i>0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1 ;
            int n = outer.size();

            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2};
        List<List<Integer>> list = subsetDuplicate(arr);
        for(List<Integer> list1:list ){
            System.out.println(list1);
        }

    }
}
