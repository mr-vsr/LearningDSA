//Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y,
// return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
//Two nodes of a binary tree are cousins if they have the same depth with different parents.
//Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.

package DataStructures.Trees.QuestionsOnTrees;

public class Problem09 {
    //Function to find if the given two values are cousins or not
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);//Finding the corresponding node from the tree
        TreeNode yy = findNode(root, y);//Finding the corresponding node from the tree

        //Cousins means level must be same and must not have common parent
        return (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy));
    }

    //Function to find the node corresponding to the value
    TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }
        //Is the root node corresponds to the given value?
        if (node.val == x) {
            return node;//returning the root node
        }
        //Search on the left side of the tree
        TreeNode n = findNode(node.left, x);
        //If do exist on the left side return the corresponding node.
        if (n != null) {
            return n;
        }

        //Find on the right hand side (recursively).
        return findNode(node.right, x);
    }

    //Function to find whether two given nodes are siblings or not
    boolean isSibling (TreeNode node, TreeNode x, TreeNode y) {
        //If the tree exists or not.
        if (node == null) {
            return false;
        }

        //Basic comparison and recursion to check for common ancestor
        return (
                (node.left == x && node.right == y) || (node.left == y && node.right == x)
                        || isSibling(node.left, x, y) || isSibling(node.right, x, y)
        );
    }

    //Function to find the level of the given node
    int level (TreeNode node, TreeNode x, int lev) {
        //To check if the tree is empty or not
        if(node == null) {
            return 0;
        }
//    If the root node is our value of interest then return its level
        if(node == x) {
            return lev;
        }
// Check for the node of interest in the left subtree
        int l = level(node.left, x, lev+1);
        if (l != 0) {//If found return its level
            return l;
        }
        //Recursively checking in the right subtree and then returning its level
        return level(node.right, x, lev+1);
    }
}
