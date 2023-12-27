//Given the root of a binary tree, return the length of the diameter of the tree.
//The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
// This path may or may not pass through the root.
//The length of a path between two nodes is represented by the number of edges between them.

package DataStructures.Trees.QuestionsOnTrees;

public class Problem12 {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightOfTree(root);
        return diameter-1;
    }

    private int heightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight,rightHeight) + 1;

    }
}
