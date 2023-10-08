package DataStructures.LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public void insert(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void delete(int val){
        Node node = head;

        if(node==null){
            return;
        }

        if(node.value == val){
            head = head.next;
            tail.next = head;
        }

        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }
    public void display(){
        Node node = head;
        do{
            System.out.print(node.value+" -> ");
            node = node.next;
        }while(node!=head);
        System.out.println("HEAD");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
