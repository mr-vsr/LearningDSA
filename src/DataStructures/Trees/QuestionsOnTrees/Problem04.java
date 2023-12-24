//Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
// (i.e., from left to right, then right to left for the next level and alternate between).

//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[20,9],[15,7]]


package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;


public class Problem04 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        //Checking whether the tree exists or not
        if(root == null){
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();//Special type of queue which has the properties that element
        // can be added and removed from start and end in O(1) time;
        deque.offerFirst(root);//Adding the root at the start of the queue

        boolean reverse = false;//To keep account at which level we need to reverse the order

        while(!deque.isEmpty()){
            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>(); //Creating a list of integer to store the value of tree node at this level
            for(int i=0;i<levelSize;i++){
                if(reverse){
                    TreeNode currNode = deque.pollLast();//Remove the element from the last of the queue
                    currentLevel.add(currNode.val);
                    //Checking if the right exists or not if exists then adding it to the queue
                    if(currNode.right != null){
                        deque.offerFirst(currNode.right);//Add the element into the queue at the first
                    }
                    //Checking if the left exists or not if exists then adding it to the queue
                    if(currNode.left != null){
                        deque.offerFirst(currNode.left);//Add the element into the queue at the first
                    }
                }
                else{
                    TreeNode currNode = deque.pollFirst();//Getting hold of the first node at that level and then removing it from the queue
                    currentLevel.add(currNode.val);//Storing its value in the list
                    //Checking if the left exists or not if exists then adding it to the queue
                    if(currNode.left != null){
                        deque.offerLast(currNode.left);//Add the element into the queue at the last
                    }
                    //Checking if the right exists or not if exists then adding it to the queue
                    if(currNode.right != null){
                        deque.offerLast(currNode.right);//Add the element into the queue at the last
                    }
                }
            }
            reverse = !reverse;//Reversing the value to ensure next level it performs the correct operation
            result.add(currentLevel);
        }

    return result;
    }
}
