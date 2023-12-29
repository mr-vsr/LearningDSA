//Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
//According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between
// two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a
// node to be a descendant of itself).”

package DataStructures.Trees.QuestionsOnTrees;

public class Problem16 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){ //If the tree does not exist then return null
            return null;
        }

        if(root == p || root == q){ //If the root itself is one of the element then it is the answer
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);//Looking in the left subtree
        TreeNode right = lowestCommonAncestor(root.right,p,q);//Looking in the right subtree

        if (left != null && right != null) { //If the current node we are at has the left and right child as p and q then
//            it itself is the answer
            return root;
        }
    //Otherwise we have the answer as the node which is not null
        return left == null ? right:left;
    }
}
