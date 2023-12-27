//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;

public class Problem13 {

    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        //Here we don't add the root node because in a tree there is only a single node.
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()) {

            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null) {
                continue;
            }
            //This means that any one is null and other has some value therefore it is not symmetric
            if(left == null || right == null) {
                return false;
            }
            //If the values of left and right node is not equal then it is not symmetric.
            if (left.val != right.val) {
                return false;
            }

            //left.left must be checked with right.right
            queue.add(left.left);
            queue.add(right.right);

            //Left.right must be checked with right.left
            queue.add(left.right);
            queue.add(right.left);

        }
        return true;
    }

    //Another approach which doesn't uses any extra spaces.
//        public boolean isSymmetric(TreeNode root) {
//            if (root == null) {
//                return true;
//            }
//            return isMirror(root.left, root.right);
//        }
//
//        private boolean isMirror(TreeNode node1, TreeNode node2) {
//            if (node1 == null && node2 == null) {
//                return true;
//            }
//            if (node1 == null || node2 == null) {
//                return false;
//            }
//            return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
//        }
}
