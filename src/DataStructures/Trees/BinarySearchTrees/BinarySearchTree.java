package DataStructures.Trees.BinarySearchTrees;

public class BinarySearchTree {
    class Node{
        private int value;  //To store the value of the bst
        private Node left;  //To store the left sub child of the bst
        private Node right; //To store the right sub child of the bst
        private int height; //To store the height of the bst. Can come in handy
        // if we try to convert unbalanced bst to balanced one

        //Constructor of the Node class to assign the value of the bst
        public Node(int value){
            this.value = value;
        }

        //A getter method to fetch the value of the node.
        public int getValue(){
            return this.value;
        }
    }


    private Node root; //Node type variable to store the root node position.

    //Constructor of the parent class.
    public BinarySearchTree(){

    }

    //Function to get the height of the subtree.
    public int height() {
        return height(root);
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    //Function to check whether the given root node is empty or not.
    public boolean isEmpty(){
        return root==null;
    }

    //Display function to display the bst
    public void display(){
        display(root, "Root Node: ");
    }

    //A helper display function to print the bst.
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());

        //Recursively printing the left and right subtrees of the bst starting from the root.


        //Displaying the left subtree.
        display(node.left,"Left Child of " + node.getValue()+": ");

        //Displaying the right subtree.
        display(node.right,"Right Child of " + node.getValue()+": ");
    }

    //Inserting values into the binary search tree.
    public void insert(int value){
        root = insert(value,root);
    }

    //Helper function to insert values into the bst.
    private Node insert(int value, Node node){
        //Checking whether the value is to be inserted that has a node or not if not we're creating a node and inserting
        //value in that node and then returning that node.
        if(node==null){
            node = new Node(value);
            return node;
        }

        //Checking whether the value will be to left or not if yes then making it left child by recursively calling the
        //left subtree until we reach the position where the node is to be inserted.
        if(value < node.value){
            node.left = insert(value,node.left);
        }

        //Checking whether the value will be to right or not if yes then making it left child by recursively calling the
        //right subtree until we reach the position where the node is to be inserted.
        else{
            node.right = insert(value,node.right);
        }

        //Calculating the height of the subtree by adding 1 to the max height of the left or right subtree.
        node.height = Math.max(height(node.left),height(node.right))+1;

        //Returning the same node so that the position does not change while going up the stack of the recursive calls.
        //Making sure all the nodes are at their respective positions.
        return node;
    }

    //Checking whether the tree is balanced or not
    public boolean balanced(){
        return balanced(root);
    }
    //Helper function to check whether the bst is balanced or not.
    private boolean balanced(Node node){
        //If the bst is empty we consider it balanced.
        if(node==null){
            return true;
        }

        //If the bst is not null then we check the height difference of the left and right subtree, if it's less than or equal to 1
        //we consider the tree to be balanced. The above condition must hold true for all the nodes therefore the additional recursive call
        //To check the node.left and node.right.

        return Math.abs(height(node.left)- height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    //A function to insert multiple values into the bst at a time rather than giving it from the command line
    public void populate(int [] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }

    //Making a balanced bst for a sorted array
    public void populatedSorted(int [] nums){
        populatedSorted(nums,0,nums.length);
    }

    //Helper function to do the necessary changes
    private void populatedSorted(int [] nums , int start , int end){
        if(start >= end){
            return;
        }

        int mid = (start+end)/2;

        //Dividing the sorted array into two parts then taking the middle element as the root node and then elements to the
        //left side of the array are part of the left subtree and to the right are part of the right subtree.

        populatedSorted(nums,start,mid); //Left subtree
        populatedSorted(nums,mid+1,end); //Right subtree

    }

    //Tree traversal algorithms

    //Post Order tree traversal
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value);

        preOrder(node.left);
        preOrder(node.right);

    }

    //In Order tree traversal
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    //PostOrder tree traversal
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }
}
