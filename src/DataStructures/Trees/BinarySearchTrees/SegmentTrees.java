package DataStructures.Trees.BinarySearchTrees;

public class SegmentTrees {
    private static class Node {
        int data; //For storing the sum of the range specified
        int startInterval; //Starting index
        int endInterval; //End index
        Node left; //Store the left part of the segment tree
        Node right; //Store the right part of the segment tree


        //Constructor to initialize the start and end index positions when a new node is created
        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }


    Node root; // Will store the root node of the segment tree

    public SegmentTrees(int[] arr){
        root = constructSegmentTree(arr,0,arr.length-1);
    }

    //Function to construct a segment tree with a given range and set of values
    private Node constructSegmentTree(int[] arr,int start, int end){
        if(start == end){  //This will represent all the leaf nodes where the data will be the value itself
            Node leaf = new Node(start,end);  //Create a new leaf node
            leaf.data = arr[start]; //Insert the data value
            return leaf; // Return the leaf node
        }

        //Create a node at the range of index you are at
        Node node = new Node(start, end);
        int mid = (start+end)/2; //Break that range into two parts

        node.left = this.constructSegmentTree(arr,start,mid); //The left part of the range
        node.right = this.constructSegmentTree(arr,mid+1,end); // The right part of the range

        node.data = node.left.data + node.right.data; //The data value will be the sum of the range.
        //Take the sum of range of values of left and sum of range of values of right

        return node;
    }

    //Function to display the created segment tree
    public void display(){
        display(this.root);
    }
    //Helper function
    private void display(Node node){
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    //Function to get the query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei) {
        if(node.startInterval >= qsi && node.endInterval <= qei) {
            // node is completely lying inside query therefore take the data value and use it
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            // lying completely outside the query ignore this value and return default value
            return 0;
        } else { //The query values overlap with the range
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }
    // update
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }
    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval){ //Index completely inside the range
            if(index == node.startInterval && index == node.endInterval) { //Got the leaf node where we need to update the values
                node.data = value; //updating the value
                return node.data; //returning the updated value
            } else { //index is not inside this range then call left or right sub child and
                // update the value there if we find the correct index
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns; //Update the value everywhere

                return node.data; //return the updated value
            }
        }
        return node.data; //return the existing value
    }

}
