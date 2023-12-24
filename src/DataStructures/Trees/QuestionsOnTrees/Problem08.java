//Given the root of a binary tree, imagine yourself standing on the right side of it,
// return the values of the nodes you can see ordered from top to bottom.

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;



public class Problem08 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>(); //Creating a list of list to store the list at each level

        //Checking if the tree exists or not
        if(root == null){
            return result;
        }

        //Using a queue to store the value at each level.
        //This queue is updated at each level elements removed and their left and right added
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);//Adding the root element

        //Performing some action until the queue is empty, which signifies all the elements have been added.
        while(!queue.isEmpty()){
            int levelSize = queue.size();//Number of elements at each level
            for(int i=0;i<levelSize;i++){
                TreeNode currNode = queue.poll();//Getting hold of the first node at that level and then removing it from the queue
                if(i == levelSize-1){
                    result.add(currNode.val);
                }
                //Checking if the left exists or not if exists then adding it to the queue
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                //Checking if the right exists or not if exists then adding it to the queue
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
        }
        return result;
    }
}
