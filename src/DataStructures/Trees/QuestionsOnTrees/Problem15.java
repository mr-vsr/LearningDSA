//Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//A valid BST is defined as follows:
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.


package DataStructures.Trees.QuestionsOnTrees;

public class Problem15 {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    private boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null){ //If the tree is empty it is a binary tree
            return true;
        }

        //If there exists a low value and the current node value is lesser than that then it is not a bst
        if(low != null && node.val <= low){
            return false;
        }
        //If there exists a high value and the current node value is greater than that then it is not a bst
        if(high != null && node.val >= high){
            return false;
        }

        boolean leftTree = helper(node.left,low,node.val);//Recursively checking up the left tree and setting up the
        //high value as current node's value (as in a bst the left is smaller than or equal to the parent node)
        boolean rightTree = helper(node.right,node.val,high);//Recursively checking up the right tree and setting up the
        //low value as current node's value (as in a bst the right is greater than or equal to the parent node)

        //If both the left and the right subtree returns true that means the complete tree is a bst.
        return leftTree && rightTree;
    }
}
