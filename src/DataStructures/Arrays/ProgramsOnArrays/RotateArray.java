package DataStructures.Arrays.ProgramsOnArrays;

//RightRotate

//Given an Array rotate the array to k steps [1,2,3,4,5,6,7]
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

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

    //LeftRotate

    //Given an Array rotate the array to k steps [1,2,3,4,5,6,7]
    //rotate 1 steps to the right: [2,3,4,5,6,7,1]
    //rotate 2 steps to the right: [3,4,5,6,7,1,2]
    //rotate 3 steps to the right: [4,5,6,7,1,2,3]
    public void rotate(int[] nums, int k) {
        int end = nums.length-1;
        int LoopVar = k % nums.length;

        for(int i = 0; i<LoopVar; i++){

            int temp = nums[0];

            for(int j=0; j<end ;j++){
                nums[j] = nums[j+1];
            }
            nums[end] = temp;
        }

    }
    public void rotateLeft(int[] nums , int k){

        int loopVar = k % nums.length;
        int end = nums.length-1;

        reverseArray.reverse(nums,0,loopVar-1);
        reverseArray.reverse(nums,loopVar, end);
        reverseArray.reverse(nums,0, end);
    }

}
