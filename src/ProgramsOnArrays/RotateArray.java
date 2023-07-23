package ProgramsOnArrays;

//RightRotate

//Given an Array rotate the array to k steps [1,2,3,4,5,6,7]
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

import java.util.Arrays;

public class RotateArray {


    // Time complexity is O(n^2)
//    public void rotate(int[] nums, int k) {
//        int end = nums.length-1;
//        int LoopVar = k % nums.length;
//
//        for(int i = 0; i<LoopVar; i++){
//            int temp = nums[end];
//            for(int j=0; j<end ;j++){
//                nums[end-j] = nums[end-(j+1)];
//            }
//            nums[0] = temp;
//        }
//
//    }

    //Time complexity is O(2N) and space complexity is O(1) one more method where time complexity
    // is O(N+k) but space complexity is O(k)

    public void rotateRight(int[] nums , int k){

        int loopVar = k % nums.length;
        int end = nums.length-1;

        reverseArray.reverse(nums,0,end-loopVar);
        reverseArray.reverse(nums,end-loopVar+1, end);
        reverseArray.reverse(nums,0, end);
    }

    public void rotateLeft(int[] nums , int k){

        int loopVar = k % nums.length;
        int end = nums.length-1;

        reverseArray.reverse(nums,0,loopVar-1);
        System.out.println(Arrays.toString(nums));
        reverseArray.reverse(nums,loopVar, end);
        System.out.println(Arrays.toString(nums));
        reverseArray.reverse(nums,0, end);
        System.out.println(Arrays.toString(nums));
    }

}
