package DataStructures.LinkedList;

public class SinglyLinkedList {
    private Node head ;
    private Node tail;
    private int size;
    public SinglyLinkedList(){
        this.size = 0;
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

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if(tail==null){
            tail = head;
        }
        size +=1;
    }
    public void insertLast(int data){
        if(tail==null){
            insertFirst(data);
        }

        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;

    }
    public void insert(int data,int index){
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertLast(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp =  temp.next;
        }
        Node newNode = new Node(data,temp.next);
        temp.next = newNode;
        size++;
    }
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head==null){
            tail  = null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node prevNode = get(size-2);
        int val = tail.value;
        tail = prevNode;
        tail.next = null;

        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }
    public Node get(int index){
        Node node = head;
        for(int i=1;i<=index;i++){
            node = node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
