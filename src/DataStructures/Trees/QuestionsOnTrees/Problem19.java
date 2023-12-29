//Given the root of a binary tree and an integer targetSum,
// return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
//A leaf is a node with no children.
package DataStructures.Trees.QuestionsOnTrees;

public class Problem19 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){//If the tree does not exist then the sum has no meaning hence false
            return false;
        }

        if(root.val == targetSum && root.left == null && root.right == null){//Checking if it is the root value, if yes
            //then check for the sum value if both matches then we have a path.
            return true;
        }

        //Look for the path in the left and right subtree.
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
