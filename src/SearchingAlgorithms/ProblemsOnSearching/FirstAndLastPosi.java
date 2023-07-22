package SearchingAlgorithms.ProblemsOnSearching;

public class FirstAndLastPosi {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = BinSearch(nums,target,true);
        if(ans[0]!=-1) {
            ans[1] = BinSearch(nums, target, false);
        }
        return ans;
    }
    public int BinSearch(int[] nums,int target,boolean isStartIndex){
        int start = 0,end=nums.length-1,mid=0;
        int ans = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            } else if (target<nums[mid]) {
                end = mid -1;
            }
            else{
                ans = mid;
                if(isStartIndex){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
