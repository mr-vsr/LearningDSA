//Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree
// and inorder is the inorder traversal of the same tree, construct and return the binary tree.

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;

public class Problem18 {
    //APPROACH => Picking up the root node from the preorder array. Then finding the index of the root node in Inorder array.
    //After that making two arrays for preorder and inorder to distinguish between the left and right part of the subtree.
    //Then recursively calling the left and right to make the tree.
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0) {//If the length of preorder array is zero means no tree to construct
            return null;
        }

        int r = preorder[0];//The first element of preorder array will be the root node.
        int index = 0;//Index position for checking

        for(int i=0; i<inorder.length; i++) {
            if(inorder[i] == r) {//Searching for the root in inorder array to find its index.
                index = i;
            }
        }

        TreeNode node = new TreeNode(r);//Creating the root node.

        node.left = buildTree(Arrays.copyOfRange
                (preorder, 1, index + 1), Arrays.copyOfRange(inorder,0,index));//Recursively constructing the left
        //subtree.
        node.right = buildTree(Arrays.copyOfRange
                (preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));
        //Recursively constructing the right subtree.

        return node;
    }
}
