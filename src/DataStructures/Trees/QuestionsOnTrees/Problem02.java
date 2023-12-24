//Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
// Answers within 10-5 of the actual answer will be accepted.

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;

public class Problem02 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();//List of type double to store the average value at each level
        //Checking whether the tree exists or not
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue  = new LinkedList<>();//Creating a queue of type tree node to store the nodes at each level
        queue.offer(root);//Adding the root node

        while(!queue.isEmpty()){
            int levelSize = queue.size();//Storing the number of node at each level
            double sumAtCurrLevel=0;//Will store the value of sum at each levle
            for(int i=0;i<levelSize;i++){
                TreeNode currNode = queue.poll();//Removing the elements from the queue
                sumAtCurrLevel += currNode.val;//summation operation

                //Checking if the left exists or not if exists then adding it to the queue
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                //Checking if the right exists or not if exists then adding it to the queue
                if(currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
            result.add(sumAtCurrLevel/levelSize);
        }
        return result;
    }
}
