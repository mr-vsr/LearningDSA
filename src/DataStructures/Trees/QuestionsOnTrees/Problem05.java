//Level order successor of a node

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;


public class Problem05 {
    TreeNode findSuccessor(TreeNode root, int key) {
        //Checking for empty tree
        if (root == null) {
            return null;
        }
        //Queue to keep track of each level
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();//Size of each level
            TreeNode currentNode = queue.poll();
            //Checking for left child if exists pushing it to the queue
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            //Checking for the right child if exists pushing it to the queue
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
            //If the current Node value is equal to key then break for the loop
            if(currentNode.val == key){
                break;
            }
        }
        //Return the first element from the queue that will be the level order successor of the key
        return queue.poll();
    }
}
