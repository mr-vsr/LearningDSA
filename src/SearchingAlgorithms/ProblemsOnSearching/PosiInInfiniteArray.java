package SearchingAlgorithms.ProblemsOnSearching;
//Finding the position of an element in a sorted array of infinite length
public class PosiInInfiniteArray {
    public int SearchingInRange(int[] arr,int target){
        int start = 0;
        int end = 1;

        //searching the range to which the target belongs in
        while(target > arr[end]){
            int temp = end + 1; // storing the new start value in temp because we have to use the previous start value
            end = end + (end - start + 1)*2;  // doubling the range for searching
            start = temp; // new start value
        }

        return BinSearch(arr,target,start,end);
    }
    public int BinSearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
