//You are given the root of a binary tree containing digits from 0 to 9 only.
//Each root-to-leaf path in the tree represents a number.
//For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
//Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
//A leaf node is a node with no children.
package DataStructures.Trees.QuestionsOnTrees;

public class Problem20 {
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    private int helper(TreeNode root, int sum){
        if(root == null){//If the tree does not exist then the sum is 0 for that tree
            return 0;
        }
        sum = sum * 10 + root.val;//sum is previous sum times 10 plus the current node value
        if(root.left == null && root.right == null){//If it is the root node then that is the required sum
            return sum;
        }
        return helper(root.left, sum) + helper(root.right, sum);//Sum of the left and right sum to get the total value
    }
}
