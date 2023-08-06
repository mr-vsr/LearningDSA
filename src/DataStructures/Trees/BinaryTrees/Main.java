package DataStructures.Trees.BinaryTrees;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreatingTree tree = new CreatingTree();
        tree.populate(sc);
        tree.display();
    }
}
