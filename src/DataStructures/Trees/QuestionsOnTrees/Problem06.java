//Given the root of a binary tree,
//return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).

package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;

public class Problem06 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>(); //Creating a list of list to store the list at each level

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
            List<Integer> currentLevel = new ArrayList<>(); //Creating a list of integer to store the value of tree node at this level
            for(int i=0;i<levelSize;i++){
                TreeNode currNode = queue.poll();//Getting hold of the first node at that level and then removing it from the queue
                currentLevel.add(currNode.val);//Storing its value in the list
                //Checking if the left exists or not if exists then adding it to the queue
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                //Checking if the right exists or not if exists then adding it to the queue
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }

            //adding the current level list into the final list of list
            result.add(0,currentLevel);//Adding the current level at the zero index causing all other levels to shift towards the left
        }
        return result;
    }
}
