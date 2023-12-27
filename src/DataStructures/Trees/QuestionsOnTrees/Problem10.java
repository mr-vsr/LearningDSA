//Given an integer array nums where the elements are sorted in ascending order,
// convert it to a height-balanced binary search tree.

package DataStructures.Trees.QuestionsOnTrees;

public class Problem10 {
    public TreeNode sortedArrayToBST(int[] nums) {
        //A helper function to create a binary search tree from a given sorted array.
            return  populatedSorted(nums,0,nums.length-1);
    }
    private TreeNode populatedSorted(int[] nums,int start,int end){
        //If the start is greater than end means we have reached the end and should return.
        if(start > end){
            return null;
        }

        //Finding the middle value of the array that will be the root node for the binary search tree.
        int mid = (start+end)/2;

        //Creating the root node using the middle value of the array.
        TreeNode root = new TreeNode(nums[mid]);

        //Left subtree will be coming from the left hand side of the mid.
        root.left = populatedSorted(nums,start,mid-1);
        //Right subtree will be coming from the right hand side of the mid.
        root.right = populatedSorted(nums,mid+1,end);

        //Returning the root node
        return root;
    }
}
