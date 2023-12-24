//You are given a perfect binary tree where all leaves are on the same level,
// and every parent has two children. The binary tree has the following definition:
//        struct Node {
//        int val;
//        Node *left;
//        Node *right;
//        Node *next;
//        }
//Populate each next pointer to point to its next right node. If there is no next right node,
// the next pointer should be set to NULL.
//Initially, all next pointers are set to NULL.

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;


public class Problem07 {
    public Node connect(Node root) {
        //Checking for empty tree
        if(root == null){
            return null;
        }

        Node leftMost = root;//Storing the left most nodes
        //As it is complete binary tree therefore if the left does not exist then it is the leaf node
        while(leftMost.left != null){
            Node currNode = leftMost;//Storing the current node

            //While the current node is not null perform some operation
            while(currNode != null){
                currNode.left.next = currNode.right; //Establish the link between the left and right child
                if(currNode.next != null){ //until all the links in the level are established
                    currNode.right.next = currNode.next.left;//Establishing the link between right child of left child and
//                    left child of right child
                }
                currNode = currNode.next;//Now moving to the next node in the level
            }
            leftMost = leftMost.left;//Moving to the next level
        }
        return root;
    }
}
