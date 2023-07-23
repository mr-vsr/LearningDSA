package SearchingAlgorithms.ProblemsOnSearching;

public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int k) {
        int start = 0 ,end =0;
        //Finding the range of values that is the minimum possible answer and maximum possible answer.

        //Minimum answer will be when we divide the array into n sub arrays where n is the length of nums and the answer
        // in that case will be the maximum element of the array

        //Maximum answer will be when we divide the array into 1 sub arrays of length n and the answer in that case
        // will be the sum of all elements in the array

        for(int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        //Based on k divisions the answer must lie in the min and max range so we can apply binary search within this range

        //Now as sub arrays are continuous we will start by taking sum of the elements one by one and if the sum exceeds the
        //mid value we will create a new sub array then we will check if the number of pieces are greater than or less than k

        //=> If the number of sub arrays are more than k then it means the answer is too small and hence more divisions.
        //So to increase the answer we need to increase the mid value and therefore move start to mid+1.

        //=> If the number of sub arrays are less than k then it means the possible answer is too big and hence less divisons.
        //So to decrease the possible answer we need to decrease the mid value and therefore move end to mid.

        //Finally when the start and end are equal then that will be our answer therefore return start or end outside the loop
        //as there will always be a possible answer.

        while(start < end){
            int mid = start + (end -start)/2;
            int sum=0, pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    pieces++;
                    sum = num;
                }
                else{
                    sum += num;
                }
            }
            if(pieces  > k){
                start = mid+1;
            }
            else{
                end = mid;
            }

        }
        return end; //Answer will exist when start = end
    }
}
