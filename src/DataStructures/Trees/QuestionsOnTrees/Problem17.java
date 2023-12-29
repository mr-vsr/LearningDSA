//Given the root of a binary search tree, and an integer k,
// return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;

public class Problem17 {
    //Approach first is using the normal inorder traversal which will give us nodes value in ascending order.
    //we can store that values in an array arraylist and then return the k-1 element as in array we follow the
    //zero based indexing.
//    public int kthSmallest(TreeNode root, int k) {
//        ArrayList<Integer> arr = new ArrayList<>();//storing the values of inorder traversal in arraylist
//        inorder(root,arr);
//
//        return arr.get(k-1);
//
//
//    }
//      //Method to perform the inorder traversal and store the result in an array list
//    private void inorder(TreeNode root,ArrayList<Integer> arrayList){
//        if(root == null){
//            return;
//        }
//        inorder(root.left,arrayList);
//        arrayList.add(root.val);
//        inorder(root.right,arrayList);
//    }

    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root,k).val;
    }
    private TreeNode helper(TreeNode node,int k){
        if(node == null){
            return null;
        }

        TreeNode left = helper(node.left, k);

        if(left != null){
            return left;
        }

        count++;

        if(count == k){
            return node;
        }

        return helper(node.right, k);
    }
}
