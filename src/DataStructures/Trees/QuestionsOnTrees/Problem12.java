//Given the root of a binary tree, return the length of the diameter of the tree.
//The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
// This path may or may not pass through the root.
//The length of a path between two nodes is represented by the number of edges between them.

package DataStructures.Trees.QuestionsOnTrees;

public class Problem12 {
    //APPROACH => We find the height of left and right subtrees then we add them and increment the value by 1
    // (signifying the root node). This will be the value of the diameter as we are counting the number of nodes in a path
    //in the tree.
    //Basically we are finding the left most node and the right most node and the path between them is the longest path or the max
    //diameter.
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightOfTree(root);
        return diameter-1;
    }

    private int heightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);//Height of the left subtree
        int rightHeight = heightOfTree(root.right);//Height of the right subtree

        int dia = leftHeight + rightHeight + 1; //Diameter is sum of both left and right subtree + 1
        diameter = Math.max(diameter, dia);//storing the max value in the global value

        return Math.max(leftHeight,rightHeight) + 1;//Now the height is returned
    }
}
