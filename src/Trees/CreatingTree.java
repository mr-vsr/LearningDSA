package Trees;

import java.util.Scanner;

public class CreatingTree {
    public CreatingTree() {

    }

    // private class that is helpint us create a node type data structures using
    // which we can implement Binary trees

    private static class Node {

        int value; // Will store the value of the node
        Node left; // Will store the left sub tree
        Node right; // Will store the right sub tree

        // Constructor to assign the value of the node

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root; // root node declaration

    // method to insert the root node

    public void populate(Scanner sc) {
        System.out.println("Enter the root Node");
        int value = sc.nextInt();
        root = new Node(value); // root node initialization

        // Using method overloading to insert the elements to the left and right of side
        // of the tree
        populate(sc, root);
    }
    // method to insert the elements to the root node

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter the data to the left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value to the left of  " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter the data to the right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value to the right of  " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

}
