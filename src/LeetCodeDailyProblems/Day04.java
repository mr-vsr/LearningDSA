package LeetCodeDailyProblems;

import java.util.ArrayList;
import java.util.List;

public class Day04 {
        public static List<Integer> majorityElement(int[] nums) {
            int n = nums.length/3,count;
            List<Integer> ans = new ArrayList<>();
            for(int num:nums){
                count = 0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==num){
                        count++;
                    }
                }
                if(n<count && !ans.contains(num)){
                    ans.add(num);
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
    }
