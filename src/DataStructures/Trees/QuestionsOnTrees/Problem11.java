//Given the root of a binary tree, invert the tree, and return its root.

package DataStructures.Trees.QuestionsOnTrees;

public class Problem11 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode leftNode = invertTree(root.left);//Using recursion to reach the end of the left subtree
        TreeNode rightNode = invertTree(root.right);//Using recursion to reach the end of the right subtree

        //Swapping the left and the right child
        root.left = rightNode;
        root.right = leftNode;

        return root;//Returning the parent node or the root node
    }
}
