package SearchingAlgorithms.ProblemsOnSearching;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {

        int piv = pivot(nums);

        //Not rotated array but a normal ascending order array
        if(piv==-1){
            return BinSearch(nums,0,nums.length-1,target);
        }
        if(nums[piv] == target){
            return piv;
        } else if (nums[0] > target) {
            return BinSearch(nums,piv+1, nums.length-1,target );
        }
        else{
            return BinSearch(nums,0,piv-1,target);
        }
    }
    public int pivot(int[] nums){
        int start = 0,end = nums.length;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid-1] > nums[mid]){
                return mid-1;
            }
            if(nums[start] >= nums[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int BinSearch(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
