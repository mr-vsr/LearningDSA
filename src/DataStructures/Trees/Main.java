package DataStructures.Trees;

import DataStructures.Trees.BinarySearchTrees.AVL;
import DataStructures.Trees.BinarySearchTrees.BinarySearchTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BinarySearchTree tree = new BinarySearchTree();
//
//        int[] nums = {5,8,2,10,9,7,4};
//
//        tree.populate(nums);
//        tree.display();
//        tree.postOrder();

        AVL tree = new AVL();
        for(int i=0;i<1000;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}
