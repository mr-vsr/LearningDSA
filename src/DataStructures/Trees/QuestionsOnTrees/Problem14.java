//Given the root of a binary tree, flatten the tree into a "linked list":
//The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list
// and the left child pointer is always null.
//The "linked list" should be in the same order as a pre-order traversal of the binary tree.

package DataStructures.Trees.QuestionsOnTrees;

import com.sun.source.tree.Tree;

import java.util.*;

public class Problem14 {
    public void flatten(TreeNode root) {
        TreeNode currNode = root;
        while(currNode != null){
            if(currNode.left != null){
                TreeNode temp = currNode.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = currNode.right;
                currNode.right = currNode.left;
                currNode.left = null;
            }
            currNode = currNode.right;
        }
    }
}
