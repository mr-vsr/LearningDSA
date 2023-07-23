package ProgramsOnArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RotateArray ob = new RotateArray();

        int[] nums = {1,2,3,4,5,6,7};
        int k = 15;
        ob.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
