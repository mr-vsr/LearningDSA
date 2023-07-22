package SearchingAlgorithms.ProblemsOnSearching;

  interface MountainArray {
    public int get(int index);
     public int length();
 }

public class MountainArrayC {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int start = 0,end = mountainArr.length();

        while(start<end){
            int mid = start + (end -start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end = mid ;
            }
            else{
                start = mid+1;
            }
        }

        int index = OrderAgnosticBinarySearch(mountainArr,0,end,target);
        if(index != -1){
            return index;
        }
        else{
            index = OrderAgnosticBinarySearch(mountainArr,end+1,mountainArr.length(),target);
            return index;
        }
    }

    public int OrderAgnosticBinarySearch(MountainArray mountainArr,int start,int end, int target) {
        if (mountainArr.length() == 0) {
            return -1;
        }
        int mid = 0;
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            }
            if (isAsc) {
                if (mountainArr.get(mid) > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (mountainArr.get(mid) < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
}
