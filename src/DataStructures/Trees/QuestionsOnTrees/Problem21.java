//A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them.
// A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
//The path sum of a path is the sum of the node's values in the path.
//Given the root of a binary tree, return the maximum path sum of any non-empty path.

package DataStructures.Trees.QuestionsOnTrees;

public class Problem21 {
    int ans = Integer.MIN_VALUE;//Storing the maximum path value
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    private int helper(TreeNode root){
        if(root == null){//If the node value is null then we must return 0.
            return 0;
        }
        int left = helper(root.left);//Navigating the left subtree to get the max path sum from left part of the subtree.
        int right = helper(root.right);//Navigating the right subtree to get the max path sum from the right part of the subtree.

        left = Math.max(0,left);//If left is negative then make it zero.
        right = Math.max(0,right);//If right is negative then make it zero.

        int pathSum = left + right + root.val;//This is the current path sum.

        ans = Math.max(pathSum,ans);//Checking if we already have a maximum path or current path is the maximum path.
        return Math.max(left, right) + root.val;//Returning the max of the left and right plus the root value's sum for a path.
    }

    //While traversing a long path it will also update the answer with shorter path if the sum is greater and we may already
    //have our answer stored in the ans variable.
}
