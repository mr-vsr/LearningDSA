//Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;

public class Problem01 {
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        //Checking whether the tree exists or not
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);//Root added in the queue

        while(!queue.isEmpty()){
           int levelSize = queue.size();//The level size
           int maxVal = Integer.MIN_VALUE;//To store the min value possible for type integer

           for(int i=0;i<levelSize;i++){
               TreeNode currNode = queue.poll();//Removes the element from the queue
               maxVal = Math.max(maxVal, currNode.val);//Stores the max value at the level

               //Checking if the left exists or not if exists then adding it to the queue
               if(currNode.left != null){
                   queue.offer(currNode.left);
               }
               //Checking if the right exists or not if exists then adding it to the queue
               if(currNode.right != null){
                    queue.offer(currNode.right);
               }
           }
            result.add(maxVal);
        }
        return result;
    }
}
