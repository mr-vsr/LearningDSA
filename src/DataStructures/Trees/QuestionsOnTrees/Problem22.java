//Serialization is the process of converting a data structure or object into a sequence of bits so that it
// can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed
// later in the same or another computer environment.
//
//Design an algorithm to serialize and deserialize a binary tree.
// There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure
// that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
//
//Clarification: The input/output format is the same as how LeetCode serializes a binary tree.
// You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.


package DataStructures.Trees.QuestionsOnTrees;
import java.util.*;

public class Problem22 {
    public List<String> serialize(Node node) {
        List<String> list = new ArrayList<>();
        helper(node, list);
        return list;
    }
    void helper(Node node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right, list);
    }

    Node deserialize(List<String> list) {
        Collections.reverse(list);
        Node node = helper2(list);
        return node;
    }
    Node helper2(List<String> list) {
        String val = list.remove(list.size() - 1);

        if (val.charAt(0) == 'n') {
            return null;
        }

        Node node = new Node(Integer.parseInt(val));

        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }
}
