package LeetCodeDailyProblems;

public class Pattern132 {
        public static boolean find132pattern(int[] nums) {
            if (nums.length < 3) {
                return false;
            }
            for(int i=0;i<nums.length-1;i++) {
                if (nums[i] < nums[i + 1]) {
                    for (int j = i + 1; j < nums.length - 1; j++) {
                        for (int k = j + 1; k < nums.length; k++) {
                            if (nums[i] < nums[k] && nums[j] > nums[k]) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }



    public static void main(String[] args) {
        int[] nums = {3,5,0,3,4};
        System.out.println(find132pattern(nums));
    }
    }
